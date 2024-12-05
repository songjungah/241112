package Exam06;

public class Box<T, U> {    // 지네릭 클래스
    private T item;     // Box<자료형1, 자료형2> box = new Box<>();   -> 진행 클래스 형태
    private U item2;

    public void setItem(T item, U item2) {

    }

    // void 앞에 < >를 끼고 있으면 메서드, 메서드는 호출 시 결정 > method(String, LocalDate) - 지네릭 메서드
    public <T, U> void method(T t, U u) {       // 위에 T와 아래의 T는 같지 않음
        
    }
}
