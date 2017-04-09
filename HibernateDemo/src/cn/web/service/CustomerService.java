package cn.web.service;

import cn.web.dao.CustomerDao;
import cn.web.domain.Customer;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/3/23.
 */
public class CustomerService {
    /*保存客户*/
    public void saveCustomer(Customer c){
        new CustomerDao().save(c);
    }

    /*查询所有的客户*/
    public List<Customer> findAll(){
        return new CustomerDao().findAll();
    }
    /*带查询条件的客户*/
    public List<Customer> findAll(String custName){
        return new CustomerDao().findAll(custName);
    }
}
