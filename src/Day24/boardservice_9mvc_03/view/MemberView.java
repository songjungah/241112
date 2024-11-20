package Day24.boardservice_9mvc_03.view;

import Day24.boardservice_9mvc_03.controller.MemberController;

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

    public void mainPage() {    // main s
        while (true) {  // while s

            System.out.println("1. 회원가입     2. 로그인      3. 로그아웃 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                memberRegister();
            } else if (choose == 2) {
                memberLogin();
            } else if (choose == 3) {
                logout();
            } else {
                System.out.println("정보를 잘못 입력했습니다.");
            }
        }   // while e
    }// main e

    
    void memberRegister() { // 회원가입
        scan.nextLine();

        System.out.print("아이디 : "); String id = scan.nextLine();
        System.out.print("비밀번호(숫자만 입력) : ");    int pwd = scan.nextInt();

        boolean result = MemberController.getInstance().memberRegister(id, pwd);

        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패. 이미 존재하는 아이디 입니다.");
        }
    }
    
    
    void memberLogin() {    // 로그인
        scan.nextLine();

        System.out.print("아이디 : "); String id = scan.nextLine();
        System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

        boolean result = MemberController.getInstance().memberLogin(id, pwd);

        if (result) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패! 아이디나 비밀번호를 다시 확인해주세요.");
        }
    }


    void logout() { // 로그아웃
        if (MemberController.getInstance().getLoggedInUser() != null) {
            MemberController.getInstance().logout();
            System.out.println("로그아웃 완료");
        } else {
            System.out.println("현재 로그인한 사용자가 아닙니다.");
        }
    }
    

}
