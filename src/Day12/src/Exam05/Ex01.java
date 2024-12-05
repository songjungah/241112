package Exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();    // 외부 클래스의 객체를 만들어야함
        Outer.Inner in = out.new Inner();    // Outer 클래스로 객체를 생성한 이후 객체를 생성할 수 있다!
        in.method();
    }
}
