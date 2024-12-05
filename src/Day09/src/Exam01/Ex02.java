package Exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 1000;  // 공간 할당을 이미 받아서 무리없이 사용 가능 > 클래스 변수
        System.out.println(Student.id);

        Student.staticMethod();     // 클래스 메서드
    }
}
