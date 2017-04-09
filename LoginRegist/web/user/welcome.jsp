<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2017/3/7
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<body>
    <h1>欢迎登陆本系统！</h1>
<c:choose>
    <c:when test="${empty sessionScope.sessionUser }">gun</c:when>
    <c:otherwise>
        ${sessionScope.sessionUser }
    </c:otherwise>
</c:choose>
</body>
</html>
