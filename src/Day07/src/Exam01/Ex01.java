package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;   // 인스턴스 변수(id)
        s1.name = "이이름";    // 인스턴스 변수(name)
        s1.major = "수학";

        s1.showInfo();

        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "영어";

        s2.showInfo();

        System.out.println(System.identityHashCode(s2));

        Student s3 = s2;
        s3.name = "최이름";

        s3.showInfo();

        System.out.println(System.identityHashCode(s3));

        s2.showInfo();


    }
}
