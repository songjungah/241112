package Exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 외부 클래스인 Outer 가 반드시 먼저 객체가 되어야 한다!
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.method();
    }
}
