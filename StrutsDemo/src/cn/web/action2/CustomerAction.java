package cn.web.action2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
public class CustomerAction extends ActionSupport{
    //保存客户
    public String save(){
        System.out.println("保存客户");
        return NONE;
    }
    //删除客户
    public String delete(){
        System.out.println("删除客户");
        return NONE;
    }
}
