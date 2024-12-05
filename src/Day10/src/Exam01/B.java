package Exam01;

public class B extends A {
    int numB = 20;

    public B() {
        super();    // 따로 정의되어 있지 않다면 컴파일러가 자동 추가시킴
        System.out.println("B 생성자!");
    }
}
