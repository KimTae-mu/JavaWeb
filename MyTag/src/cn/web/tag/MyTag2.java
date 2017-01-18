package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by mgc11 on 2017/1/15.
 */
    /*SimpleTagSupport它实现了SimpleTag接口。
      它已经把所有的tomcat传递的数据都保存起来了！而且还提供了get方法。
    * */
public class MyTag2 extends SimpleTagSupport{
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("hello web");
    }
}
