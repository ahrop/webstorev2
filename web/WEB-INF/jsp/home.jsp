<%-- 
    Document   : welcome
    Created on : Oct 17, 2017, 9:17:59 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
                <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible"
                 content="IE=edge">
                <meta name="viewport" content="width=device-width,
                 initial-scale=1">
                <title>Welcome</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
           </head>
           <body>
                <div class="jumbotron">
                        <h1> ${salam}!</h1>
                        <p> ${tagline} </p>
                </div>
                <p><a href="products">lihat semua produk kami</a></p>
                <p>anda masuk sebagai: ${user.username}</p>
                <p>jumlah keranjang belanjaan anda : ${user.carts.size()}</p>
           </body>

</html>
