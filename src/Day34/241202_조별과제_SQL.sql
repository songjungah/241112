# 회원 테이블
create table member (
   u_number int unsigned auto_increment,
    u_id varchar(20) not null,
    u_pw varchar(10) not null,
    u_name varchar(10) not null,
    u_old int unsigned not null,
    u_add varchar(100),
    u_email varchar(50),
    u_phone int not null,
    u_birth date not null,
    primary key( u_number )
);

# 영화 테이블
create table movie(
mv_id int, #영화번호 
mv_name varchar(50) not null, #영화제목
mv_director varchar(50) not null, #감독
mv_genre varchar(50) not null, #장르 
mv_class varchar(20) not null, #등급 
mv_time time not null, #러닝타임
mv_detal varchar(100), #영화 설명
mv_date date, #개봉날짜
mv_actor varchar(50), #출연진
mv_startdate date, #등록일
primary key(mv_id)
);

create table review(
	rv_id int unsigned auto_increment,		# 리뷰번호
    rv_name varchar(50) not null,			# 영화이름
    rv_date date not null,					# 등록일
    rv_star int not null,					# 별점
    rv_content varchar(200) not null,		# 리뷰 내용
    rv_member int unsigned auto_increment,	# 회원번호
    rv_suggestion boolean,					# 추천/비추천
    primary key(rv_id),						
    foreign key(rv_member) references member(u_number),
    foreign key(rv_id) reference movie(mv_id),
    foreign key(rv_name) reference movie(mv_name)
);
