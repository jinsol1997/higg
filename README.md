# higg

화면 전환

메인검색 화면 -> 검색결과 화면


------------------------------------------------------
메인화면 추가기능  -> 가장자리에 로그인 옵션 추가 (로그인시 아이디 반환)

검색결과화면 추가기능 - > 댓글 작성, 수정, 삭제기능(로그인 했을 시) -> 비로그인시 보기만 가능

로그인한 세션에 SearchNum값과 댓글에 SearchNum 값을 비교 후 같으면 삭제, 수정 처리승인



로그인 완료시 세션등록


------------------------------------------------------
회원 DB

uid -> 아이디
pw -> 비밀번호
SerchNum -> 검색계정 등록 (미등록 가능)

drop table higg_command;

create table higg_Command(
	idx int Not null auto_increment,
    uid varchar(100) not null,
    reply varchar(100) not null,
    searchNum varchar(100) not null,
    primary key(idx)
)engine=MyISAM charset=utf8mb4;
------------------------------------------------------
댓글 DB

uid ->아이디 
reply -> 댓글
searchNum -> 어느게시글에 달았는지 알 수 있는 번호or문자

drop table higg_member;

create table higg_member(
	idx int Not null auto_increment,
    uid varchar(100) not null,
    pw varchar(100) not null,
    SearchNum varchar(100),
    primary key(idx)
)engine=MyISAM charset=utf8mb4;

------------------------------------------------------



