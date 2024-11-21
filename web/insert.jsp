<%--
  Created by IntelliJ IDEA.
  User: ricardo
  Date: 2024/11/20
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<%--10 11--%>
<H2> 添加用户 </H2>
<form action="/add" method="post">
  商品编号<input type="text" name="num" required><br>
  商品名称<input type="text" name="name" required><br>
  商品价格<input type="text" name="price" required><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
