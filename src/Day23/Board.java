package Day23;

/*
    클래스의 사용처 :
    1. main 함수를 갖는 실행 클래스
    2. 객체 생성하기 위한 객체 설계클래스
    
    클래스(도면지/설계도 > 코드저장) VS 객체(설계도 기반의 메모리 공간)

    ★ 변수와 객체의 차이점 공부하기
    ★ JVM 공부하기
*/

public class Board {    // class s

    // 클래스 구성멤버
    // 1. 필드(멤버변수)
    // - 필드는 초기값이 없으면 정수 : 0 , 실수 : 0.0, boolean : false, 참조타입 : null 기본값으로 들어감
    // - 주의할 점 : 일반 지역변수는 초기값이 없으면 쓰레기 값(임의) 이 들어간다.
    
    // private 를 쓰는 이유
    // - 외부적으로 지정한 필드의 직접 접근을 차단하기 위해
    // - 다른 클래스에 접근을 차단하는 키워드, 즉 현재 클래스에서만 사용 가능

    private static String content;
    private static String writer;
    private static int pwd;



    // 2. 생성자(객체초기화함수)
    // - 객체 생성시 new 뒤로 오는 함수
    // - 조건 : 생성자는 클래스명과 이름이 동일해야 한다. 동일하지 않으면 함수로 취급된다.
    // - 함수랑 차이점 : 생성자는 매개변수(함수 안으로 들어오는 값들을 저장하는 변수)가 있지만
    //                 반환타입(함수가 종료될 때 반환하는 값)이 없다.
    // ★ 오버로딩 : 동일한 함수명/생성자명 으로 생성시 선언은 불가능 하지만 매개변수의 타입, 갯수, 순서에
    //             따라 식별 가능한 함수를 선언하는 방법

    /* 2-1 매개변수가 없는 기본 생성자 */
    Board() {

    }

    /* 2-2 매개변수 1개가 존재하는 생성자 */
    // 자동완성 : 마우스 오른쪽 클릭 : Generate > constructor(생성자 클릭)
    
    // this : 현재 클래스의 필드를 식별할 때 사용하는 키워드
    // - 함수 내 매개변수(지역변수) 와 클래스의 필드명이 충돌(중복)일 때 사용

    public Board(String content) {
        this.content = content;
    }

    /* 2-2 매개변수 2개가 존재하는 생성자 */
    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    /* 2-2 매개변수 3개(전체)가 존재하는 생성자 */
    public Board(String content, String writer, int pwd) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
    }

    
    // 3. 메서드(멤버함수)

    // getter 함수[필드값 호출함수] : private 선언된 필드를 public 함수로 외부 클래스로부터 간접접근 허용한다.

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public int getPwd() {
        return pwd;
    }


    // setter 함수[필드값 저장함수] : private 선언된 필드를 public 함수로 외부 클래스로부터 간접접근 허용한다.
    
    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
    
    
    /*
        toString : 객체의 정보를 반환할 때 사용되는 함수
                 : Object 객체(자바의 최상위 클래스) 의 메소드
    */

    @Override   // 오버라이드 : 재정의 > Object 클래스내 toString 함수를 재정의한다.
                // 원래 toString() 함수는 객체의 주소값을 반환하는 함수인데, 개발자가 주소값 대신
                // 객체의 필드정보를 출력하기 위해 재정의 한다.
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }


}   // class e