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

insert into user_list(username,password,userkind) values('丹恒','1388','管理员');
insert into user_list(username,password,userkind) values('星','0426','用户');
insert into user_list(username,password,userkind) values('三月七','0307','用户');

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

insert into books_list(bookname,author,date,sort,price) values('哈利·波特','J.K.罗琳','1997年6月','小说',36.0);
insert into books_list(bookname,author,date,sort,price) values('魔幻城堡','黛安娜·温尼·琼斯','2005年6月','小说',31.4);

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

insert into order_list(bookname, price,username,payment,uid) values('哈利·波特',134.0,'星','已付款',2);
insert into order_list(bookname,price,username,payment,uid) values('魔幻城堡',31.4,'三月七','未付款',3);