package Day24.boardservice_9mvc_03.model;

import java.util.ArrayList;

public class MemberDao {

    // 싱글톤
    private static MemberDao memberDao = new MemberDao();
    private MemberDao() {}
    public static MemberDao getInstance() {
        return memberDao;
    }
    
    ArrayList<MemberDto> memberDB = new ArrayList<>();
    
    // 1. 회원등록
    public boolean memberRegister(MemberDto memberDto) {
        if (findMemberById(memberDto.getId()) == null) {    // 중복검사
            memberDB.add(memberDto);    // 회원추가
            return true;
        }
        return false;
    }

    // 2. id 로 해당 회원 찾기
    public MemberDto findMemberById(String id) {
        for (int i = 0; i < memberDB.size(); i++) {
            MemberDto member = memberDB.get(i); // i 번째 회원 가져오기
            if (member.getId().equals(id)) {
                return member;      // 일치하는 회원 반환
            }
        }
        return null;    // 회원을 조회할 수 없는 경우
    }

}
