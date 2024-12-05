package Exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num = 10;
        // boolean result1 = num++ > 10 && (num = num + 20) >= 20;      // 11 false > 왼쪽 항이 false 라서 오른쪽 항 체크를 안함 >> 단락회로 평가
        boolean result1 = ++num > 10 && (num = num + 20) >= 20;         // 31 true

        System.out.println(num);
        System.out.println(result1);
    }
}
