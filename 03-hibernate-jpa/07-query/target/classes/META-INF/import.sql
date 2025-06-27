insert into passengers_tbl(id,name,email,phone) values (1,'Andrew','andrew@gmail.com','092342342');
insert into passengers_tbl(id,name,email,phone) values (2,'William','william@gmail.com','098845345');
insert into passengers_tbl(id,name,email,phone) values (3,'Kelvin','kelvin@gmail.com','09332222');
insert into passengers_tbl(id,name,email,phone) values (4,'Samlew','samlew@gmail.com','0933434343');
insert into passengers_tbl(id,name,email,phone) values (5,'Arnel','arnel@gmail.com','0986734343');

insert into addresses_tbl(state,township,street) values ('Mandalay','Maharmyaing','37st bet 68 and 69');
insert into addresses_tbl(state,township,street) values ('Mandalay','ChanMyaTharZi','102st bet 68 and 69');
insert into addresses_tbl(state,township,street) values ('Mandalay','AungMyayTharZan','19st bet 72 and 73');
insert into addresses_tbl(state,township,street) values ('Yangon','Yankin','no12 third floor');
insert into addresses_tbl(state,township,street) values ('Yangon','Sanchaung','n0122 second floor');

insert into licences_tbl(id,licenceNumber,licenceType,bloodType,dob,issueDate,validDate)values(1,'AA34333','C','A','1990-10-11','2006-11-21','2011-10-12');

insert into drivers_tbl(id,name,gender,email,phone,addresses_id,licences_id)values(1,'AungKo','MALE','aungko@gmail.com','09222222',1,1);