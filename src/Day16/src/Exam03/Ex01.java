package Exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        // appleBox.setItem(new Banana());




        // 타입 안정성이 확보 X
        Object obj = (Apple)appleBox.getItem();    // 형변환 번거로움 > object 형태를 바꿔주기 때문
        if (obj instanceof Apple apple) {
            System.out.println(apple.info());
        }
    }
}
