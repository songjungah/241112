package Day31.boardservice_11mvc.view;

import Day31.boardservice_11mvc.controller.BoardController;
import Day31.boardservice_11mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {    // 주로 싱글톤

    // -------------------- 싱글톤 ---------------------- //

    // 1. 지정한 클래스의 private static 객체를 생성한다.
    private static BoardView boardView = new BoardView();

    // 2. 지정한 클래스는 외부로부터 객체 생성을 차단한다.
    private BoardView() {}

    // 3. 내부의 객체를 외부로 부터 직접접근이 아닌 간접접근 할 수 있도록 getter 함수를 만들어준다.
    public static BoardView getInstance() {
        return boardView;
    }

    // ------------------------------------------------ //


    Scanner scan = new Scanner(System.in);  // 입력 객체

    public void mainPage() {   // view 시작 함수
        while (true) {
            System.out.print("1. 게시물 등록     2. 게시물 출력 :     3. 게시물 삭제 :      4. 게시물 수정 : ");
            int choose = scan.nextInt();
            
            if (choose == 1) {
                boardWrite();
            } else if (choose == 2) {
                boardPrint();
            } else if (choose == 3) {
                boardDelete();
            } else if (choose == 4) {
                boardUpdate();
            }

        }   // w end
    }   // m end

    // view 가 해야하는 역할 : 입력과 출력만 해야함 (관례적인 약속)

    // 1. 게시물 등록 함수
    void boardWrite(){

        // 1. 입력
        scan.nextLine();
        System.out.print("게시물 내용 : ");      String content = scan.nextLine();
        System.out.print("게시물 작성자 : ");     String writer = scan.next();
        System.out.print("게시물 비밀번호 : ");    int pwd = scan.nextInt();
        
        // 2. 입력받은 값을 컨트롤러에게 전달
        // BoardController boardController = new BoardController();
        boolean result = BoardController.getInstance().boardWrite(content, writer, pwd);
        
        // 3. 컨트롤러에게 전달 후 결과를 받아 출력하기
        if (result) {
            System.out.println("게시물 등록 성공");
        } else {
            System.out.println("게시물 등록 실패");
        }
    }

    // 2. 게시물 출력 함수
    void boardPrint(){

        // 1. 컨드롤러에게 모든 게시물(Board 객체) 정보를 요청한다.
        // 왜 객체가 필요한가? > 다른 클래스에 있는 메소드를 호출하기 위해서는 객체가 필요하다.
        // BoardController boardController = new BoardController();

        // 2. 컨트롤러에게 전달받은 결과를 출력한다.
        ArrayList<BoardDto> result = BoardController.getInstance().boardPrint();   // 게시물 출력 함수를 호출해서
        
        // 출력
        for (int index = 0; index <= result.size()-1; index++) {
            System.out.println("게시물번호 : " + result.get(index).getNum());
            System.out.println("게시내용 : " + result.get(index).getContent());
            System.out.println("작성자 : " + result.get(index).getWriter());
        }

    }

    // 3. 게시물 삭제 view 함수
    void boardDelete() {
        // (1) 삭제할 게시물 번호 입력받기
        System.out.println("삭제할 게시물 번호 : ");
        int deleteNum = scan.nextInt();     // 게시물 번호 타입이 int

        // (2) view 는 실질적인 처리하는 곳이 아니다. (입출력)
        // 삭제는 매개변수 : 삭제할 번호, 삭제는 반환값 : 성공 true, 0 / 실패 false, 1
        boolean result = BoardController.getInstance().boardDelete(deleteNum);
        
        // (3) controller 처리 후 응답한 결과를 반환된 결과 출력
        if (result) {
            System.out.println("게시물 삭제 완료");
        } else {
            System.out.println("게시물 삭제 실패[존재하지 않는 게시물 또는 관리자에게 문의]");
        }
    }
    
    
    // 4. 게시물 수정 함수
    void boardUpdate() {
        
        // 1. 입력
        System.out.println("수정할 게시물 번호 : ");
        int updateNum = scan.nextInt();
        System.out.println("수정할 게시물 내용 : ");
        scan.nextLine();
        String updateContent = scan.nextLine();

        // 수정 게시물 객체 생성
        BoardDto updateDto = new BoardDto(updateNum, updateContent);

        // 2. controller
        boolean result = BoardController.getInstance().boardUpdate(updateDto);
        
        // 3. 결과
        if (result) {
            System.out.println("게시물 수정 성공");
        } else {
            System.out.println("게시물 수정 실패 : 존재하지 않는 게시물 또는 관리자에게 문의");
        }

    }
    

    /*
        게시물 1개 = Board 객체 1개
        게시물 여러개 = Board[] 배열 또는 컬렉션 프레임워크 ArrayList<Board>
    */


}   // class main
