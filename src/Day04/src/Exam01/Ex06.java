package Exam01;

public class Ex06 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100; i++){
            /*
            if(i % 2 == 1){ // 홀수 일 때 더하기
                total += i;
             */
            
            if (i % 2 == 0){
                continue;   // 짝수 일 때 반복 건너띄기
            }
            total += i;     // 홀수만 더해진다.
        }

        System.out.println(total);
    }
}
