-- 사과 테이블 : 지역 / 색 / 맛 / 가격 / 소개		정보
create table jun26_apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_flavor varchar2(10 char) not null,
	a_price number(5) not null,
	a_introduce varchar2(100 char) not null
);

-- 데이터 2개 넣기
insert into jun26_apple values('충주', '초록', '단맛', 3000, '충주 꿀 사과');
insert into jun26_apple values('홍천', '빨강', '상큼함', 4000, '홍천 빠알간 사과');

select * from jun26_apple;
