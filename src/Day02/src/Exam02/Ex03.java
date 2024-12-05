package Exam02;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println(result);

        int num3 = 10;
        double num4 = 20.0;

        double result2 = num3 + num4;    // int num3 -> double num3 으로 자동 형변환이 됨
        System.out.println(result2);
    }
}
