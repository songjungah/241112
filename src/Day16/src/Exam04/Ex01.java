package Exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();     // 타입에 Apple 담기
        // 객체 생성시 <Apple> 힌트 : Object -> Apple 형변환
        // ★객체 생성시 지네릭 타입의 자료형이 결정된다!
        appleBox.setItem(new Apple());
        
        // appleBox.setItem(new Banana());      // 타입 안정성 확보
        Apple apple = appleBox.getItem();       // 형변환의 번거로움이 X
        System.out.println(apple.info());
    }
}