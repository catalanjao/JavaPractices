package mx.com.axity.model;

import javax.persistence.*;

@Entity
@Table(name = "login", schema = "public")
public class UserDOpwd {
    @Id
    @Column(name = "idusr")
    private Long id;
    @Column(name = "ds_pwd")
    private String pwd;

    public UserDOpwd(Long id, String name) {
        this.id = id;
        this.pwd = name;
    }

    private UserDOpwd() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String name) {
        this.pwd = name;
    }
}
