package cn.web.domain;

/**
 * Created by mgc11 on 2017/1/22.
 */
/*把数据库中查询的结果保存到这个对新娘中。*/
public class User {
    private String username;
    private String password;

    public User() {
        super();
    }

    public User(String s1, String s2) {
        this.username=s1;
        this.password=s2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
