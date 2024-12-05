package Exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);
    }
    
    /*
    * num1, num2, result - 함수가 호출 될때만 변수
    *                    - 함수 지역내에서만 의미가 있는 변수
    *                    - 지역 변수
    * @param num1
    * @param num2
    * @return
    * */
    static int add(int num1, int num2){ // 함수 지역

        int result = num1 + num2;

        return result;  // 함수 연산 종료
    }

}
