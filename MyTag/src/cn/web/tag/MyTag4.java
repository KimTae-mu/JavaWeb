package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by mgc11 on 2017/1/22.
 */

/*有属性的标签*/
public class MyTag4 extends SimpleTagSupport {
    private boolean test;
    /*这个方法会由tomcat来调用，并且在doTag()之前*/
    public void setTest(boolean test) {
        this.test = test;
    }

    public void doTag() throws JspException, IOException {
        if(test){
            //执行标签体
            this.getJspBody().invoke(null);//如果传递的输出流为null，表示使用的就是当前页面的out
        }
    }
}
