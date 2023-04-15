<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2023
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <form method="get" action="save">
        <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
        <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
        <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
        <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
        <td><input type="submit" value="save"></td>
    </form>




</body>
</html>
