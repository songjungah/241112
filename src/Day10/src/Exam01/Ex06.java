package Exam01;

public class Ex06 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        // System.out.println(ad == ac);

        // C c1 = (C)ad;   // 적용은 되지만 출처가 다른 객체라 문제가 생김

        if (ad instanceof D) {
            C c1 = (C)ad;
        }
    }
}
