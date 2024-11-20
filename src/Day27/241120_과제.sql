/*
	[SQL 과제] 키오스크 개발 - 필요한 데이터베이스 구축하기
    * 요구사항
    1. 여러개 카테고리 중에 하나의 카테고리를 선택하여 카테고리별 제품들을 출력
    2. 해당 제품을 선택하여 수량 입력받아 주문 처리 - 단) 한번 주문의 여러개 제품을 주문할 수 있다.
    3. 주문번호를 받아서 대기한다.
    
    * 메모리 설계 필수 필드 속성
    1. 카테고리명		2. 제품명		3. 가격 		4. 주문수량		5. 주문날짜
    
    * 핵심 : 여러 테이블 구성 할 때는 테이블간의 데이터 중복을 최소화 한다.
    
    * 제출 : 위 주제에 따른 데이터베이스와 테이블 생성을 하기 위한 SQL 제출
*/


drop database if exists cafeorder;		# 1. 데이터베이스가 존재하면 삭제
create database cafeorder;				# 2. 데이터베이스 생성
show databases;							# 3. 데이터베이스 목록
use cafeorder;							# 4. 데이터베이스 활성화/사용
drop table if exists cafemenu;			# 5. 테이블이 존재하면 삭제

create table coffee(				# 6. 테이블 생성 : 테이블명(속성명 속성타입, 속성명 속성타입, 속성명 속성타입)
		아메리카노 varchar(5)
);

create table noncoffee(			
		딸기라떼 varchar(4)
);

create table smoothie(			
		요거트스무디 varchar(6)
);

create table ade(	
		레몬에이드 varchar(5)
);

create table tea(		
		녹차 varchar(2)
);

# 7. 테이블 목록보기
show tables;

# 8. 지정한 테이블의 레코드 보기
select * from coffee;	# 현재 레코드는 없고 테이블만 생성된 상태







