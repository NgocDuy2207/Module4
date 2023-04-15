<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/4/2023
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Create$</title>
</head>
<body>
  <form method="post" action="/music/create" modelAttribute="music">
      <table>
        <tr>
          <td>Name: </td>
          <td><form: input type="text" path="name"/></td>
        </tr>
        <tr>
          <td>artistName: </td>
          <td><form: input type="text" path="artistName"/></td>
        </tr>
        <tr>
          <td>kindOfMusic: </td>
          <td><form: input type="text" path="kindOfMusic"/></td>
        </tr>
        <tr>
          <td>pathMusic: </td>
          <td><form: input type="text" path="pathMusic"/></td>
        </tr>
        <tr>
          <td><input type="submit" value="submit"></td>
        </tr>
      </table>

  </form>

</body>
</html>
