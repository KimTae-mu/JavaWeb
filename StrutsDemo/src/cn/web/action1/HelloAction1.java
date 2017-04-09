package cn.web.action1;

/**
 * Created by Taeyeon-Serenity on 2017/3/19.
 */
/*就是POJO类：没有任何继承和实现*/
public class HelloAction1 {
    /*execute是默认方法
    * return null；页面不会进行跳转*/
    public String execute(){
        System.out.println("HelloAction1就是一个POJO类");
        return null;
    }
}
