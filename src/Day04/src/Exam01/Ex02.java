package Exam01;

public class Ex02 {
    public static void main(String[] args) {
        /*
        int num = 1;    // 증가하는 수
        int total = 0;  // 더해지는 합
         */

        // int num = 1, total = 0;

        int num = 1;    // 초기값, 초기화식;
        int total = 0;

        while (num <= 100){     // 조건식
            // total = total + num;
            total += num;   // 복합 대입

            // num = num + 1;  // 1씩 증가
            num++;  // 증감식(증가 또는 감소)
        }

        System.out.println(total);
    }
}
