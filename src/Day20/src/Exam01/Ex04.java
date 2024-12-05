package Exam01;

public class Ex04 {
    public static void main(String[] args) {

        int c = 10;

        Calculator cal2 = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                // c = 20;     // 지역변수의 상수화 final int c;
                return num1 + num2;
            }
        };

        Calculator cal = (a, b) -> {
            // c = 20;     // 지역변수의 상수화 final int c;
            return a + b;
        };

    }
}
