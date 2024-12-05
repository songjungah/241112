package Exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num = 1 , total = 0;
        // num = 증가하는 수, total = 증가하는 수를 더한 값

        do {    // 반복수행
            total += num;
            num++;

        } while (num < 1);

        System.out.println(total);

        // 초기값, 조건식, 증감식 - 횟수가 있는 반복분에서 필수 요소!

    }
}
