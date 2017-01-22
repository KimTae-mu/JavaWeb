package cn.web.web.servlet;

import cn.web.domain.User;
import cn.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mgc11 on 2017/1/22.
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*在Servlet中依赖service，然后通过service完成功能，把结果保存到reques中，然后转发到jsp显示*/
        UserService userService=new UserService();
        User user = userService.find();

        request.setAttribute("user",user);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
