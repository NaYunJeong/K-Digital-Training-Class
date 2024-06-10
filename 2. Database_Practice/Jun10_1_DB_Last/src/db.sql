-- 어떤 특정한 식당에 대한 테이블
-- 식당 지점(체인점 지역), 식당 주인(이름), 좌석 수
create table jun10_restaurant(
	r_location varchar2(10 char) primary key,
	r_owner varchar2(10 char) not null,
	r_seat number(3) not null
);

-- 데이터 2 ~ 3개 넣기
insert into jun10_restaurant values('잠실', '김길동', 800);
insert into jun10_restaurant values('종로', '이길동', 550);
insert into jun10_restaurant values('하남', '홍길동', 300);
select * from jun10_restaurant;
-----------------------------------------------------------
-- 예약 테이블
-- 예약자 이름, 예약 시간, 예약자 전화번호, 예약 지점
create table jun10_reservation(
	r_no number(3) primary key,
	r_name varchar2(10 char) not null,
	r_time date not null,
	r_phonenum varchar2(20 char) not null,
	r_location varchar2(10 char) not null,
	constraint fk_r_location foreign key(r_location)
		references jun10_restaurant(r_location)
		on delete cascade
);
create sequence jun10_reservation_seq;

-- 데이터 2 ~ 3개 넣기
insert into jun10_reservation values(jun10_reservation_seq.nextval, '이서연', to_date('2024-06-11 18:00', 'YYYY-MM-DD HH24:MI'), '010-1234-5678', '잠실');
insert into jun10_reservation values(jun10_reservation_seq.nextval, '남지우', to_date('2024-06-19 12:00', 'YYYY-MM-DD HH24:MI'), '010-4580-1717', '하남');
insert into jun10_reservation values(jun10_reservation_seq.nextval, '박소원', to_date('2024-07-01 11:00', 'YYYY-MM-DD HH24:MI'), '010-9632-1234', '종로');
select * from jun10_reservation;

drop table jun10_reservation cascade constraint;
drop table jun10_restaurant cascade constraint;
drop sequence jun10_restaurant_seq;
drop sequence jun10_reservation_seq;
