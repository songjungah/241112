package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();   // 접근 제어자를 이용
        /*
        s1.year = 2024;
        s1.month = 2;
        s1.day = 31;    // 통제가 불가
        */

        s1.setYear(2024);   // setter 메서드
        s1.setMonth(2);
        s1.setDay(31);

        int month = s1.getMonth();  // getter 메서드
        System.out.println(month);

        s1.showDate();
    }
}
