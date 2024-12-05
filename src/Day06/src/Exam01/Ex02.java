package Exam01;

public class Ex02 {
    public static void main(String[] args) {
        int result = calc(3);   // x = 3
        System.out.println(result);
    }

    // int x : 매개변수
    static int calc(int x) {
        int y = x * 2 + 3;

        return y;
    }
}
