
/*
	[ SQL 과제2 ] 회원들만 구매 할 수 있는 '라면' 쇼핑몰, 데이터베이스 구축하기
    * 요구사항
		1. 회원은 회원가입을 진행한다. (임의)
        2. 로그인된 상황에서 카테고리를 선택한다.
        3. 지정된 카테고리에서 제품을 선택한다.
        4. 지정한 제품을 장바구니에 담는다.
        --> 여러번 장바구니에 담았을 때 
        5. 만약에 장바구니에 담긴 '불닭볶음면' 2개, 짜파게티 1개 를 주문했을 때,
        6. 하나의 주문 번호를 발급 받았고 주문내역에서 지정한 주문상세를 클릭 시 주문한 주문상세내역(정보)가 나왔다.
        
	* 조건
		1. 서로 다른 테이블간의 PK(기본키)와 FK(외래키)를 적용하여 관계형 테이블을 만드시오.
        2. 적절한 필드명과 타입을 사용하시오.
        3. 적절한 제약조건을 사용하시오.
*/

create database shopping;
use shopping;
show tables;
drop table signup;
select * from category;

create table signup(	-- 회원번호, 이름, 생년월일, 아이디, 비밀번호, 휴대폰번호
	userNum int unsigned not null auto_increment,
	name varchar(6) not null, 
	birth date not null, 
	id varchar(30) not null, 
	pwd varchar(30) not null, 
	phoneNum char(13) not null,
    
    primary(userNum)
);

create table category(	-- 카테고리번호, 카테고리이름
	categoryNum int unsigned not null auto_increment,
    categoryName varchar(10),
    
    primary key(categoryNum)
); 

create table product(	-- 제품번호, 제품명, 가격, 카테고리번호
	productNum int unsigned not null auto_increment,
    productName varchar(50),
    productPrice int,
    categoryNum int unsigned not null auto_increment,
    
    primary key(productNum),
    foreign key(productNum) references category(categoryNum)
);

create table cart(	-- 주문번호, 주문날짜, 회원번호
	cartNum int unsigned not null auto_increment,
    cartDate date,
    userNum int unsigned not null auto_increment,
    
    primary key(cartNum),
    foreign key(cartNum) references signup(userNum)
);

create table cartOrder (	-- 주문상세번호, 주문수량, 주문번호, 제품번호
	cartOrderNum int unsigned not null auto_increment,
    cartOrderAmount int,
    cartNum int ,
    productNum int unsigned not null auto_increment,
    
    primary key(cartOrderNum),
    foreign key(cartDetailNum) references cart(cartNum),
    foreign key(productNum) references product(productNum)
);