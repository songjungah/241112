package Exam02;

public interface Seller {
    int num = 10;   // public static final - 컴파일러가 자동 추가
    void sell();
    
    default void order() {
        System.out.println("Seller - 주문!");
    }
}
