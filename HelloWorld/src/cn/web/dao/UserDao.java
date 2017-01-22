package cn.web.dao;

import cn.web.domain.User;

/**
 * Created by mgc11 on 2017/1/22.
 */
public class UserDao {
    /*把xml中的数据查询出来之后，封装到user对象中，然后返回*/
    public User find(){
        return new User("zhangsan","123");
    }
}
