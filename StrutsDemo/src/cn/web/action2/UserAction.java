package cn.web.action2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
/*动态方法访问方式*/
public class UserAction extends ActionSupport{
    //保存用户
    public String save(){
        System.out.println("保存用户");
        return NONE;
    }
    //删除用户
    public String delete(){
        System.out.println("删除用户");
        return NONE;
    }
}
