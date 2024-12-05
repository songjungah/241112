package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        /*
        JoinService s1 = new JoinService();
        JoinService s2 = new JoinService();


        System.out.println("s1 주소 = " + System.identityHashCode(s1));
        System.out.println("s2 주소 = " + System.identityHashCode(s2));
        System.out.println("s1 == s2 : " + (s1 == s2));
         */

        JoinService s1 = JoinService.getInstance();
        JoinService s2 = JoinService.getInstance();

        System.out.println("s1 주소 = " + System.identityHashCode(s1));
        System.out.println("s2 주소 = " + System.identityHashCode(s2));
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}
