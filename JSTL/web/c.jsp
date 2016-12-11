<%--
  Created by IntelliJ IDEA.
  User: Taeyeon-Serenity
  Date: 2016/12/6
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>JSTL</title>
  </head>
  <body>
   <c:set var="code" value="<script>alert('hello');</script>" scope="request"/>
   <c:out value="${code}" escapeXml="true"/><br/>
   <c:url value="/AServlet"/>
  </body>
</html>
