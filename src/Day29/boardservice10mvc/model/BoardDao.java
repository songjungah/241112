package Day29.boardservice10mvc.model;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
    Boardservice8mvc 패키지를 복사하여 Boardservice10mvc 으로 변경해서 진행
    1. JAVA 와 DB를 연동하는 JDBC 라이브러리 다운로드
        1) JDBC 라이브러리 https://dev.mysql.com/downloads/ 들어가서 Connector/J 클릭
        2) Select Operation System :
            - Platform Independent (Architecture Independent), ZIP Archive	9.1.0	5.1M 설치
            - 다운로드 후 압축 풀기
            - 폴더 내 mysql-connector-j-9.1.0 파일 확인
        
    2. 현재 프로젝트내 JDBC 라이브러리 등록/추가
        1) 준비된 mysql-connector-j-9.1.0 파일을 현재 프로젝트내 폴더로 이동/복사
        2) 이동/복사된 mysql-connector-j-9.1.0 파일을 오른쪽 클릭 > Add as Library 클릭 > 건들지말고 OK 클릭
        - 프로젝트마다 1번만 해도 됨
    
    3. 현재 프로젝트 내 외부 라이브러리 목록 확인하는 방법
        1) File > Project Structure > 왼쪽 탭 Libraries 에 존재하면 성공
        ※ 주의할점 : PC가 변경되면 경로가 변경되므로 다시 등록해야 될 경우가 있다.

    ================================================================================

    [1] JDBC 라이브러리 이용한 D[Data]A[Access]O[Object] 에 DB내 데이터에 접근하는 객체 만들기
        1. dao 생성자에서 연동 코드 작성
*/


public class BoardDao { // 주로 싱글톤

    private Connection connection;  // DB 연동 인터페이스 > DB 연동 결과를 가지고 있어서 DB 조작이 가능한 인터페이스

    // 싱글톤
    private static BoardDao boardDao = new BoardDao();
    private BoardDao() {

        // DB 연동시 필요한 코드 2줄
        try {
            // [1] 외부라이브러리(JDBM) 폴더 내 com폴더 > mysql폴더 > cj폴더 > jdbc폴더 > Driver 클래스 호출   * 일반예외
            // forName() : 특정한 클래스를 호출하는데 사용되는 함수 > 만일 클래스가 존재하지 않으면 어떻게 해야 하는지 일반 예외에서 처리
            Class.forName("com.mysql.cj.jdbc.Driver");

            // [2] DB 연동 인터페이스 만들기, DriverManager.getConnection("MYSQLSERVER_URL/DB명", "계정명", "비밀번호");
            // DriverManager.getConnection() : DB SERVER 와 연동을 성공 했을 때 연동된 결과의 객체를 반환
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1122", "root", "1234");

            // [3] DB 연동 확인
            System.out.println("[3] DB 연동 성공");

            // 연동에 실패하는 이유 : 1. 프로젝트에 JDBC 라이브러리 등록을 하지 않았다.    2. DB연동 url 경로 "jdbc:mysql://localhost:3306/mydb1122" 오타 확인
            
            
        } catch (ClassNotFoundException e) {
            e.getException();

        } catch (SQLException e) {
            e.getSQLState();
        }

    }
    public static BoardDao getInstance() {
        return boardDao;
    }


    // 여러개 게시물을 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();
    
    // 1. 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        // boardDB.add(boardDto);

        try {

            // [1] connection.prepareStatement(BML(SQL) 작성) : 연동된 DB 에 SQL를 서명을 준비하는 함수         * 일반 예외
            PreparedStatement ps = connection.prepareStatement("insert into board(bcontent, bwriter, bpwd) values('여기는 java', '유재석', 1234)");

            // [2] 서명된 SQL 실행
            ps.execute();

        } catch (SQLException e) {
            e.getMessage();
        }

        return true;
    }
    
    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

}
