create table jul18_coffee(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_price number(5) not null,
	c_bean varchar2(10 char) not null
);

create sequence jul18_coffee_seq;

select * from jul18_coffee;

drop table jun18_coffee;
drop sequence jun18_coffee_Seq;

update jul18_coffee set c_name = '아메리카노' where c_name ='아메리카노	';