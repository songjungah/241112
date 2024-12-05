package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;   // 변수 정의 -> 변수
        s1.name = "김이름";
        s1.major = "자바";

        s1.study();

        System.out.println(System.identityHashCode(s1));
    }
}
