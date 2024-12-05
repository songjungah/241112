package Exam01;

public class Ex02 {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 2;

            try {
                int result = num1 / num2;   // ArithmethicException 발생
                System.out.println(result);

                String str = null;  // 참조변수라 답이 없음
                str = str.toUpperCase();  // 소문자를 대문자로 바꿔줌  // NullPointException 발생

            } catch (ArithmeticException | NullPointerException e) {
                System.out.println(e.getMessage());

            }

            System.out.println("계속 실행...");
        }
    }

