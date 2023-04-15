<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2023
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Simple Calculator</h1>

        <form method="post">
            <table>
                <tr>
                    <td colspan="2"></td>
                </tr>
                <tr>
                    <td>First Operand: </td>
                    <td><input type="text" name="firstOperand" value="${firstOperand}"></td>
                </tr>
                <tr>
                    <td>Operator:
                        <select name="operator">
                            <option value="+">Addition</option>
                            <option value="-">Subtraction</option>
                            <option value="*">Multiplication</option>
                            <option value="/">Division</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>Second Operand: </td>
                    <td><input type="text" name="secondOperand" value="${secondOperand}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </form>

    <p>Result: ${result}</p>

</body>
</html>
