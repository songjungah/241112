package Exam02;

import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 동적으로 클래스의 자원이 데이터 영역으로 로드, 반환값으로 클래스의 정보를 확인할 수 있는 class 클래스 객체 반환
        Class cls = Class.forName("Exam02.Person");

        for (Method method : cls.getMethods()) {
            System.out.println(method);
        }
    }
}
