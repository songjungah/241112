package Exam02;

public class Ex03 {
    public static void main(String[] args) {
        Buyer.staticMethod();   // 원래부터 가능했음
        // Seller.num = 20;    // 상수여서 숫자를 바꿀 수 없음
        System.out.println(Seller.num);
    }
}
