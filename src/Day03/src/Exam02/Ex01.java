package Exam02;

import java.sql.Struct;

public class Ex01 {
    public static void main(String[] args) {
        int num = 15;
        if (num == 10){     // 조건식이 참일 때 실행
            System.out.println("10 입니다.");
        }else{      // 조건식이 거짓 일 때 실행 
            System.out.println("10이 아닙니다");
        }


        // 간단한 조건문은 삼항 조건 연산식으로 교체 가능
        String result = num == 10 ? "10 입니다." : "10이 아닙니다.";
        System.out.println(result);


        // 실행 코드가 한줄이면 {.. } 생략 가능
        if (num == 10)
            System.out.println("10 입니다.");
        else
            System.out.println("10이 아닙니다");


    }
}
