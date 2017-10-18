<%-- 
    Document   : keranjang
    Created on : Oct 18, 2017, 8:30:01 AM
    Author     : angga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Nama Barang</h1>
        <p>jumlah keranjang : ${user.carts.size()}</p>
        
        <c:forEach items="${barang}" var="d">
            <p>Nama Barang : ${d.productname}</p> 
        </c:forEach>
            <p><a href="/webstore"> kembali ke halaman awal </a></p>
            <p> <a href="/webstore/products"> kembali ke halaman produk</a> </p>
    </body>
</html>
