<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/3/7
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>分析</title>
  </head>
  <body>
  <%--
      注册：
        regist.jsp
          >第一步：完成regist.jsp的基本功能
        RegistServlet
          >封装表单数据，封装到User对象中。
          >调用service的regist()方法
              *如果这个方法没有出问题，给页面显示成功信息
              *如果这个方法抛出了异常，把错误信息保存到request域，转发到regist.jsp（显示错误信息)
        UserService#regist()
          >没有返回值，但注册失败抛出一个自定义的异常，可以在异常中添加异常信息（自定义一个异常类）
          >校验用户名是否已被注册（通过用户名查询用户—），如果已被注册，抛出异常，异常信息为“用户名已被注册”
          >添加用户
        UserDao：通过业务分析，得到结果：需要提供两个方法
          >按用户名查询用户对象：User findByUsername(String username)
          >插入一个用户到数据库中:void add(User user)

        工作：
          1.在service层添加一个UserException
          2.dao：
           *User findByUsername(String username)
           *void add(User user)
          3.service
            *void regist() throws UserException
          4.servlet
            1).封装表单数据到User对象中
            2.).使用user调用service的regist() 方法
            3).如果得到UserException，那么把异常信息保存到request域中，转发回regist.jsp
            4).输出“注册成功”

  --%>
  </body>
</html>
