<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/4/2023
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyển USD sang VND</title>
</head>
<body>
    <form method="post">
    <table>
        <td>Nhập USD: <input name="usd" placeholder="nhập usd"></td>
        <td> <input type="submit" value="submit"> </td>
    </table>
    </form>
    <p>${vnd} </p>

</body>
</html>
