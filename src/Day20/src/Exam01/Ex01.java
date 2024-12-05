package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        Calculator cal2 = (a, b) -> a + b;

        Calculator cal3 = (a, b) -> {
            System.out.println("테스트");
            return a + b;
        };

        int result = cal2.add(10, 20);
        System.out.println(result);
    }
}
