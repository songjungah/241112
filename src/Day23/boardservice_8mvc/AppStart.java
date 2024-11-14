package Day23.boardservice_8mvc;

import Day23.boardservice_8mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {

        // 메인 뷰 요청
        // - 다른 클래스의 존재하는 함수를 호출하는 방법
        // -> 1. 객체를 생성한 후 객체명.메서드명()
        // - 단 패키지가 다르면 public 함수로 선언한다.
        BoardView view = new BoardView();
        view.mainPage();

    }
}
