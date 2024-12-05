package Exam02;

public interface Buyer {
    void buy();

    default void order() {  // public - 구현체가 있으면 default 를 이용해 정의할 수 있음
        System.out.println("Buyer - 주문");
        privateMethod();
    }

    private void privateMethod() {   // JDK9
        System.out.println("private 메서드!");
    }

    public static void staticMethod() {     // public 이 자동으로 있기에 생략 가능
        System.out.println("정적 메서드!");
    }
}
