package Day24.boardservice_9mvc_03.controller;

import Day24.boardservice_9mvc_03.model.MemberDao;
import Day24.boardservice_9mvc_03.model.MemberDto;

public class MemberController {

    // 싱글톤
    private static MemberController memberController = new MemberController();
    private MemberController() {}
    public static MemberController getInstance() {
        return memberController;
    }

    // 현재 로그인된 사용자 정보
    private MemberDto loggedInUser = null;

    // 1. 회원 등록 제어함수
    public boolean memberRegister(String id, int pwd) {
        // 1) 유효성 검사
        // 2) 검사 통과 후 서로 다른 데이터를 하나(객체)로 만들기
        MemberDto memberDto  = new MemberDto(id, pwd);
        return MemberDao.getInstance().memberRegister(memberDto);
    }

    // 2. 로그인 메서드
    public boolean memberLogin(String id, int pwd) {
        MemberDto member = MemberDao.getInstance().findMemberById(id);  // ID로 회원 찾기

        // ID와 비밀번호 확인
        if (member != null && member.getPwd() == pwd) {
            loggedInUser = member;  // 로그인 성공 시 저장
            return true;
        }
        return false;   // 로그인 실패
    }

    // 현재 로그인 된 사용자 반환
    public MemberDto getLoggedInUser() {
        return loggedInUser;
    }

    // 로그아웃 처리
    public void logout() {
        loggedInUser = null;
    }

}
