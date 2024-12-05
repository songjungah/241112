package Exam01;

public class Ex09 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;
        
        // 연산은 같은 자료형만 가능
        // (int)(a+b) >> 이렇게 계산을 해야 오차 범위가 발생안함

        int sum = (int)(num1 + num2);
        int difference = (int)(num1 - num2);
        int multiplication = (int)(num1 * num2);
        int division = (int)(num1 / num2);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiplication);
        System.out.println(division);

    }
}
