-- 테이블에 데이터를 검색, 삽입, 수정, 삭제하는데 사용하는 문장인 
-- 데이터 조작어 (DML) 중에서 데이터를 넣게하는 명령어인 INSERT와
-- 데이터를 검색 or 조회할 수 있는 명령어인 SELECT의 구조를 뜯어봤음

-- insert into [테이블명] values(값, 값, ...); 의 형태
-- insert를 하면서 PK를 줄 수 없는 상황에
-- 강제적으로 고유 번호값을 만드는 방법으로 PK를 부여했고,
-- 그 고유한 번호값들을 만드는데 있어서 매번 하나하나 지정해 줄 수 없으니
-- 번호값들을 찍어내는 공장!!! SEQUENCE라는 기능을 활용했음 !
-- 테이블이랑 무관하고, 단점으로 INSERT에 실패하더라도, 
-- SEQUENCE의 값은 무조건 올라간다는 것!

-- 그 다음에 데이터를 검색할 수 있는 SELECT
-- select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭], [연산자], [통계함수]
--	from [테이블명]
--	where [조건식]
-- 	group by [그룹대상]
-- 	having [함수 포함 조건]
--	order by [정렬대상 ASC/DESC]

-- distinct는 중복을 제거해주는 역할 !
-- 컬럼명에 별칭부여하는 방법 : AS를 붙이거나 / 띄어쓰기를 하거나
-- 		별칭에 특수문자 or 띄어쓰기가 들어가거나 숫자로 시작하는 경우 별칭을 큰따옴표로 묶어서 표현
-- 연산자 시리즈 첫번째 산술연산자(+, -, *, /), 문자를 이어붙여주는 연산자 '||'
-- DUAL 더미테이블을 이용해서 유용한 내장함수 
--		(숫자함수, 문자함수, 날짜함수, 통계함수, NULL관련함수)
-- 전체 데이터 중 조건에 맞는 데이터를 찾아주는 WHERE절(조건식)을 다루면서
-- 연산자 시리즈 두번째 비교연산자(=, !=, >, <, >=, <=)
-- 연산자 시리즈 세번째 관계연산자
--		AND와 BETWEEN의 차이
--		연속되지 않은 값들을 받아올 때 사용하는 OR, IN
--		그 반대되는 값을 받아올 때 사용하는 NOT
--		이 때 NOT의 위치는 IN 앞 (NOT IN)
-- 연산자 시리즈 네번째 패턴연산자 : 문자열을 포함하는 검색
-- 		LIKE '%패턴%'의 형태
--		LIKE 대신에 = (등호)를 사용하면 안되는 이유
--			=> 등호를 사용하면 패턴을 문자 그대로 인식해버리기 때문에
-- 연산자 시리즈 마지막 집합연산자
--		UNION / UNION ALL (합집합)
--			: 중복되는 값을 제외하고 출력 / 중복되더라도 모두 출력
--		INTERSECT (교집합)
--			: 집합 중 공통되는 값 출력
--		MINUS (차집합)
--			: 앞에 있는 SELECT문 중에서 뒤에 있는 SELECT문에는 없는 값 출력
-- 연산자의 우선순위 (왼쪽이 최우선순위)
--		괄호 > 비교연산자 > NOT > AND > OR

-- WHERE 조건식 끝냈고
-- GROUP BY : 그룹으로 묶어서 연산하여 하나의 결과를 나타내는 것
--		ROLLUP 연산자 : 컬럼에 대한 소계(subtotal)을 만들어줌
-- HAVING절
--		: HAVING절은 그룹의 결과를 제한 vs WHERE절은 조건을 사용해서 결과를 제한
-- ORDER BY : 정렬
--		: 오름차순 ASC(기본값 / 생략가능) / 내림차순 DESC
------------------------------------------------------------------------------------
-- *** 서브쿼리 (SubQuery)
-- SELECT문 안에 다시 SELECT문을 사용하는 기술 !
-- 하나의 SQL문 안에 다른 SQL문이 중첩된 질의문
-- 다른 테이블에서 가져온 데이터로 현재 테이블에 있는 정보를 찾거나 가공할 때 사용
-- 데이터가 대량일 때 데이터를 모두 합쳐서 연산하는 JOIN보다
-- 필요한 데이터만 찾아서 공급해주는 SUBQUERY가 성능이 더 좋음

-- 주질의(main query, 외부질의)와 부속질의(subquery, 내부질의)로 구성됨

select s_name, s_price
	from JUN03_SNACK
	where s_price < 			(
								select avg(s_price)
								from JUN03_SNACK
								);
-- 평균가보다 가격이 낮은 과자의 이름과 가격 정보를 조회한 것
 
-- 한가지 팁이라면...
-- 부분으로 나눠서 구성해보면 조금 더 가독성이 좋아지고, 조건에 맞게 잘 찾을 수 있음 !
 
-- 메인쿼리의 where절에서 서브쿼리의 결과와 비교할 때에는 비교연산자를 사용 !

-- 예제
-- 과자들 중 최고가?
select max(s_price) from jun03_snack;							
-- 제일 비싼 과자 이름, 제조사, 가격
select s_name, s_maker, s_price 
	from jun03_snack 
	where s_price =	(
		select max(s_price)
		from jun03_snack
	);
-- 제일 싼 과자는 어디에서 만드나요 ?
select distinct s_maker 
	from jun03_snack 
	where s_price = (
		select min(s_price)
		from jun03_snack
	);
-- 평균가보다 비싼 과자는 몇 종류 ?
select count(*) 
	from jun03_snack 
	where s_price >	(
		select avg(s_price)
		from jun03_snack
	);
-- 유통기한이 가장 오래 남은 과자의 전체정보
select * 
	from jun03_snack 
	where s_exp = (
		select max(s_exp)
		from jun03_snack
	);
---------------------------------------------------------------------------
-- 과자 회사 테이블을 만들건데, [회사 이름, 주소, 직원 수] 값을 가지게 해주세요
create table jun04_maker (
	m_name varchar2(10 char) primary key,
	m_address varchar2(20 char) not null,
	m_employee number(4) not null
);					

insert into jun04_maker values('롯데', '서울', 850);
insert into jun04_maker values('오리온', '부천', 140);
insert into jun04_maker values('해태', '광주', 110);
insert into jun04_maker values('농심', '부산', 630);
insert into jun04_maker values('크라운', '여수', 90);
---------------------------------------------------------------------------
-- 직원 수 제일 적은 회사에서 만드는 과자 이름, 가격
select s_name, s_price 
	from JUN03_SNACK
	where s_maker = (
		select m_name 
			from JUN04_MAKER 
			where m_employee = (
				select min(m_employee)
					from JUN04_MAKER
			)
	);
	
-- 제일 비싼 과자를 만든 회사는 어디에 있는지
-- =(등호)를 사용하면 단일값 이상의 결과를 내보낼 수가 없어서 'single-row ~' 발생
--		=> 관계연산자 << in >> tkdyd
select m_address
	from JUN04_MAKER
	where m_name in (		-- 'where m_name = ( '이 아닌 => '='를 => in으로
		select s_maker
			from JUN03_SNACK
			where s_price = (
				select max(s_price)
					from JUN03_SNACK
			)
	);

-- 광주에 있는 회사에서 만드는 과자의 평균가
select avg(s_price)
	from jun03_snack
	where s_maker = (
		select m_name
			from jun04_maker
			where m_address = '광주'
	);
	
-- 평균가 이상의 과자를 만드는 회사의 이름, 위치
select m_name, m_address
	from jun04_maker
	where m_name in (
		select s_maker
			from JUN03_SNACK
			where s_price >= (
				select avg(s_price)
					from JUN03_SNACK
			)
	);
	
