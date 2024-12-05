package Exam04;

public class Ex02 {
    public static void main(String[] args) {
        Ex01 ex = new Ex01();
        ex.method();    // Ex01 만 호출이 됨
                        // > A,B는 호출이 될 수 없음 - 구현체가 없음 > 추상 메서드는 하이클래스가 A, B에 method()를 구현하도록 하기 때문
    }
}
