package Day24.boardservice_9mvc_03;

import Day24.boardservice_9mvc_03.view.MemberView;

public class AppStart {
    public static void main(String[] args) {

        // 싱글톤 사용
        MemberView.getInstance().mainPage();
    }
}
