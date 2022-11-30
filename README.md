# higg

검색 페이지 

메인검색 -> 검색결과+댓글 추가기능



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



