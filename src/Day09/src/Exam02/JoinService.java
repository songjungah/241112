package Exam02;

public class JoinService {

    // private static JoinService instance = new JoinService();
    private static JoinService instance;

    private JoinService() {

    }

    public static JoinService getInstance() {
        if (instance == null) {
            instance = new JoinService();
        }

        return instance;
    }
    
    public void process() {
        System.out.println("회원 가입 기능 처리");
    }
}
