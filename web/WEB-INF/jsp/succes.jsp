<%-- 
    Document   : succes
    Created on : Oct 17, 2017, 1:39:42 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Berhasil dimasukan ke keranjang belanjaan anda</h1>
    </body>
    jumlah keranjang anda : ${user.carts.size()} </br>
    ${product.productname},${msg}
   
    <a href="/webstore/products"> kembali ke halaman product</a> </br>
    <a href="/webstore"> kembali ke halaman awal</a>
</html>
