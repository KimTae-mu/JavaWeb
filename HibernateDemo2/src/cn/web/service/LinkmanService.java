package cn.web.service;

import cn.web.dao.CustomerDao;
import cn.web.dao.LinkmanDao;
import cn.web.domain.Customer;
import cn.web.domain.Linkman;
import cn.web.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Taeyeon-Serenity on 2017/4/9.
 */
public class LinkmanService {
    /*编写业务，保存联系人
    * 先把客户查询出来，设置到联系人中，再保存联系人*/
    public void save(Linkman man, Long cust_id) {
        //先获取session
        Session session = HibernateUtils.getCurrentSession();
        Transaction tr = session.beginTransaction();
        try {
            //编写代码
            //先查客户
            Customer c=new CustomerDao().findById(cust_id);
            //设置
            man.setCustomer(c);
            //保存联系人
            new LinkmanDao().save(man);
            tr.commit();
        }catch (Exception e){
            tr.rollback();
            e.printStackTrace();
        }
    }
}
