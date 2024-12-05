package Exam01;

public class Ex04 {
    public static void main(String[] args) {
        int total = 0;

        for (int num = 1; num <= 100; num++){
            total += num;

            if (num == 50) {
                break;  // 반복 중단
            }
        }

        System.out.println(total);
    }
}
