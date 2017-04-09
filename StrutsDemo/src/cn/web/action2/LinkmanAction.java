package cn.web.action2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
public class LinkmanAction extends ActionSupport{
    //保存联系人
    public String save(){
        System.out.println("保存联系人");
        return NONE;
    }
    //删除联系人
    public String delete(){
        System.out.println("删除联系人");
        return NONE;
    }
}
