/*
*     BoardService3
      - 내용[String타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스를 설계
      - 게시물 객체 최대 100개 까지 저장하는 서비스 구축
      - 조건 : main함수 1개 와 배열은 최대1까지 사용 하여 구현
      - 구축 : 게시물 쓰기 와 게시물 출력 기능 구현

      - 타입 : 데이터 형태를 분류
      * 대분류 : 기본타입(byte, int, short, long, float, double, char, boolean) 8개 ---> 기본값 : 정수 0, 실수값 0.0, 논리 false
              : 참조타입([]배열, class, 인터페이스, 열거타입 등) ---> 기본값 : null

      - ★ 클래스
      * 객체지향 프로그래밍 매우 중요한 문법
      * 타입 만들기
      * 멤버변수(필드), 생성자, 메서드(멤버함수) 로 구성된 새로운 타입 만들기
      
      - ★ 객체
      * 물리적 / 논리적 으로 정의(특성, 행위)가 가능한 형태물 > ex) 의자, 안경, 책, 강의(논리)
      * 하나의 자료(여러개 자료들의 주소값)를 저장하는 메모리 공간 (JVM 힙 영역)
      * 참조 타입으로 생성된 메모리 공간
      
      - ★ 변수
      * 하나의 자료(실제값, 주소값)를 저장하는 메모리 공간(JVM 스택영역) > JVM 외우기
      * 기본/참조 타입으로 생성된 메모리 공간
      
      ★ 객체와 변수의 차이점
      * 1. 물리적으로 저장되는 위치가 다름
      * 2. 논리적으로 변수는 데이터 1개를 저장하는 공간 / 객체는 데이터를 저장을 하지만 

* */

package Day22;

import java.util.Scanner;

public class BoardService_3 {   /* 실행 클래스 */
    public static void main(String[] args) {

        // 입력 객체 만들기
        Scanner scan = new Scanner(System.in);

        // Board 객체 100개를 저장할 수 있는 배열 선언 > 배열은 : 고정길이
        Board[] boardList = new Board[100];

        while (true) {
            System.out.println("1. 글쓰기  2. 글 출력 : ");
            int choose = scan.nextInt();
            
            if (choose == 1) {
                // [1] 사용자로 저장할 데이터 입력 받는다.
                scan.nextLine();    // 의미없는 .nextLine()을 작성

                System.out.print("내용 : ");      String content = scan.nextLine();
                // .next() : 문자열(공백x) 입력 , .()nextLine() : 문자열(공백/띄어쓰기 포함) 입력
                // .nextLine() 사용시 주의할 점 : .nextLine() 앞에 다른 .next()가 존재하면 의미없는 .nextLine()을 작성해준다.
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                // [2] 배열 내 빈 공간을 찾아서 게시물 작성하기
                for (int index = 0; index <= boardList.length-1; index++) {
                    if (boardList[index] == null) {     // 만약에 index 번째 게시물이 비어있으면
                        // 게시물 객체 생성
                        Board board = new Board();
                        // 생성된 게시물 객체 내 입력받은 값들을 대입함
                        board.content = content;    board.writer = writer;     board.pwd = pwd;
                        // 배열내 index 번째 위치에 생성된 객체를 저장/대입 함
                        boardList[index] = board;
                        // 반목문을 종료함
                        break;
                    }
                }

            } else if (choose == 2) {

                // 배열 내 존재하는 게시물 모두 출력하기
                for (int index = 0; index <= boardList.length-1; index++) {
                    if (boardList[index] != null) {
                        System.out.printf("작성자 : %s, 내용 : %s, 비밀번호 : %d \n",
                                boardList[index].writer, boardList[index].content, boardList[index].pwd);
                    }
                }
                
            }

        }

    }
}
