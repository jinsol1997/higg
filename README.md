# higg

검색 페이지 

메인검색 -> 검색결과+댓글 추가기능






유저 댓글 DB 이름 : higg_comment

idx int (자동증가)
nick varchar 닉네임
pw varchar 비밀번호
comment varchar 댓글
uniqueNum varchar 게시글 번호


higg_Commend 데이터베이스 ( 서치한 게시글에 댓글 DB )

테스트DB
create table higg_Command(
	idx int Not null auto_increment,
    nick varchar(100),
    pw varchar(100),
    reply varchar(100),
    searchNum varchar(100),
    primary key(idx)
)engine=MyISAM charset=utf8mb4;





