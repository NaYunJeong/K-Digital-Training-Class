create table jul19_weather(
	w_no number(3) primary key,
	w_hour varchar(10 char) not null,
	w_temp varchar(10 char) not null,
	w_tmx varchar(10 char) not null,
	w_wfKor varchar(10 char) not null,
	w_wdKor varchar(10 char) not null
);

create sequence jul19_weather_seq;

select * from jul19_weather;

drop table jul19_weather cascade constraint;
------------------------------------------------------------
create table jul19_airPollution(
	a_no number(3) primary key,
	a_MSRSTE_NM varchar2(10 char) not null,
	a_PM10 number(4, 1) not null,
	a_PM25 number(4, 1) not null
);
create sequence jul19_airPollution_seq;

select * from jul19_airPollution;

drop table jul19_weather cascade constraint;
drop sequence jul19_airPollution_seq;
------------------------------------------------------------
-- (table간 제약조건 고려 X)
-- 학생 : 이름, 생일, 몇 강의장, 중간, 기말
create table jul19_student(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_birth date not null,
	s_lecture varchar2(10 char) not null,
	s_mid number(3) not null,
	s_final number(3) not null
);
create sequence jul19_student_seq;

select * from jul19_student;

drop table jul19_student cascade constraint;
drop sequence jul19_student_seq;
------------------------------------------------------------
-- 강의장 : 몇 강의장, 강의장 위치
-- 1강의장 : 5층 복도 오른쪽		/ 2강의장 : 5층 복도 왼쪽 끝
-- 3강의장 : 5층 복도 왼쪽 첫번째	/ 4강의장 : 6층 정면 / 5강의장 : 6층 오른쪽
-- 강의장에 대한 데이터는 여기에서 insert로 처리!
create table jul19_lecture(
	l_lecture varchar2(10 char) primary key,
	l_location varchar2(20 char) not null
);

insert into jul19_lecture values('1강의장', '5층 복도 오른쪽');
insert into jul19_lecture values('2강의장', '5층 복도 왼쪽 끝');
insert into jul19_lecture values('3강의장', '5층 복도 왼쪽 첫번째');
insert into jul19_lecture values('4강의장', '6층 정면');
insert into jul19_lecture values('5강의장', '6층 오른쪽');

select * from jul19_lecture;

drop table jul19_lecture cascade constraint;


