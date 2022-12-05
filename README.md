# higg

-기능

롤 전적 검색 -> RestTemplate 객체와 Gson 라이브러리를 이용한 Riot api 접속 & json 객체 변환

회원가입 & 로그인 -> Mysql, HikariCP, Mybatis를 사용해 구현

로그인 체크 -> interceptor를 통한 로그인 체크 기능

댓글 -> ajax, axios 를 이용한 비동기 통신 구현


//추가예정
sha-256 해쉬알고리즘을 이용한 사용자 비밀번호 암호화


DB
------------------------------------------------------
create table higg_comment(
    idx int Not null auto_increment,
    uid varchar(100) not null,
    reply varchar(100) not null,
    searchNum varchar(100) not null,
    primary key(idx)
)engine=MyISAM charset=utf8mb4;

create table higg_member(
    idx int Not null auto_increment,
    uid varchar(100) not null,
    pw varchar(100) not null,
    primary key(idx),
    UNIQUE KEY `uid_UNIQUE` (`uid`)
)engine=MyISAM charset=utf8mb4;
