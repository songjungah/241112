package Exam05;

public class Outer {

    int num2 = 20;
    
    class Inner {   // 인스턴스 내부 클래스

        static int num1;    // JDK15 버전까지는 오류 발생, JDK16 버전 부터는 가능

         int num2 = 10;

        public void method() {
            System.out.println("Inner 클래스에 정의된 메서드!");
            System.out.printf("num2 = %d%n", this.num2);
            System.out.printf("Outer.num2 = %d%n", Outer.this.num2);
        }
    }
}