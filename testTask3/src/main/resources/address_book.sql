create table  IF NOT EXISTS address_book
(address_book_id serial,
  name varchar(50) not null,
  region varchar(50) not null,
  city varchar(50),
  contact varchar(50) not null,
  notes varchar(100));
insert into address_book (name, region, city, contact, notes) values ('King', 'First kingdom', 'First city', '+78352505050', 'Плохой король');
insert into address_book (name, region, city, contact, notes) values ('Queen', 'First kingdom', 'First city', '+78352505050', 'Красивая королева');
 insert into address_book (name, region, city, contact, notes) values ('Princess', 'First kingdom', 'First city', 'First_city@First_kingdom.ru', 'Совершеннолетняя принцесса');
insert into address_book (name, region, city, contact, notes) values ('King', 'Second kingdom', 'First city', '+79003309030', 'Хороший король');

