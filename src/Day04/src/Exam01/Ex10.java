package Exam01;

public class Ex10 {
    public static void main(String[] args) {

        for(int i = 1; i <= 40; i ++){
            int roomNum = i % 10;   // 0~9
            System.out.printf("학생%d, 방번호 %d번%n", i, roomNum);
        }

    }
}
