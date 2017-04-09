package cn.web.test;

import cn.web.domain.Customer;
import cn.web.domain.User;
import cn.web.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/3/20.
 */
/*测试Hibernate框架*/
public class Demo1 {
    /*测试保存客户*/
    @Test
    public void testSave(){
        /*1.先加载配置文件
        *  2.创建SessionFactory对象，生成Session对象
        *  3.创建Session对象
        *  4.开启事务
        *  5.编写保存的代码
        *  6.提交事务
        *  7.释放资源
        *  */
        //1.先加载配置文件
        Configuration config=new Configuration();
        //默认加载src目录下hibernate.cfg.xml的配置文件
        config.configure();
        //手动加载：config.addResource("cn.web.domain/Customer.hbm.xml");

        //2.创建SessionFactory对象，生成Session对象
        SessionFactory factory=config.buildSessionFactory();

        //3.创建Session对象
        Session session=factory.openSession();

        //4.开启事务
        Transaction tr=session.beginTransaction();

        //5.编写保存的代码
        Customer c=new Customer();
        c.setCust_name("测试4");
        c.setCust_level("2");
        c.setCust_phone("119");
        //保存数据，操作对象就相当于操作数据库的表结构
        session.save(c);

        //6.提交事务
        tr.commit();

        //7.释放资源
        session.close();
        factory.close();
    }

    /*测试工具类*/
    @Test
    public void testSave2(){
        //原来：先加载配置文件，获取Factory，获取session
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();

        Customer c=new Customer();
        c.setCust_name("小风");
        session.save(c);
        //提交事务
        tr.commit();
        //释放资源
        session.close();
    }

    /*测试get()方法，获取查询，通过主键来查询一条记录*/
    @Test
    public void testGet(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        //测试查询的方法 2个参数：前者为查询JavaBean的Class对象，后者为主键的值
        Customer c=session.get(Customer.class,2L);
        System.out.println(c);
        tr.commit();
        session.close();
    }

    /*测试删除的方法
    * 注意：删除或者修改，先查询再删除或者修改*/
    @Test
    public void testDel(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        Customer c=session.get(Customer.class,2L);

        //删除客户
        session.delete(c);
        tr.commit();
        session.close();
    }

    /*测试修改*/
    @Test
    public void testUpdate(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();

        Customer c=session.get(Customer.class,1L);
        //设置客户的信息
        c.setCust_level("4");

        //修改
        session.update(c);
        tr.commit();
        session.close();
    }

    /*测试添加或者修改*/
    @Test
    public void testSaveOrUpdate(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();

        //演示错误
        Customer c=new Customer();
        c.setCust_id(10L);
        c.setCust_name("ceshi");
        //保存或者修改
        session.saveOrUpdate(c);

        tr.commit();
        session.close();
    }

    /*测试查询的方法*/
    @Test
    public void testSel(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();

        //创建查询的接口
        Query query=session.createQuery("from Customer");
        //查询所有的数据select * from 表
        List<Customer> list = query.list();
        for(Customer customer : list){
            System.out.println(customer);
        }
        tr.commit();
        session.close();
    }

    /*测试保存*/
    @Test
    public void testSave3(){
        Session session=null;
        Transaction tr=null;
        try{
            //获取session
            session=HibernateUtils.getSession();
            //开启事务
            tr=session.beginTransaction();
            //执行代码
            Customer c=new Customer();
            c.setCust_name("哈哈");
            //保存
            session.save(c);
            //提交事务
            tr.commit();
        }catch (Exception e){
            //回滚事务
            tr.rollback();
            e.printStackTrace();
        }finally {
            //释放资源
            session.close();
        }
    }

    @Test
    public void run2(){
        Session session=HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        //查询的方式 HQL form User where 属性 条件
        //SQL：select * from t_user where 字段 条件
        Query query=session.createQuery("from User where age>:aaa");
        //设置值
        query.setInteger("aaa",30);
        //查询
        List<User> list=query.list();
        for(User user : list){
            System.out.println(user);
        }
        tr.commit();
        session.close();
    }
}
