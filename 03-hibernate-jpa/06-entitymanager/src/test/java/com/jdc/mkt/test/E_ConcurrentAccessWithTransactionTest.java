package com.jdc.mkt.test;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Account;

public class E_ConcurrentAccessWithTransactionTest extends JpaFactory {

	@Test
	void test() {
		var first = firstOperation(50000.00);
		var second = secondOperation(20000.00);

		first.start();
		second.start();

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private Thread firstOperation(double balance) {

		return new Thread(() -> {
			var em = emf.createEntityManager();

			var account = em.find(Account.class, 1);
			try {
				em.getTransaction().begin();

				System.out.println("====== First Operation ==========");
				System.out.println("    =====(First) Before update ======");

				System.out.println("(First)Before Balance === > " + account.getBalance());

				Thread.sleep(800);
				
				if (account.getBalance() < balance) {
					throw new RuntimeException("There is not enough balance !");
				}
				
				account.setBalance(account.getBalance() - balance);
				em.flush();

				System.out.println();

				System.out.println("    ===== (First)After update ======");
				System.out.println("(First)After Balance === > " + account.getBalance());

				em.getTransaction().commit();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			} catch (RuntimeException e) {
				em.getTransaction().rollback();
				System.out.println(e.getMessage());
			}


			
			em.close();
		});
	}

	private Thread secondOperation(double balance) {

		return new Thread(() -> {
			var em = emf.createEntityManager();

			var account = em.find(Account.class, 1);
			try {

				em.getTransaction().begin();

				System.out.println("====== Second Operation ==========");
				System.out.println("    =====(Second) Before update ======");

				System.out.println("(Second)Before Balance === > " + account.getBalance());

				Thread.sleep(1000);
				em.refresh(account);

				if (account.getBalance() < balance) {
					throw new RuntimeException("There is not enough balance !");
				}
				account.setBalance(account.getBalance() - balance);
				System.out.println();

				System.out.println("    =====(Second) After update ======");
				System.out.println("(Second)After Balance === > " + account.getBalance());

				em.getTransaction().commit();

			} catch (InterruptedException e) {
				e.printStackTrace();

			} catch (RuntimeException e) {
				em.getTransaction().rollback();
				System.out.println(e.getMessage());
			}

			em.close();
		});
	}
}
