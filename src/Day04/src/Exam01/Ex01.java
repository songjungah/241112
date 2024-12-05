package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        int rank = 4;
        
        // 'A' > case 값으로 가능, 문자형(char) : 양의 정수

        switch (rank){
            case 1:
                System.out.println("금메달");
                break;  // 실행 종료
            case 2:
                System.out.println("은메달");
                break;  // 실행 종료
            case 3:
                System.out.println("동메달");
                break;  // 생략 가능
            default:
                System.out.println("입상");
        }
    }
}
