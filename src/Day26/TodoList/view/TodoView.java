package Day26.TodoList.view;

import Day26.TodoList.controller.TodoController;
import Day26.TodoList.model.TodoDao;
import Day26.TodoList.model.TodoDto;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoView {

    // 싱글톤
    private static TodoView todoView = new TodoView();
    private TodoView() {}
    public static TodoView getInstance() {
        return todoView;
    }


    // 입력 객체
    Scanner scan = new Scanner(System.in);

    public void mainPage() {    // mainPage s
        while (true) {  // while s
            System.out.println("1. 할일 등록    2. 할일 전체출력 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                listWrite();

            } else if (choose == 2) {
                listPrint();

            } else {
                System.out.println("정보를 잘못 입력했습니다.");
            }

        }   // while e
    }   // mainPage e


    // 리스트 등록 함수
    void listWrite() {  // 등록함수 s

        // 입력
        scan.nextLine();
        System.out.println("할일 내용 : ");     String content = scan.nextLine();
        System.out.println("할일 마감 날짜 : ");  int date = scan.nextInt();
        System.out.println("할일 상태 : ");     boolean condition = scan.nextBoolean();
        
        // 컨트롤러에게 값 전달
        boolean result = TodoController.getInstance().TodoWrite(content, date, condition);
        
        // 결과값 출력
        if (result) {
            System.out.println("게시물 등록 성공");
        } else {
            System.out.println("게시물 등록 실패");
        }

    }   // 등록함수 e


    void listPrint() {  // 출력함수 s

        // 컨트롤러에게 받은 결과 출력
        ArrayList<TodoDto> result = TodoController.getInstance().TodoPrint();

        // 출력
        for (int index = 0; index < result.size(); index++) {
            System.out.println("할일 내용 : " +  result.get(index).getContent());
            System.out.println("할일 마감 날짜 : " + result.get(index).getDate());
            System.out.println("할일 상태 : " + result.get(index).isCondition());
        }

    }   // 출력함수 e

}
