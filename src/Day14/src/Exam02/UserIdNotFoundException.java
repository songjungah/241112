package Exam02;

public class UserIdNotFoundException extends RuntimeException /* extends Exception */ {
    public UserIdNotFoundException(String message) {
        super(message);
    }
}
