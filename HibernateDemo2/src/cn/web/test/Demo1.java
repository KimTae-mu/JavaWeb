package cn.web.test;

import cn.web.domain.Customer;
import cn.web.domain.Linkman;
import cn.web.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Taeyeon-Serenity on 2017/4/5.
 */
/*测试一对多*/
public class Demo1 {
    /*双向关联的方式，保存数据*/
    @Test
    public void run1(){
        Session session=HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        //保存客户和联系人的数据
        Customer c1=new Customer();
        c1.setCust_name("张三");

        //创建2个联系人
        Linkman l1=new Linkman();
        l1.setLkm_name("熊大");

        Linkman l2=new Linkman();
        l2.setLkm_name("熊二");

        //演示双向关联
        c1.getLinkmans().add(l1);
        c1.getLinkmans().add(l2);

        l1.setCustomer(c1);
        l2.setCustomer(c1);
        //保存数据
        session.save(c1);
        session.save(l1);
        session.save(l2);

        tr.commit();
    }

    /*单向的关联不可以，可以使用级联保存*/
    @Test
    public void run2(){
        Session session=HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        //保存客户和联系人的数据
        Customer c1=new Customer();
        c1.setCust_name("张三");

        //创建2个联系人
        Linkman l1=new Linkman();
        l1.setLkm_name("熊大");

        Linkman l2=new Linkman();
        l2.setLkm_name("熊二");
        //单向关联
        c1.getLinkmans().add(l1);
        c1.getLinkmans().add(l2);

        //保存数据
        session.save(c1);

        tr.commit();
    }
    /*级联保存：保存客户，级联联系人*/
    @Test
    public void run3(){
        Session session=HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        //保存客户和联系人的数据
        Customer c1=new Customer();
        c1.setCust_name("张三");

        //创建2个联系人
        Linkman l1=new Linkman();
        l1.setLkm_name("熊大");

        Linkman l2=new Linkman();
        l2.setLkm_name("熊二");
        //单向关联
        c1.getLinkmans().add(l1);
        c1.getLinkmans().add(l2);

        //保存数据
        session.save(c1);

        tr.commit();
    }
    /*级联保存：保存联系人，级联客户*/
    @Test
    public void run4(){
        Session session=HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        //保存客户和联系人的数据
        Customer c1=new Customer();
        c1.setCust_name("张三");

        //创建2个联系人
        Linkman l1=new Linkman();
        l1.setLkm_name("熊大");

        Linkman l2=new Linkman();
        l2.setLkm_name("熊二");

        //使用联系人关联客户
        l1.setCustomer(c1);
        l2.setCustomer(c1);
        //保存联系人级联客户
        session.save(l1);
        session.save(l2);

        tr.commit();
    }
    /*级联保存*/
    @Test
    public void run5(){
        Session session=HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        //保存客户和联系人的数据
        Customer c1=new Customer();
        c1.setCust_name("张三");

        //创建2个联系人
        Linkman l1=new Linkman();
        l1.setLkm_name("熊大");

        Linkman l2=new Linkman();
        l2.setLkm_name("熊二");

        l1.setCustomer(c1);
        c1.getLinkmans().add(l2);

        session.save(l1);

        tr.commit();
    }
}
