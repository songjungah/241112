package Exam04;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal1 = out.method(30);
        int result = cal1.add(10, 20);
        System.out.println(result);
    }
}
