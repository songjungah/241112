package Exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num = 50;
        boolean result1 = num >= 10;
        boolean result2 = num <= 100;

        // num 변수가 10이상 100 이하
        boolean result3 = result1 && result2;   // result1, result2 모두 참일 때 참
        System.out.println(result3);

        boolean result4 = num >= 10 && num <= 100;
        System.out.println(result4);

        // System.out.println(result1);
        // System.out.println(result2);
    }
}
