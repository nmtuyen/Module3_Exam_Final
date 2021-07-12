<%--
  Created by IntelliJ IDEA.
  User: Admin-Thính
  Date: 7/12/2021
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Add Product</title>
</head>
<body>
<form action="/products" method="post">
    <input type="hidden" name="action" value="create">
    <p>productID</p>
    <input type="text" name="productId" id="productId">
    <p>productName</p>
    <input type="text" name="productName" id="productName">
    <p>productPrice</p>
    <input type="text" name="productPrice" id="productPrice">
    <p>productQuantity</p>
    <input type="text" name="productQuantity" id="productQuantity">
    <p>productColor</p>
    <input type="text" name="productColor" id="productColor">
    <p>description</p>
    <input type="text" name="description" id="description">
    <p>productCategory</p>
    <input type="text" name="productCategory" id="productCategory"><br>
    <button>Add Product</button>
</form>
</body>
</html>
