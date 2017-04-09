package cn.web.dao;

import cn.web.domain.Customer;
import cn.web.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/3/23.
 */
public class CustomerDao {
    /*保存客户*/
    public void save(Customer c){
        //现获取session
        Session session= HibernateUtils.getSession();
        //开启事务
        Transaction tr=session.beginTransaction();
        //保存用户
        session.save(c);
        //提交事务
        tr.commit();
        //关闭资源
        session.close();
    }

    /*查询所有的客户*/
    public List<Customer> findAll(){
        //QBC查询
        Session session = HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();

        //查询
        Criteria criteria = session.createCriteria(Customer.class);
        List<Customer> list = criteria.list();

        tr.commit();
        session.close();

        return list;
    }
    /*带条件的查询*/
    public List<Customer> findAll(String custName){
        //QBC查询
        Session session = HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();

        //查询
        Criteria criteria = session.createCriteria(Customer.class);
        //添加查询条件
        if(custName!=null && !custName.trim().isEmpty()){
            //添加查询的条件
            criteria.add(Restrictions.like("cust_name","%"+custName+"%"));
        }
        List<Customer> list = criteria.list();

        tr.commit();
        session.close();

        return list;
    }

    /*通过主键，查询客户*/
    public Customer findById(Long cust_id) {
        //使用session
        Session session = HibernateUtils.getCurrentSession();
        //查询
        return session.get(Customer.class, cust_id);

    }
}
