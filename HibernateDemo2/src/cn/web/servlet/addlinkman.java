package cn.web.servlet;

import cn.web.domain.Linkman;
import cn.web.service.LinkmanService;
import org.apache.commons.beanutils.BeanUtils;
import sun.awt.image.ImageWatched;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by Taeyeon-Serenity on 2017/4/9.
 */
/*添加联系人*/
@WebServlet("/addlinkman")
public class addlinkman extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先解决中文乱码
        request.setCharacterEncoding("utf-8");
        //接收数据
        Map<String, String[]> map = request.getParameterMap();
        //先把客户的ID获取到
        String scust_id = map.get("cust_id")[0];
        //转换
        Long cust_id = Long.parseLong(scust_id);

        //可以封装数据
        Linkman man = new Linkman();
        try {
            BeanUtils.populate(man, map);
            //调用业务层，保存联系人
            new LinkmanService().save(man, cust_id);
            System.out.println("保存联系人成功。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}