package Exam01;

public class Ex09 {
    public static void main(String[] args) {
        int num = 10;
        boolean result1 = ++num > 10 || (num = num + 20) >= 20;     // 11 true > 왼쪽항이 이미 true로 나와서 연산할 필요가 없다고 판단 >> 단란회로 평가
        // boolean result1 = num++ > 10 || (num = num + 20) >= 20;      // 31 true > 왼쪽항은 false 오른쪽 항이 true 여서 계속 연산을 해서 31이고 둘중 하나가 true 이기 때문에 true

        System.out.println(num);
        System.out.println(result1);
    }
}
