package mx.com.axity.model;
import javax.persistence.*;

@Entity
@Table(name = "login", schema = "public")
public class LoginDO {
    @Id
    @Column(name = "usr")
    private Long usr;
    @Column(name = "pwd")
    private String pwd;

    private LoginDO() {
    }

    public LoginDO(Long usr, String pwd) {
        this.usr = usr;
        this.pwd = pwd;
    }

    public Long getUsr() {
        return usr;
    }

    public void setUsr(Long usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
