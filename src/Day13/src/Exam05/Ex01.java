package Exam05;

public class Ex01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;   // 예외가 발생하면 프로그램이 중단!
            // throw new ArithmethicException();
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("예외 발생!");
            System.out.println(e.getMessage());     // 예외가 나오는 부분이 나옴
            e.printStackTrace();    // ★ 발생위치 ~ 파생위치까지 나옴
        }


        System.out.println("매우 중요한 코드... 실행이 안되는 아주 큰 문제가 발생!");
    }
}
