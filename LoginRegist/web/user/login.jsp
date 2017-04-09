<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/3/7
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<h1>登陆</h1>
<p style="color: Red; font-weight: 900">${msg }</p>
<%--  ${pageContext.request.contextPath }/RegitstServlet  --%>
<form action="<c:url value='/LoginServlet'/>" method="post">
    用户名：<input type="text" name="username" value="${user.username }"/><br/>
    密   码：<input type="password" name="password" value="${user.password }"/><br/>
    <input type="submit" value="登陆"/>
</body>
</html>
