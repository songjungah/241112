package Exam01;

public class Student {
    int id;     // 학번
    String name;    // 학생명
    String major;   // 전공과목

    void study() {
        System.out.printf("%s(%d)이 %s를 전공한다", name, id, major);
    }
}
