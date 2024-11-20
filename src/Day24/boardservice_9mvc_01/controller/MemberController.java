package Day24.boardservice_9mvc_01.controller;


import Day24.boardservice_9mvc_01.model.MemberDao;
import Day24.boardservice_9mvc_01.model.MemberDto;


public class MemberController {

    // 싱글톤
    private static MemberController memberController = new MemberController();
    private MemberController(){}
    public static MemberController getInstance() {
        return memberController;
    }

    // 1. 회원가입
    public boolean memberRegister(String id, String pwd) {
        MemberDto memberDto = new MemberDto(id, pwd);
        return MemberDao.getInstance().memberRegister(memberDto);
    }


    // 2. 로그인
    public boolean memberLogin(String id, String pwd) {
        return MemberDao.getInstance().memberLogin(id, pwd);
    }
}


