<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2023
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <h1>SandWich có thêm thành phần : </h1>
        <c:forEach items="${condiment}" var="eat">
         <h2>${eat}</h2>
    </c:forEach>


</body>
</html>
