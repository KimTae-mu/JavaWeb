package cn.web.service;

import cn.web.dao.UserDao;
import cn.web.domain.User;

/**
 * Created by mgc11 on 2017/1/22.
 */
public class UserService {
    //Service层依赖dao层
    private UserDao userDao=new UserDao();
    //Service的查询，需要使用dao来完成
    public User find(){
        return userDao.find();
    }
}
