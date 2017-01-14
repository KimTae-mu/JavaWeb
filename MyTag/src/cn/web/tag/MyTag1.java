package cn.web.tag;


import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

public class MyTag1 implements SimpleTag{
//自定义标签 1

    private PageContext pageContext;
    private  JspFragment body;
//    所有的setXXX()方法都会在doTag()方法之前被tomcat调用
//    所在doTag()中就可以使用tomcat传递过来的对象了
    public void doTag() throws JspException, IOException {
        pageContext.getOut().print("Hello Tag!");
    }

    public void setParent(JspTag jspTag) {
    }

    public JspTag getParent() {
        return null;
    }

    public void setJspContext(JspContext jspContext) {
        this.pageContext= (PageContext) jspContext;
    }

    public void setJspBody(JspFragment jspFragment) {
        this.body=jspFragment;
    }
}
