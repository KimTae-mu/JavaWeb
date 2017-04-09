package cn.web.web.servlet;

import cn.web.domain.Customer;
import cn.web.service.CustomerService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by Taeyeon-Serenity on 2017/3/22.
 */
@WebServlet("/SaveCustomer")
public class SaveCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* //接受请求的参数
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        //封装数据，使用BeanUtils工具，导入jar包
        Customer c=new Customer();
        try {
            BeanUtils.populate(c,map);
            //调用业务层
            new CustomerService().saveCustomer(c);
            System.out.println("添加客户成功。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受请求的参数
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> map = req.getParameterMap();
        //封装数据，使用BeanUtils工具，导入jar包
        Customer c=new Customer();
        try {
            BeanUtils.populate(c,map);
            //调用业务层
            new CustomerService().saveCustomer(c);
            System.out.println("添加客户成功。。。");
            req.getRequestDispatcher("/jsp/success.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
