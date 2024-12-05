package Exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1++;  // ++의 연산순서가 밀려서 대입되어 num2 = 10 이 먼저 나오고 num1 ++가 적용되어 num1 = 11이 나옴
                            // 1) 대입(=) : 10    2) ++(증가 연산) : 11
        
        System.out.println(num2);
        System.out.println(num1);
    }
}
