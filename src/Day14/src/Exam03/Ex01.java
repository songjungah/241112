package Exam03;

public class Ex01 {
    public static void main(String[] args) {
        int result = add(10, 20);
        
    }

    static int add(int num1, int num2) {
        try {
            return num1 + num2;
        } finally { // return 뒤에 사용 > 종료하기 전에 무언가 실행해야 할 때 사용
            System.out.println("무조건 실행!");
        }
    }
}
