package mx.com.axity.commons.to;

import java.io.Serializable;

public class LoginTO implements Serializable {
    private long usr;
    private String pwd;

    public long getUsr() {
        return usr;
    }

    public void setUsr(long usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
