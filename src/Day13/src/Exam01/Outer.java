package Exam01;

public class Outer {

    int num2 = 20;  // 외부 num2 가 나중에 실행됨 (2)

    class Inner {   // 인스턴스 내부 클래스

        int num2 = 10;  // 내부 num2 가 먼저 실행됨 (1)

        static int num1;    // JDK 15 버전까지는 에러, JDK 16 버전부터는 가능

        void method() {     // 외부 클래스가 객체가 될 때만 사용 가능
            System.out.println("Inner 클래스에 정의된 인스턴스 메서드!");
            System.out.printf("num2 = %d%n", num2); // Inner num2
            System.out.printf("Outer.num2 = %d%n", Outer.this.num2);   // Outer num2 를 나타냄
        }
    }
}
