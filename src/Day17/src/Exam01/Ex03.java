package Exam01;

public class Ex03 {
    public static void main(String[] args) {
        String str = Transportation.BUS.name();
        System.out.println(str);

        int pos = Transportation.SUBWAY.ordinal();  // 순서번호
        System.out.println(pos);
    }
}
