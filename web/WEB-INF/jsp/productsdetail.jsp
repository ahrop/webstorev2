<%-- 
    Document   : productsdetail
    Created on : Oct 17, 2017, 1:03:59 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <title>Detail Page</title>
    </head>
    <body>
        <section>
              <div class="jumbotron">
                 <div class="container">
                    <h1>Detail Produk</h1>
                    masuk sebagai: ${user.username} </br>
                    jumlah keranjang anda : ${user.carts.size()} </br>
                    <a href="keranjang"> lihat keranjang </a>
                 </div>
              </div>
           </section>
        <section class="container">
            <div class="row">
                 <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                       <div class="caption">
                          <h3>${product.productname}</h3>
                          <p>${product.description}</p>
           <p>IDR ${product.unitprice}</p>
           <p>tersedia ${product.unitinstock} units in stock</p>
           <p>buatan : ${product.manufacture}</p>
           <p> Kategory Produk : ${product.category}
           <p> Kondisi : ${product.condition}</p>
            <p><a href="add"><button type="submit">TambahkanKeranjang</button> </a></p>
                       </div>
                    </div>
                 </div>
              </div>         
        </section>

        
       
    </body>
</html>
