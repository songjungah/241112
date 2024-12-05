package Exam04;

public class Ex03 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();  // 이미 앞에 apple이 정의되어 있어서 뒤에 apple을 적지않아도 됨
        appleBox.setItem(new Apple());

        System.out.println(appleBox);   // appleBox.toString() 이 자동으로 붙음
    }
}
