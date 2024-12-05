package Exam02;

import Exam01.A;
import Exam01.B;

public class Ex05 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bird(),
                new Tiger(),
                new Human()
        };

        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Human) {
                Human human = (Human) animal;   // 다운 캐스팅
                human.reading();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;  // 다운 캐스팅
                bird.singing();
            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            }   // else 를 넣지 않으면 모든 조건이 거짓일 경우 아무 것도 실행되지 않게 됨 > 필요에 따라 넣으면 됨
        }

    }
}
