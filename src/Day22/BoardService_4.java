/*
*     BoardService4
      - BoardService3 모든 코드를 복사 후 진행
      - 기존 코드 : 고정길이인 Board[] boardList = new Board[100];
      - 수정 조건 : 고정길이가 아닌 가변길이 형식으로 수정해서 100개가 아닌 무한개 저장 가능한 가변길이 배열 만들기
     
     * 이유 : 가변길이의 여러개 데이터를 관리 할 때는
            - 컬렉션 프레임워크(ArrayList) = 실무
            - 가변배열 > 시험 / 코딩테스트 / C언어(포인터)
* */

package Day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService_4 {   /* 실행 클래스 */
    public static void main(String[] args) {

        // 입력 객체 만들기
        Scanner scan = new Scanner(System.in);

        // 가변길이 배열 만들기
        Board[] boardList = null;

        // 현재 게시물 수를 저장하는 변수
        int count = 0;

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

                // 만약에 최초 게시물이면
                // boardList = new Board[1];

                // [2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board();  // 게시물 객체 생성
                board.content = content;    board.writer = writer;     board.pwd = pwd;

                // [3]
                count++;    // 게시물 수 1 증가
                Board[] newBoardList = new Board[count];    // ★새로운 배열 생성

                // 기존 배열내 데이터를 새로운 배열에 이동하기 > 배열 복사
                if (count != 1) {   // 만약에 기존 배열 내 게시물이 존재하면
                    for (int index = 0; index <= boardList.length-1; index++) {
                        newBoardList[index] = boardList[index];     // 기존 배열내 게시물들을 새로운 배열에 대입 > 카피
                    }
                }
                
                // 새로운 배열 내 마지막 인덱스(배열명.length-1)에 입력받은 게시물 객체 등록 (.add와 같음)
                newBoardList[newBoardList.length-1] = board;

                // ★새로운 배열을 기존배열에 대입한다.
                boardList = newBoardList;


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
