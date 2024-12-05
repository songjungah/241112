package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        System.out.println(trans instanceof Transportation);

        Enum<Transportation> e = trans;     // 자동 형변환 > 상속관계
    }
}
