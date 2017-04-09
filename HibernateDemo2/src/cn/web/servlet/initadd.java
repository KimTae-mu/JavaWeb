package cn.web.servlet;

import cn.web.domain.Customer;
import cn.web.service.CustomerService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/4/9.
 */
/*初始化到添加联系人的页面*/
@WebServlet("/initadd")
public class initadd extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //查询所有的客户
        List<Customer> list = new CustomerService().findAll();
        //保存request
        request.setAttribute("list",list);
        request.getRequestDispatcher("/jsp/linkman/add.jsp").forward(request,response);
    }
}
