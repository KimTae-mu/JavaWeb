<%--
  Created by IntelliJ IDEA.
  User: mgc11
  Date: 2017/1/14
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="it" uri="/WEB-INF/tlds/web-1.tld" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1><it:myTag1/></h1>
  <h1><it:myTag2/></h1>
  <hr/>
  <%
    request.setAttribute("xxx","zhangsan");
  %>

  <it:myTag4 test="${empty param.xxx }">
    <h3>
      <it:myTag3>${xxx }</it:myTag3>
    </h3>
  </it:myTag4>
  </body>
</html>
