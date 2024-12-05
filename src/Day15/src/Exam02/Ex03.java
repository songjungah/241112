package Exam02;

public class Ex03 {
    public static void main(String[] args) {
        Book b1 = new Book("책1", "저자1", "출판사1");
        Book b2 = new Book("책2", "저자2", "출판사2");

        System.out.printf("b1 == b2 : %s%n", b1 == b2); // 동일성(주소)
        System.out.printf("b1.equals(b2) : %s%n", b1.equals(b2));
        System.out.printf("b1 주소 : %d%n", System.identityHashCode(b1));
        System.out.printf("b2 주소 : %d%n", System.identityHashCode(b2));
    }
}
