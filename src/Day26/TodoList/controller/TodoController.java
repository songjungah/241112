package Day26.TodoList.controller;

import Day26.TodoList.model.TodoDao;
import Day26.TodoList.model.TodoDto;

import java.util.ArrayList;

public class TodoController {

    // 싱글톤
    private static TodoController todoController = new TodoController();
    private TodoController() {}
    public static TodoController getInstance() {
        return todoController;
    }



    // 1. 리스트 등록 제어 함수
    public boolean TodoWrite(String content, int date, boolean condition) {

        TodoDto todoDto = new TodoDto(content, date, condition);

        return TodoDao.getInstance().TodoWrite(todoDto);

    }


    // 2. 리스트 출력 제어 함수
    public ArrayList<TodoDto> TodoPrint() {

        ArrayList<TodoDto> result = TodoDao.getInstance().TodoPrint();

        return result;
    }


}
