package Exam02;

import Exam01.A;

public class Ex03 {
    public static void main(String[] args) {
        /*
        Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Tiger();
        animals[2] = new Human();
         */
        
        // 위와 같지만 좀 더 편하게 정리한다면 아래쪽
        Animal[] animals = {
                new Bird(),
                new Tiger(),
                new Human()
        };

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
