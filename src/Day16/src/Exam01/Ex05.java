package Exam01;

public class Ex05 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        long num11 = num1.longValue();  // 10L
        long num22 = num2.longValue();  // 10L

        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));
    }
}
