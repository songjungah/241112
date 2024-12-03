# 1. 실습하기 위한 db 생성
create database mydb1203_2;
# 2. 실습 db 사용
use mydb1203_2;


# 1. A 테이블
create table table1 (	
	num int,			# PK필드, int형 자료를 저장하는 필드
    primary key(num)
    );

# 2. B 테이블
create table table2(	
	no int, 			# PK필드, int형 자료를 저장하는 필드
    primary key(no), 
    num int , 			# FK필드, int형 자료를 저장하는 필드
    foreign key(num) references table1(num)
);  

# 3. 레코드(샘플), insert into 테이블명 values (값1), (값2), (값3);
insert into table1 values(1), (2), (3), (4), (5);
insert into table2 values(1,1), (2,2), (3,1), (4,1), (5,2);

# 4. 확인
select * from table1;
select * from table2;


# PK 필드 : 식별키, 식별필드, 중복없음, NOT NULL, 고유한 성질을 가진 필드, 상하관계에 있어서 상(PK)
		# ex) 카테고리PK(카테고리PK)
# FK 필드 : 참조키, 참조필드, 중복가능, NULL, 식별필드를 참조하는 필드, 상하관계에 있어서 하(FK)
		# ex) 제품(카테고리FK)
        
	# PK, FK 가 필요한 이유 : 서로 다른 테이블간의 관계를 연결(PK-FK) 하는 구조, 관계형 데이터베이스
    # PK와 FK 는 참조를 당하고 참조를 하는 입장이므로, 교집합이 존재할 수 있다.
  
  
# 교집합 : JOIN --> 서로 다른 테이블간의 교집합(동일한필드값) 찾기
# 1. 하나의 테이블을 조회
select * from table1;	

# 2. 두개 이상의 테이블을 조회 --> select * from 테이블명A, 테이블명B
select * from table1, table2;		# 25행 조회

# 3. 두개 이상의 테이블을 조회시 두 테이블간 동일한 데이터가 일치했을 때 조회 
-- > pk필드 값과 fk필드의 값은 동일한 값이 있을 수 있나요? 가능 O
# 관례적으로 교집합을 찾을 때 주로 pk필드와 fk필드를 조건으로 설정하면 된다.
# 교집합 필요한 이유 : pk필드값을 이용한 fk필드 조회, fk필드값을 이용한 pk필드 조회

# 교집합 : INTERSECT
# [1] where 조건절 이용한 교집합 하기
select * from table1, table2 where table1.num = table2.num; 			# 5행 조회

# [2] 테이블명A inner join 테이블명B on 테이블명A.pk필드명 = 테이블명B.fk필드명 > 사용하는걸 권장
	  -- 장점 : 여러 절과 같이 사용시 가독성이 좋다
select * from table1 inner join table2 on table1.num = table2.num;		# 5행 조회

# [3] 테이블명A join 테이블명B on 테이블명A.pk필드명 = 테이블명B.fk필드명
select * from table1 join table2 on table1.num = table2.num;			# 5행 조회

# [4] 테이블명A natural join 테이블명B; / 교집합 조건없이 자동으로 교집합 조건을 표현하는 구문
									-- ★전제조건 : pk필드명과 fk필드명이 동일한 경우에만 가능
select * from table1 natural join table2;			# 5행 조회
													# 현재 샘플 테이블은 pk필드명과 fk필드명이 달라서 자연조인이 실패했다.
                                                    
# [5] 테이블명A join 테이블명B using(조인필드명) / 교집합을 할 필드를 using() 대입해서 자동 교집합
									-- ★전제조건 : pk필드명과 fk필드명이 동일한 경우에만 가능
                                    # 현재 샘플 테이블은 pk필드명과 fk필드명이 달라서 using() 구문이 실패했다. > 필드명 변경해서 테스트
select * from table1 join table2 using(num);

# ----------------------------------------------------------------------------------------------------------------

# 합집합 : UNION
# [6] 테이블명A left outer join 테이블명B on 집합조건, 왼쪽테이블(table1)에 있는 모든 레코드를 포함하고 오른쪽 테이블(table2)에 교집합 되는 레코드를 조회, 없으면 null
select * from table1 left outer join table2 on table1.num = table2.num;

# [7] 테이블명A right outer join 테이블명B on 집합조건, 오른쪽 테이블(table2)에 있는 레코드를 포함하고 왼쪽 테이블(table1)에 교집합되는 레코드를 조회, 없으면 null
select * from table1 right outer join table2 on table1.num = table2.num;

# [8] ★합집합★, mysql 에서는 full outer join 을 지원하지 않음
# left join 과 right join 두 결과의 중복된 행을 제거하고 결합
select * from table1 left join table2 on table1.num = table2.num union
select * from table1 right join table2 on table1. num = table2.num;

# [9] 일반적으로 left join 과 left outer join 은 동일한 조인 구문, outer 를 생갹해서 사용하기도 한다.
select * from table1 left join table2 on table1.num = table2.num;

# ----------------------------------------------------------------------------------------------------------------

# 차집합 : EXCEPT
# [10] ★차집합★ 
# A테이블에서 B테이블의 레코드를 제외한 : 테이블명A left outer join 테이블명B on 집합조건 where 테이블명B.fk필드명 is null;
# B테이블에서 A테이블의 레코드를 제외한 : 테이블명A right outer join 테이블명B on 집합조건 where 테이블명A.pk필드명 is null;
select * from table1 left join table2 on table1.num = table2.num;					# 왼쪽 테이블 전체와 오른쪽 테이블과 교집합 표현
select table1.* from table1 left join table2 on table1.num = table2.num where table2.num is null;

# ----------------------------------------------------------------------------------------------------------------

# 생각해보기1 : 테이블에 레코드가 존재한다는 가정하에 생각해보기
	# day34 테이블(카테고리, 제품, 재고) 테이블
    # 1. 모든 제품 레코드 조회시 카테고리번호 대신에 카테고리명을 조회하는 sql 작성하시오.
    -- select * from product inner join pcategory on pcategory.카테고리번호_pk = product.카테고리번호_fk; 
    select p.제품번호_pk, p.제품명, p.제품가격, c.카테고리명
		from product p inner join pcategory c
        on p.카테고리번호_fk = c.카테고리번호_pk;
    
# 생각해보기2. 제품번호 1번의 재고수량 합계를 조회하는 sql을 작성하시오. 단 제품명과 
select * from stock where 제품번호_fk = 1;					# 1번 제품의 재고 레코드만 조회
select sum(재고수량) from stock where 제품번호_fk = 1;		# 1번 제품의 재고수량 총 합계
# 1번 제품의 레코드만 조회
select * from product p inner join stock s on p.제품번호_pk = s.제품번호_fk where 제품번호_pk = 1;
select 제품명, sum(s.재고수량) from product p inner join stock s on p.제품번호_pk = s.제품번호_fk where 제품번호_pk = 1;
    
# 생각해보기3 : 회원제 쪽지/메세지 프로그램 DB 설계
	# (현재 로그인된 회원) 내가 받은 쪽지만 조회하는 SQL 작성하시오. / 내가 쓴글 출력
     
    
    
    
    
