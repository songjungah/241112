package Day36;

public class Example1 { // class s

    // [4] 멤버변수
    int 멤버변수 = 40;

    // [3] 전역변수
    static int 전역변수 = 20;

    public static void main(String[] args) {    // main s

        // [1] 변수
        int age = 10;

        // [2] 지역변수
        if (10 > 3) {
        // ========================== 지역이라고 생각
            int 지역번수 = 10;
        }
        // ==========================

        // System.out.println(지역번수);       // 오류 발생 - 지역을 벗어나있기 때문

        System.out.println(전역변수);

        임의함수(3);    // 인자&인수 값을 호출하는 함수내 매개변수에 대입
            // int 매개변수1 = 3;
        임의함수(10);
            // int 매개변수1 = 10;

        // System.out.println(멤버변수);       // 오류 발생 - 객체의 멤버이므로 안됨
        Example1 객체 = new Example1();
        System.out.println(객체.멤버변수);    // 객체를 이용한 멤버변수 호출/접근

        Example1 변수 = new Example1();    // 변수가 가지고 있는 자료는 몇개일까? 1개!


    }   // main e

    // 임의함수
    public static void 임의함수(int 매개변수1) {    // 임의함수를 int 에 매개변수로 대입

    }

}   // class e
