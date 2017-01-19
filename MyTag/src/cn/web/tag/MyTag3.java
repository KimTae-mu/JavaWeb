package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mgc11 on 2017/1/16.
 */
public class MyTag3 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        Writer out=this.getJspContext().getOut();//获取当前jsp页面的输出流
        out.write("****************<br/>");
        this.getJspBody().invoke(out);//执行标签体内容，
        out.write("<br/>****************");
    }
}
