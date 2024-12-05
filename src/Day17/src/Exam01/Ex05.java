package Exam01;

import static Exam01.Transportation.*;      // 정적 자원은 다 가능

public class Ex05 {
    public static void main(String[] args) {
        // Transportation trans = new Transportation();

        String str1 = BUS.getTitle();
        String str2 = SUBWAY.getTitle();
        String str3 = TAXI.getTitle();

        System.out.printf("str1 = %s, str2 = %s, str3 = %s%n", str1, str2, str3);
    }
}
