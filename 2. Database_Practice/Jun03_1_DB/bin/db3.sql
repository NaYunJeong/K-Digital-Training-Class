-- 웹사이트에서 게시판에 대한 테이블과 이를 [참조하는] 댓글 테이블을 만드려고 함
-- 게시판 테이블에는 [작성자 / 게시판 글 내용 / 작성 시간]에 대한 부분이 있었으면
-- 댓글 테이블에는 [작성자 / 댓글 내용 / 작성 시간]에 대한 부분이 있었으면
drop table board cascade constraint purge;
drop table board_reply cascade constraint purge;

-- 1. 테이블의 구조를 파악해서 게시판 테이블 만들기
create table board(
	b_no number(4) primary key,
	b_owner varchar2(10 char) not null,
	b_txt varchar2(100 char) not null,
	b_when date not null
);
create sequence board_seq;

-- 2. 테이블의 구조를 파악해서 댓글 테이블 만들기
--	[조건 : 참조 되는 테이블의 내용이 삭제되면 관련있는 댓글 내용도 삭제]
create table board_reply(
	br_no number(4) primary key,
	br_b_no number(4) not null,		-- 소속된 글 번호/ 이걸로 board 테이블을 참조
	br_owner varchar2(10 char) not null,
	br_txt varchar2(100 char) not null,
	br_when date not null,
	constraint fk_board_reply foreign key(br_b_no)
		references board(b_no)
		on delete cascade
);
create sequence board_reply_seq;

-- 3. 게시판 테이블에 값 2개 넣고 / 각 게시글마다 댓글 2개씩 넣기
-- 	[조건 : 날짜 관련한 값은 현재 날짜/시간으로 통일]
insert into board values(board_seq.nextval, '이지아', '퇴근 후 무엇을 하나요?', sysdate);
insert into board values(board_seq.nextval, '김수민', '내일 점심은 무엇을 먹을까요?', sysdate);
select * from board;

insert into board_reply values(board_reply_seq.nextval, 1, '한명수', '야구장 가기', sysdate);
insert into board_reply values(board_reply_seq.nextval, 1, '성시경', '코인노래방에서 노래 부르기', sysdate);
insert into board_reply values(board_reply_seq.nextval, 2, '홍길동', '매운갈비찜', sysdate);
insert into board_reply values(board_reply_seq.nextval, 2, '김길동', '서브웨이', sysdate);
select * from board_reply;

-- 4. 게시글 1번을 지웠을 때 관련 댓글들도 지워지는지 확인
delete from board where b_no = 1;

drop table board cascade constraint purge;
drop sequence board_seq;
drop table board_reply cascade constraint purge;
drop sequence board_reply_seq;

