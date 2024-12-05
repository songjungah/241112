package Exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립보행!");
    }

    public void reading() {
        System.out.println("책을 읽는다!");

    /*
    @Override
    public void move() {    // 메서드 재정의
        System.out.println("두 발로 직립보행!");
     */
    }

}
