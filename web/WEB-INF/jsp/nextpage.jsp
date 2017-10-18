<%-- 
    Document   : nextpage
    Created on : Oct 17, 2017, 9:51:21 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>next page</title>
    </head>
    <body>
        <p>${user.username}</p> <p>Jumlah cart anda : ${user.carts.size()}</p>
        barang anda : <d:forEach items="${user.carts}" var="p">
            ${p}
        </d:forEach>
        
        <a href="logout"> logout</a>
    </body>
</html>
