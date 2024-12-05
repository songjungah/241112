package Exam03;

public class Ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.printf("str 주소 : %d%n", System.identityHashCode(str));

        str += "DEF";
        System.out.printf("str 주소 : %d%n", System.identityHashCode(str));

        str += "GHI";
        System.out.printf("str 주소 : %d%n", System.identityHashCode(str));

        System.out.println(str);    // ABCDEFGHI

        String str2 = "ABCDEFGHI";
        System.out.println(str == str2);    // false
        System.out.println(str2.equals(str));
    }
}
