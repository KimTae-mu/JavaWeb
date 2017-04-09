package cn.web.action1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
/*编写Action类继承ActionSupport类，ActionSupport类已经实现了Action和一些其他的接口*/
public class HelloAction3 extends ActionSupport{
    public String execute(){
        System.out.println("HelloAction3继承了ActionSupport类");
        return NONE;
    }
}
