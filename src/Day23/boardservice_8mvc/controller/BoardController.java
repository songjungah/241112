package Day23.boardservice_8mvc.controller;

import Day23.boardservice_8mvc.model.BoardDao;
import Day23.boardservice_8mvc.model.BoardDto;

public class BoardController {

    // 1. 게시물 등록 제어 함수
    public boolean boardWrite(String content, String writer, int pwd) {
        
        // 1. 다양한 데이터 검사 = 유효성 검사, 오늘은 생략
        
        // 2. 유효성 검사를 통과했으면 서로 다른 데이터를 하나로(객체로) 만들기
        BoardDto boardDto = new BoardDto(content, writer, pwd);
        
        // 3. 입력받은 객체를 저장하기 위해 Dao에 전달하고 결과를 응답받기
        BoardDao boardDao = new BoardDao();
        return boardDao.boardWrite(boardDto);

    }

    // 2. 게시물 출력 제어 함수
    public void boardPrint() {

    }

}
