package Exam01;

public class Ex08 {
    public static void main(String[] args) {
        // JDK17 - instanceof 사용하는 경우, 많은 경우가 하위 클래스로 형변환 하기 전에 체크해볼 때 주로 사용
        A ac = new C();

        if (ac instanceof C c) {

        }
        // 위 아래가 같은 의미
        // instanceof 는 주로 다운캐스팅 (상위클래스 > 하위클래스로 바꿀 때 사용)
        if (ac instanceof C) {
            C c1 = (C) ac;
        }
    }
}
