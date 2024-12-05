package Exam04;

public class Box<T extends Fruit & Eatable> {   // T는 객체를 만들 때 생성
    private T item;     // Apple, Grape, Banana, Fruit

    // 정적 변수는 처음부터 공간을 할당 받으므로 처으부터 공간의 크기를 알 필요가 있음
    // 정적 변수는 자료형을 명시하는게 필수! (지네릭 타입 사용 불가)
    // private static T item2;

    // 배열을 생성하는 new 연산자는 자료형이 명확하게 결정되어 있어야 할당될 공간을 계산할 수 있다!
    // 배열에서도 지네릭 타입 사용 X
    // private T[] items = new T[3];

    public void setItem(T item) {   
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        // return item.info();     // Fruit

        return item.info();     // Fruit info 메서드
    }
}