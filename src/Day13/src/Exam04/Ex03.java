package Exam04;

public class Ex03 {
    public static void main(String[] args) {
        A a = new A() { // ctrl + O > 메서드 재정의 단축키
            @Override
            public void method() {
                System.out.println("변경된 메서드!");
            }
        };

        a.method();
    }
}
