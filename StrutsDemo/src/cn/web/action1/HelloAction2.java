package cn.web.action1;

import com.opensymphony.xwork2.Action;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
/*实现Action的接口，Action是框架的提供的接口*/
public class HelloAction2 implements Action{
    @Override
    public String execute() throws Exception {
        System.out.println("HelloAction2实现了Action的接口");
        //return "success";
        return SUCCESS;
    }
}
