package Day23.boardservice_8mvc.model;

import Day23.Board;

import java.util.ArrayList;

public class BoardDao { // 주로 싱글톤

    // 싱글톤
    private static BoardDao boardDao = new BoardDao();
    private BoardDao() {}
    public static BoardDao getInstance() {
        return boardDao;
    }


    // 여러개 게시물을 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();
    
    // 1. 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        return true;
    }
    
    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

}
