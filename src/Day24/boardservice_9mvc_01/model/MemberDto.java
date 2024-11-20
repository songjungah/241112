package Day24.boardservice_9mvc_01.model;

public class MemberDto {

    private String id;
    private String pwd;


    public MemberDto(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
