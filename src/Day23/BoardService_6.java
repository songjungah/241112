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
    컬렉션(수집) 프레임워크(미리 만들어진 구조) : 수집 관련 클래스들
    - 여러개의 데이터들을 하나의 객체에서 관리하기 위해서
        --> 배열을 가변길이라서 가변길이로 구현하는 방법이 복잡함
        --> 자바회사에서 배열을 이용한 가변길이의 배열클래스를 이용하여 편리성과 기능을 제공함

    - 대표 인터페이스 : List, Set, Map 컬렉션

    - ArrayList 클래스
       * 대표함수
        .add(새로운 객체) : 리스트내 지정한 객체 저장하는 함수
        .get(인덱스) : 리스트내 지정한 인덱스에 객체 반환 함수
        .size() : 리스트에 저장한 총 객체 수 반환 함수
        .remove(인덱스) : 리스트내 지정한 인덱스에 객체 삭제하는 함수
 */
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


package Day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService_6 {
    public static void main(String[] args) {

        // 지역변수는 초기값이 X
        // 변수가 객체 안에 존재하면 필드
        // 변수가 객체가 아닌 곳에 존재하면 지역변수

        
        // 1. toString() 오버라이등 하기 전
        // Board b1 = new Board();
        // System.out.println(b1.toString());  // 객체의 (힙영역) 주소값
        // b1 만 적으면 > 주소값   /   b1.toString() 적어도 > 주소값


        // 2. toString() 오버라이등 했을 때, toString() 함수는 생략가능
        Board b1 = new Board();
        System.out.println(b1.toString());  // 객체의 (힙영역) 주소값


        Scanner scan = new Scanner(System.in);

        ArrayList<Board> boardList = new ArrayList<>();


        while (true) {
            System.out.printf("1. 글쓰기   2. 글출력 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                scan.nextLine();

                System.out.print("내용 : ");      String content = scan.nextLine();
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                Board board = new Board(content, writer, pwd);
                boardList.add(board);


            } else if (choose == 2) {

                // 배열 내 존재하는 게시물 모두 출력하기
                for (int index = 0; index <= boardList.size()-1; index++) {
                    System.out.printf("작성자 : %s, 내용 : %s, 비밀번호 : %d \n",
                            boardList.get(index).getWriter(), boardList.get(index).getContent(), boardList.get(index).getPwd());
                }
            }

        }
    }
}
