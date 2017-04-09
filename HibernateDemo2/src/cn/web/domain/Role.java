package cn.web.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Taeyeon-Serenity on 2017/4/9.
 */
public class Role {
    private Long rid;
    private String rname;

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<User> getUsers() {
        return users;

    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    private Set<User> users=new HashSet<User>();
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

}
