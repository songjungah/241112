package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();     // 함수정의 > 객체를 만들어주는 기능 (= 요리를 만들어주는 사람)
                                        // s1 : 지역변수(주소)  new Student : 생성자 함수
                                        // 반환값 : 생성된 객체의 주소
        s1.id = 1000;
        s1.name = "이름";
        s1.major = "전공";
    }
}
