package Exam01;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C();  // C > B > A

        // 두가지가 가능한 이유는 C안에 포함됐다는 출처가 명확하기 때문
        A a = c;    // 다형성
        B b = c;    // 다형성 > 하위 클래스의 객체는 상위 클래스의 자료형으로 자동 형변환!
    }
}
