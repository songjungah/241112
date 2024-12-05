package Exam01;

public class C extends B {
    int numC = 30;

    public C() {
        super();    // 따로 정의되어 있지 않다면 컴파일러가 자동 추가시킴 > B()(= 기본생성자)를 의미함 
        System.out.println("C 생성자!");
    }
}
