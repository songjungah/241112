package Exam01;

public class Ex04 {
    public static void main(String[] args) {
        String trans = "TAXI";
        // Transportation taxi = Enum.valueOf(Transportation.class, trans);    // Enum 함수로 바뀜

        Transportation taxi = Transportation.valueOf(trans);

        System.out.println(taxi);
    }
}
