package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "수학");
        Student s2 = new Student(1001, "김이름", "영어");

        s1.showInfo();
        s2.showInfo();




        s1.id = 1002;   // 인스턴스 변수인지 정적 변수인지 알아보기가 힘듦 > 권장하지 X
    }
}
