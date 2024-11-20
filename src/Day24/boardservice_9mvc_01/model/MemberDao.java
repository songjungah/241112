package Day24.boardservice_9mvc_01.model;


import java.util.ArrayList;

public class MemberDao {

    // 싱글톤
    private static MemberDao memberDao = new MemberDao();
    private MemberDao() {}
    public static MemberDao getInstance() {
        return memberDao;
    }

    // 회원정보 저장하는 리스트
    ArrayList<MemberDto> memberDB = new ArrayList<>();

    // 1. 회원 등록 접근 함수
    public boolean memberRegister(MemberDto memberDto) {
        memberDB.add(memberDto);
        return true;
    }

    // 2. 회원 로그인 접근 함수
    public boolean memberLogin(String id, String pwd) {
        // 회원정보 일치하는지 찾기
        for (MemberDto member : memberDB) { // 회원정보 순회
            // 아이디랑 비밀번호 비교
            if (member.getId().equals(id) && member.getPwd().equals(pwd))
                return true;    // 로그인 성공
        }
        return false;   // 로그인 실패
    }


}
