
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products?action=create">Add New Product</a>
<table>
    <tr>
        <td>ID</td>
        <td>Product Name</td>
        <td>Price</td>
        <td>Quantity</td>
        <td>Color</td>
        <td>Category</td>
        <td>Action</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><c:out value="${product.productId}"/></td>
            <td><c:out value="${product.productName}"/></td>
            <td><c:out value="${product.productPrice}"/></td>
            <td><c:out value="${product.productQuantity}"/></td>
            <td><c:out value="${product.productColor}"/></td>
            <td><c:out value="${product.description}"/></td>
            <td><c:out value="${product.productCategory}"/></td>
            <td><a href="/products?action=edit&id=${product.productId}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.productId}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
