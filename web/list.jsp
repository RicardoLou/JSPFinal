<%--
  Created by IntelliJ IDEA.
  User: ricardo
  Date: 2024/11/20
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--注意这里的taglib--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>id</th>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>操作</th>
    </tr>
    <%--8--%>
    <c:forEach var="goods" items="${goodsList}">
        <tr>
            <td>${goods.id}</td>
            <td>${goods.comm_num}</td>
            <td>${goods.comm_name}</td>
            <td>${goods.sale_price}</td>
            <%--14 17--%>
            <td><a href="/del?id=${goods.id}">删除</a><a href="/modify?id=${goods.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
<a href="index.jsp"></a>
</body>
</html>
