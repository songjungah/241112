package Exam05;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        // Juicer.<Apple>make(appleBox);  // 매개변수를 보고 타입이 결정
        Juicer.make(appleBox);      // <?> : 메서드 호출 시 Apple 형변환


        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make(grapeBox);      // <?> : 메서드 호출 시 Grape 형변환


        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());
        toyBox.add(new Toy());

        // Juicer.make(toyBox);
    }
}
