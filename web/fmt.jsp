<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2016/12/10
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>fmt标签</title>
</head>
<body>
<%
    Date date=new Date();
    request.setAttribute("date",date);
%>
<fmt:formatDate value="${requestScope.date}" pattern="yyyy-MM-dd HH:mm:ss"/>
<hr/>
<%
    request.setAttribute("num1",3.1415926);
%>
<fmt:formatNumber value="${requestScope.num1}" pattern="0.00"/>
</body>
</html>
