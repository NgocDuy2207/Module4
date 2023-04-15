<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/4/2023
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$List$</title>
</head>
<body>
    <a href="/music/create">add music</a>
    <table style="border: honeydew" 1px >
        <tr>
            <th>Name</th>
            <th>artistName</th>
            <th>kindOfMusic</th>
            <th>pathMusic</th>
        </tr>
        <c:forEach items="${music}" var="s">
            <tr>
                <td>${s.name}</td>
                <td>${s.artistName}</td>
                <td>${s.kindOfMusic}</td>
                <td><button>${s.pathMusic}</button></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
