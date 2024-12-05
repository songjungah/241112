package Exam02;

public class Outer {

    int num1 = 10;

    static int num2 = 20;

    static class Inner {
        void method() {
            // System.out.println(num1); > 외부 클래스의 객체 자원은 접근 불가!
            System.out.println(num2);   // 외부 클래스의 객체 생성과 관련없는 정적 지원은 모두 접근 가능!
        }
    }
}
