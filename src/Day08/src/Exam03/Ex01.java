package Exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();  // class 외부
        a.num1 = 10;    // default 접근 제어자
        System.out.println(a.num1);

        a.num2 = 20;    // protected 접근 제어자
        System.out.println(a.num2);

        // a.num4;      > private 접근 제어자
    }
}
