package Day24.boardservice_9mvc_01.view;

import Day24.boardservice_9mvc_01.controller.MemberController;

import java.util.Scanner;

public class MemberView {

    // 싱글톤
    private static MemberView memberView = new MemberView();
    private MemberView() {}
    public static MemberView getInstance() {
        return memberView;
    }

    // 입력 객체
    Scanner scan = new Scanner(System.in);

    // 메인
    public void mainPage() {    // main s
        while (true) {  // while s
            System.out.println("1. 회원가입     2. 로그인 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                memberRegister();
            } else if (choose == 2) {
                memberLogin();
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }   // while e
    }   // main e


    // 입력 > 회원가입
    void memberRegister() { // register s
        scan.nextLine();

        System.out.println("아이디 : ");   String id = scan.nextLine();
        System.out.println("비밀번호 : ");  String pwd = scan.nextLine();

        boolean result = MemberController.getInstance().memberRegister(id, pwd);

        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
        
    }   // register e


    // 촐력 > 로그인
    void memberLogin() {
        scan.nextLine();

        System.out.println("아이디 : ");   String id = scan.nextLine();
        System.out.println("비밀번호 : ");  String pwd = scan.nextLine();

        // System.out.println("로그인 시도: 아이디 = " + id + ", 비밀번호 = " + pwd);

        boolean result = MemberController.getInstance().memberLogin(id, pwd);

        if (result) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("아이디 혹은 비밀번호가 잘못됐습니다.");
        }
    }


}
