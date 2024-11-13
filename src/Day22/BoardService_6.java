/*
        241113 과제
        - itdanja@kakao.com 으로 제출
        - 선택1(어려운분들)
        : BoardService 3~5까지 코드를 5번씩 따라치기 작성 후 제출, 궁금한 점 메일/카톡 남기기
        
        - 선택2(활용할분들)
        : BoardServiceTest2, BoardServiceTest3 구현
        [BoardServiceTest2]
        - 추가조건 : NewBoard 클래스 객체들을 캡슐화(접근제한자) 하시오.
                1. NewBoard 는 앞전 Board 와 동일하게 내용[String 타입]과 작성자[String 타입] 과
                   비밀번호[int 타입] 로 구성된 게시물 클래스
                2. NewBoard 의 모든 필드(멤버변수) 는 private 으로 선언한다.
                3. 외부에서 객체 생성시 생성자를 사용한다.
                4. getter(필드값 호출함수), setter(필드값 대입함수), toString(객체정보 함수) 함수들을 이용하여
                   모든 필드의 데이터를 간접 접근한다.
                   
        [BoardServiceTest3]
                - BoardServiceTest 클래스 내 main 내 while{} 문안에 있는 게시물 등록코드와 게시물 전체 출력코드를
                  main 함수 밖으로 빼서 각 함수로 구현
* */

/*
*     BoardService6
      - BoardService5 모든 코드를 복사 후 진행
      - 추가조건 : NewBoard 클래스 객체들을 캡슐화(접근제한자) 하시오.
                1. NewBoard 는 앞전 Board 와 동일하게 내용[String 타입]과 작성자[String 타입] 과
                   비밀번호[int 타입] 로 구성된 게시물 클래스
                2. NewBoard 의 모든 필드(멤버변수) 는 private 으로 선언한다.
                3. 외부에서 객체 생성시 생성자를 사용한다.
                4. getter(필드값 호출함수), setter(필드값 대입함수), toString(객체정보 함수) 함수들을 이용하여
                   모든 필드의 데이터를 간접 접근한다.
* */

/*
        public : 공개용, 모든 클래스 / 패키지 내에서 접근 가능
        private : 비공개용, 현재 클래스 내에서 접근 가능
            - 사용하는 이유 : 객체의 자료는 중요하기 때문에 쉽게 저장 / 변경하면 안된다.
              (유효성 검사 1. 원하는 데이터인지 2. 안전한 데이터인지)
            - 객체를 통해 필드 직접 접근을 차단하고, 간접접근을 이용한 유효성 검사를 시행한다.(getter, setter 을 사용하는 이유)
            - 실무에서는 무조건 해야한다.
        protected : 동일한 패키지 내에서 접근 가능, 상속관계이면 다른 패키지에서도 접근 가능하다.
        (default) : 동인한 패키지 내에서 접근 가능, 위에서 3가지를 작성 안했을 때 기본적으로 적용되는 접근제한자
* */


package Day22;

import Day22.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService_6 {
    public static void main(String[] args) {

        // 입력객체
        Scanner scan = new Scanner(System.in);

        // 컬렉션 프레임워크 중 ArrayList 클래스를 이용한 배열 대체함 (개발자에 편리성을 제공)
        // ArrayList<제네릭타입> : 리스트 객체에 저장할 여러개 객체들의 타입
        // 배열(고정길이) VS 컬렉션프레임워크(가변길이)
        ArrayList<Board> boardList = new ArrayList<>();


        while (true) {
            System.out.printf("1. 글쓰기   2. 글출력 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                // [1] 사용자로 저장할 데이터 입력 받는다.
                scan.nextLine();    // 의미없는 .nextLine()을 작성

                System.out.print("내용 : ");      String content = scan.nextLine();
                // .next() : 문자열(공백x) 입력 , .()nextLine() : 문자열(공백/띄어쓰기 포함) 입력
                // .nextLine() 사용시 주의할 점 : .nextLine() 앞에 다른 .next()가 존재하면 의미없는 .nextLine()을 작성해준다.
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                // 만약에 최초 게시물이면
                // boardList = new Board[1];

                // [2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board();  // 게시물 객체 생성
                board.content = content;    board.writer = writer;     board.pwd = pwd;

                // [3] 컬렉션 프레임워크인 리스트 객체에 게시물을 저장
                boardList.add(board);


            } else if (choose == 2) {

                // 배열 내 존재하는 게시물 모두 출력하기
                for (int index = 0; index <= boardList.size()-1; index++) {
                    System.out.printf("작성자 : %s, 내용 : %s, 비밀번호 : %d \n",
                            boardList.get(index).writer, boardList.get(index).content, boardList.get(index).pwd);
                }
            }

        }

    }
}

