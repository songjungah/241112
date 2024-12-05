package Exam05;

import java.util.List;

public class Juicer {

    // 와일드 카드 > ?는 호출되는 시점에 자동으로 결정됨 / ? - Fruit, Apple, Grape
    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    // ? - Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static void make3(FruitBox<? extends Fruit> fruitBox, FruitBox<? extends Fruit> fruitBox2) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit, U extends Fruit> void make4(FruitBox<? extends Fruit> fruitBox, FruitBox<? extends Fruit> fruitBox2) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make5(FruitBox<T> fruitBox) {

    }


    /*
    public static void make(FruitBox<Grape> grapeBox) {     // 메서드 중복 정의
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }
     */

}
