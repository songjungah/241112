package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        // service.login 메서드가 사용하는 상황은 다양할 수 있다!
        // 일반회원 페이지, 관리자 페이지 등..
        // 성공시 처리, 실패시 처리가 다를 수 있음!
        // 호출되는 쪽에서 처리가 달라지는 경우라면, 메서드 내부에서 처리 X
        // 호출하는 쪽에서 예외에 대한 처리
        // try {
            service.login("user01", "12345");
            System.out.println("로그인 성공!");

        // } catch (UserIdNotFoundException | PasswordMismatchException e) {
            // System.out.println(e.getMessage());
       // }
    }
}
