<%--
  Created by IntelliJ IDEA.
  User: Admin-Thính
  Date: 7/12/2021
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/products" method="post">
    <input type="hidden" name="action" value="${product.productId}">
    <p>productID</p>
    <input type="text" name="productId" value="${product.productName}">
    <p>productName</p>
    <input type="text" name="productName" value="${product.productPrice}">
    <p>productPrice</p>
    <input type="text" name="productPrice" value="${product.productQuantity}">
    <p>productQuantity</p>
    <input type="text" name="productQuantity" value="${product.productColor}">
    <p>productColor</p>
    <input type="text" name="productColor" value="${product.description}">
    <p>description</p>
    <input type="text" name="description" value="${product.productCategory}">
    <button>Add Product</button>
  </form>


</body>
</html>
