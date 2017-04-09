package cn.web.test;

import cn.web.domain.User;
import cn.web.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;


/**
 * Created by Taeyeon-Serenity on 2017/3/28.
 */
public class Demo2{
    /*添加查询的条件*/
    @Test
    public void run2(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        //查询的方式 HQL form User where 属性 条件
        //SQL：select * from t_user where 字段 条件
        Query query=session.createQuery("from User where age>:aaa");
        //设置值
        query.setInteger("aaa",18);
        //查询
        List<User> list=query.list();
        for(User user : list){
            System.out.println(user);
        }
        tr.commit();
        session.close();
    }

    @Test
    public void run1(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        //先获取到Criteria接口
        Criteria criteria = session.createCriteria(User.class);
        //添加查询的条件是select * from user where age > 18
        //Criterion是Hibernate提供的条件查询的对象，想传入条件的使用的工具类

        //Restrictions提供的是静态的方法，拼接查询的条件
        criteria.add(Restrictions.gt("age",30));

        //没有添加条件，查询所有的数据
        List<User> list=criteria.list();
        System.out.println(list);
        tr.commit();
        session.close();
    }
}
