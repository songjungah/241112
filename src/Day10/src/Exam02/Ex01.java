package Exam02;

import Exam01.A;

public class Ex01 {
    public static void main(String[] args) {
        Animal bird = new Bird(); // Bird, Animal > 다형성
        bird.move();

        Animal tiger = new Tiger();  // Tiger, Animal > 다형성
        tiger.move();

        Animal human = new Human();  // Human, Animal > 다형성
        human.move();
    }
}
