drop database if exists mydb;

create database bookshop;

use bookshop;

create table user_list
(
    uid int primary key auto_increment,
    username varchar(20) null,
    password varchar(20) null,
    userkind varchar(20) null
);
alter table user_list convert to character set utf8 collate utf8_general_ci;

insert into user_list(username,password,userkind) values('����','1388','����Ա');
insert into user_list(username,password,userkind) values('��','0426','�û�');
insert into user_list(username,password,userkind) values('������','0307','�û�');

create table books_list
(
    bid int primary key auto_increment,
    bookname varchar(20),
    author varchar(20),
    date varchar(20),
    sort varchar(20),
    price double
);
alter table books_list convert to character set utf8 collate utf8_general_ci;

insert into books_list(bookname,author,date,sort,price) values('����������','J.K.����','1997��6��','С˵',36.0);
insert into books_list(bookname,author,date,sort,price) values('ħ�óǱ�','�찲�ȡ����ᡤ��˹','2005��6��','С˵',31.4);

create table order_list
(
    oid int primary key auto_increment,
    bookname varchar(20),
    price double,
    username varchar(20),
    payment varchar(20),
    uid int
);
alter table order_list convert to character set utf8 collate utf8_general_ci;

insert into order_list(bookname, price,username,payment,uid) values('����������',134.0,'��','�Ѹ���',2);
insert into order_list(bookname,price,username,payment,uid) values('ħ�óǱ�',31.4,'������','δ����',3);