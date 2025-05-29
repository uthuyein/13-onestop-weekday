package com.jdc.mkt.services;

public interface DbServiceInt<T> {

	void save(T p);
	void delete(int id);
	void update(T p);
	T[] select();
}
