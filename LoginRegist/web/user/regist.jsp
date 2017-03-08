<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/3/7
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <h1>注册</h1>
    <%--  ${pageContext.request.contextPath }/RegitstServlet  --%>
    <form acction="<c:url value='/RegistServlet'/>" method="post">
        用户名：<input type="text" name="username"/><br/>
        密   码：<input type="password" name="password"/><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
