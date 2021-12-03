<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="font-awesome-4.7.0/scss/font-awesome.scss">
    <link rel="stylesheet" href="font-awesome-4.7.0/icon/fontawesome-free-5.15.4-web/css/all.css">
    <link rel="stylesheet" href="s.css">
    <title>JSP - Hello World</title>
</head>
<body>

<div id="header">
    <div id="header__content">
        <div id="main-menu">
            <ul>
                <li><a href="">HOME</a></li>
                <li><a href=""> PRODUCTS</a>
                    <ul id="sub-menu">
                        <li><a href="">Tivi</a></li>
                        <li><a href="">Máy tính xách tay</a></li>
                    </ul>
                </li>
                <li><a href="">ABOUT US</a></li>
                <li><a href="">CONTACT</a></li>
            </ul>
        </div>
    </div>
</div>

<div id="content">

    <jsp:useBean id="products" scope="request" type="java.util.List"/>
    <c:forEach var="p" items="${products}">
        <div class="pro">
            <img class="pro-img"
                 src="${p.image}" alt="">
            <div id="product-info">
                <p class="pro-name">${p.name}</p>
                <p class="pro-sellPrice">₫${p.sellPrice}</p>
                <p class="pro-price">₫${p.price}</p>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>