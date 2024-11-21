<%--
  Created by IntelliJ IDEA.
  User: ricardo
  Date: 2024/11/21
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--19--%>
<H2> 修改信息 </H2>
<form action="/modify" method="post">
  <input type="hidden" name="id" value="${goods.id}" required>
  商品编号<input type="text" name="num" value="${goods.comm_num}" required><br>
  商品名称<input type="text" name="name" value="${goods.comm_name}" required><br>
  商品价格<input type="text" name="price" value="${goods.sale_price}" required><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
