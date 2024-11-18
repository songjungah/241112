package Day25.boardservice_9mvc.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
    boardservice9mvc
        - boardservice8mvc 패키지를 복사해서 boardservice9mvc 패키지명 변경 후 진행
        - 조건 : 파일 입출력을 활용하여 프로그램이 종료되고 다시 실행 했을 때 영구 저장 되도록 하시오.

    [생각해보기]
    1. txt 메모장은 문자열만 저장되는 윈도우 프로그램의 확장자
    2. 게시물들( ArrayList<BoardDto> ) 저장을 하기 위해서는 변환이 필요하다. / java(객체지향 O)
    ※ 문제점 발견 : 서로 다른 언어/프로그램들 간의 데이터를 주고 받으려면 형식/타입이 같으면 좋을텐데.
        - 관례적으로 사용되는 타입 : CSV, JSON, XML 파일 타입을 주로 사용함
        - 서로 다른 언어/프로그램 들간의 공통된 형식/타입을 사용하므로 데이터 통신하자!!!
        
    [CSV]
    1. , 쉼표로 구분된 문자열로 구성된 파일 형식
    2. \n 백슬래쉬n 이용한 줄바꿈 처리
    3. .csv 확장자를 가진다

    [게시물 객체를 CSV 형식으로 변환]
    1. boardDto(content = "안녕하세요", writer = "유재석", pwd = 1234) : 자바 객체를 임의로 시각화
    2. 하나의 문자열로 필드명을 제외한 필드값들을 , 쉼표로 구분하여 문자열로 반환 : "안녕하세요, 유재석, 1234"

    [여러개 게시물 객체가 존재 했을 때]
    Point 01 : 필드간의 구분을 , 쉼표로 한다.
    Point 02 : 객체간의 구분을 \n 으로 한다.
        ex) "안녕하세요, 유재석, 1234 \n 그래 안녕, 강호동, 4567"

*/

public class BoardDao { // 주로 싱글톤

    // 싱글톤
    private static BoardDao boardDao = new BoardDao();
    private BoardDao() {}
    public static BoardDao getInstance() {
        return boardDao;
    }

    Scanner scan = new Scanner(System.in);


    // 여러개 게시물을 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();
    
    // 1. 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        // 만약에 리스트에 게시물 객체를 추가 했다면, 파일에도 추가된 게시물을 쓰기
        fileSave();
        return true;
    }
    
    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

    // ==================== 영구저장을 위한 게시물들을 파일에 저장 기능 ====================  //
    public void fileSave() {    // 게시물 등록을 성공했을 때 지정한 함수 사용/호출

        // 여러개 게시물들을[ArrayList<BoardDto> boardDB] 하나의 문자열[String/CSV] 로 표현하는 방법
        // 1. 임의의 문자열 변수 선언
        String outStr = "";
        
        // 2. 반복문을 이용한 모든 게시물들을 순회/반복
        for (int index = 0; index <= boardDB.size(); index++) { // 리스트 객체내 0번 인덱스부터 마지막 인덱스까지 반복

            // 3. index 번째의 게시물
            BoardDto boardDto = boardDB.get(index);
            
            // 4. [객체 내 필드구분] index 번째의 게시물의 필드값을 CSV 형식으로 변환, 필드값을 출력 후 사이사이에 , 쉼표를 이용한 CSV 형식 만들기
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd();
            // += 복합대입연산자 : 오른쪽 값을 왼쪽 변수 값과 더한 후 에 결과를 왼쪽 변수에 대입

            // 5. [객체 구분]
            outStr += "\n";
            
        }
        System.out.println(outStr); // 확인용

        
        // 예외처리
        // try{} catch(){} : try{} 에서 예상치 못한 예외가 발생 했을 때 지정된 catch 코드로 흐름을 이동하는 문법
        try {

            // [1] 파일 출력 객체 생성한다.
            FileOutputStream outputStream = new FileOutputStream("./src/Day25/boardservice_9mvc/data.txt");

            // [2] 파일 출력 객체를 이용한 바이트 쓰기/내보내기
            outputStream.write(outStr.getBytes());  // 위에서 객체들을 모두 CSV 형식으로 변환된 문자열을 바이트로 변환
            
            // [3] 안내 메시지
            System.out.println("[파일 저장 성공]");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ==================== 영구저장 된 파일의 게시물들을 가져오는 기능 ====================  //
    public void fileLoad() {

        try {

            // [1] 파일 입력 객체 생성
            FileInputStream inputStream = new FileInputStream("./src/Day25/boardservice_9mvc/data.txt");

            // [2] 파일 용량만큼 바이트 배열 선언
            File file = new File("./src/Day25/boardservice_9mvc/data.txt");
            byte[] bytes = new byte[(int) file.length()];

            // [3] 파일 입력 객체를 이용한 파일 읽어서 바이트 배열 저장
            inputStream.read(bytes);

            // [4] 읽어온 바이트 배열을 문자열(String)으로 변환
            String inStr = new String(bytes);

            // [5] 활용과제 : 파일로부터 읽어온 문자열의 게시물 정보들을 다시 ArrayList<BoardDto> boardDB 에 저장하시오.

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
