package Exam01;

public class Ex05 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1, j = 100; i <= 100; i++, j--){
            total += i;
            System.out.println("j = " + j);
        }

        System.out.println(total);
    }
}
