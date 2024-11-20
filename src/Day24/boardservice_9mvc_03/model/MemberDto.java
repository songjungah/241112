package Day24.boardservice_9mvc_03.model;

public class MemberDto {

    private String id;
    private int pwd;

    public MemberDto(String id, int pwd)  {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
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
