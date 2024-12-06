package Day38.Dao;

import Day31.boardservice_11mvc.model.BoardDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    // JDBC 인터페이스, import java.sql로
    protected Connection conn;

    // 싱글톤
    private static Dao dao = new Dao();
    //생성자에서 DB 연동 코드 작성
    private Dao() {

        try {
            // 1.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1125", "root", "1234");
            System.out.println("[BoardDB Connection OK]");

        } catch (ClassNotFoundException e) {
            e.getMessage();
            System.out.println("[BoardDB Connection fail]");
            // 실패이유 : 1. 프로젝트내 JDBC 라이브러리 등록    2. 오타(클래스경로, DB서버경로) 확인       3. MYSQL 워크벤치에서 DB 존재 체크

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("[BoardDB Connection fail]");
        }
    }
}
