package cn.web.action;

/**
 * Created by Taeyeon-Serenity on 2017/3/16.
 */
/*Struts2框架都是用Action类来处理用户的请求*/
public class HelloAction {
     /*Action类中的方法签名有要求，
     *      public 共有的
     *      必须有返回值，必须String类型
     *      方法名称可以是任意的，但是不能有参数列表
     *
     *      页面的跳转：
     *          1.return "字符串"
     *          2.需要在struts.xml配置文件中，配置跳转的页面
     *      */

     public String sayHello(){
         System.out.println("Hello Struts");
         return "ok";
     }
}
