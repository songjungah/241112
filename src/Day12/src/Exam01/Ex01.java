package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        // SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new ProCalculator();    // 이 공식을 더 권장 > 추상화에 의존하게
        int result = cal.add(10, 20);

        System.out.println(result);
    }
}
