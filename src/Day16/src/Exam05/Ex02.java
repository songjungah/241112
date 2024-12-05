package Exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make2(appleBox);

        FruitBox<Fruit> grapeBox = new FruitBox<>();    // 다형성을 이용 Grape > Fruit 변경
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        
        Juicer.make2(grapeBox); // Apple, Fruit, Object 만 가능
    }
}
