-- 테이블스페이스 : 이거 함부로 지우지 마세요 !

-- [테이블]을 만들어봅시다!
-- 테이블의 기본적인 구조
create table 테이블명(
	컬럼명 자료형 [옵션], -- 옵션 : 필요하면 넣는것 // []는 강조!일뿐 넣는거 아님!
	컬럼명 자료형,
	...
);
-- 자료형 (데이터 타입)
-- 	크게 3가지의 타입으로 나눌 수 있음 (문자형 / 숫자형 / 날짜)

--	문자형
--		char(용량)
--			무조건 그 용량대로 저장
--			용량이 비어있다면 띄어쓰기로 그 용량을 메꿈
--			처리 속도가 빠르다 !
--			글자수가 정해져있다면 char 활용 O
--				ex) 성별, 주민번호, 핸드폰번호, ...

--		varchar2(용량)
--			정해진 용량만큼 데이터를 안 넣으면
--			그 용량을 조절해서 저장
-- 			용량을 조절하는 만큼 비교적 처리속도가 느리다 !
--			주력으로 사용할 것!
--				ex) 이름, 주소, ...
-----------------------------------------------------
-- 문자형 용량
--		varchar2(5) : 5byte
--			영어, 숫자, 띄어쓰기는 1byte
--			한글 한글자는 3byte
--			글자수 계산하기가 애매...

--		varchar2(5 char)
--			한글/영어 5글자 => 최대 15byte
--	=> 문자형 자료형을 쓸 때는 용량에 char를 넣어서 쓰자!

create table test(
	t_name varchar2(5)
);

create table test2(
	t_name varchar2(5 char)
);

-- 문자형의 값을 넣을 때는 작은따옴표 사용해서 !
insert into test values('가나다');
insert into test2 values('가나다');
drop table test cascade constraint purge;
drop table test2 cascade constraint purge;
----------------------------------------------
-- 	숫자형
--		NUMBER(P, S) : 십진수 기준
--			P : 정밀도 (Precision) / S : 범위 (Scale)
--			P는 소수점 기준 모든 유효숫자를 의미.
--			만약 P에 명시한 것보다 큰 숫자값을 입력하면 오류가 발생
--			S가 양수면 소수점 이하, 음수면 소수점 이상(소수점 기준 왼쪽)의 유효자리 자릿수를 나타냄
--			S에 명시한 숫자 이상의 숫자를 입력하면, S에 명시한 숫자로 반올림 처리함
--			S가 음수면 소수점 기준 왼쪽 자릿수만큼 반올림
--			P가 S보다 크면 S는 소수점 이하 유효숫자 자리수를 나타냄
--		값이 123.54인데,
--		number(3)		=> 124
--		number(3, 2)	=> 오류! (p가 3이고, 유효숫자가 5자리여서)
--		number(5, 2)	=> 123.54
--		number(7, 1)	=> 123.5 (s가 1이고, 소수점 둘째자리에서 반올림/ xxxxxx.x)
--		number(7, -1)	=> 120 (s가 -1이고, 소수점 왼쪽 첫자리 3이 반올림/ xxxxxx0.)

--		FLOAT(P) : NUMBER의 하위타입 + 이진수 기준
create table testNum(
	t_num number(5),
	t_flo float(5)
);
insert into testNum values(12345, 12345);
select * from testNum; 	-- 12345, 12000

-- float(5) 라고 하면, 5자리 10진수가 아닌, 5자리 2진수(ex: 10110)을 의미
-- 2진수를 10진수로 변경을 하려면 약 0.3 정도를 곱하면 되는데,
-- 5 x 0.3 = 약 1.5가 됨
-- 결국 float(5)는 실제로 float(2) (1.5를 반올림해서 2가 되었음)
-- 12345 중 앞의 두자리 12만 제대로 나오고, 나머지는 0으로 채워진 형태
-- 	=>사실상 오라클에서는 number형만 사용해도 되며,
--		크기 설정에 있어서 P, S를 적절히 조절하면 됨!!! ****
--------------------------------------------------------------
--	날짜
--		Date : 연도, 월, 일, 시, 분, 초까지 입력 가능
--		Timestamp : 연도, 월, 일, 시, 분, 초, 밀리초까지 입력 가능
--	=> 주력은 Date !
--	java.util.Date / java.sql.Date
--------------------------------------------------------------












