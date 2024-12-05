package Exam04;

public class Outer {
    public Calculator method(int num3) {    // 지역변수는 함수가 호출됐을 때 할당받고 호출하면 제거됨

        // Calculator cal1 = new Calculator()
        return new Calculator(){
            public int add(int num1, int num2) {
                // num3 = 40;  > final num3 -> 컴파일러가 자동으로 상수로 변환해 데이터 영역 공간 할당
                // 지역 변수의 상수화 - 값을 제거하지 않을 목적
                return num1 + num2 + num3;
            }
        };

        // return cal1;

        // int result = cal.add(10, 20);
        // System.out.println(result);
    }
}
