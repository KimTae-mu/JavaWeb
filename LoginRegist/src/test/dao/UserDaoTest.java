package test.dao;

import cn.web.user.domain.User;
import cn.web.user.dao.UserDao;
import org.junit.Test;

/**
 * Created by Taeyeon-Serenity on 2017/3/8.
 */
/*UserDao的测试类*/
public class UserDaoTest {
    @Test
    public void testFindByUsername(){
        UserDao userDao=new UserDao();
        User user = userDao.findByUsername("王五");
        System.out.println(user);
    }

    public static void main(){
        UserDao userDao=new UserDao();

        User user=new User();
        user.setUsername("李四");
        user.setPassword("lisi");
        userDao.add(user);
    }
}
