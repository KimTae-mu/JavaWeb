package cn.web.web.servlet;

import cn.web.domain.Customer;
import cn.web.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/3/29.
 */
/*查询所有的客户*/
@WebServlet("/listCustomer")
public class listCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先获取请求的参数
        request.setCharacterEncoding("UTF-8");
        //获取到客户的名称
        String custName=request.getParameter("custName");
        //查询所有的方法的时候，传入进去
        List<Customer> list = new CustomerService().findAll(custName);
        //存入request
        request.setAttribute("list",list);
        //转发
        request.getRequestDispatcher("/jsp/customer/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先获取请求的参数
        request.setCharacterEncoding("UTF-8");
        //获取到客户的名称
        String custName=request.getParameter("custName");
        //查询所有的方法的时候，传入进去
        List<Customer> list = new CustomerService().findAll(custName);
        //存入request
        request.setAttribute("list",list);
        //转发
        request.getRequestDispatcher("/jsp/customer/list.jsp").forward(request,response);
    }
}
