<%-- 
    Document   : produsts
    Created on : Oct 17, 2017, 11:58:27 AM
    Author     : user
--%>

<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
        <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html;
        charset=ISO-8859-1">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
        </head>
        <body>
           <section>
              <div class="jumbotron">
                 <div class="container">
                    <h1>Produk</h1>
                    <p>Produk yang tersedia di toko kami</p>
                 </div>
              </div>
               <div class="row">
                   <div class="col-9">Jumlah kerajang anda : ${user.carts.size()} <br>
                   anda masuk sebagai : ${user.username}
                   <p><a href="detail/keranjang">lihat keranjang</a></p>
                   </div>
  <div class="col-9">
      <div clas="table-responsive">
        <table class="table">
            <tr bgcolor="#C0C0C0"> <th>Nama Produk</th><th>Harga IDR</th>
            </tr>
              <d:forEach items="${products}" var="products">
                  <tr><td><a href="detail/${products.productid}">${products.productname}</a></td>
                      <td>${products.unitprice}</td>
                  </tr>
              </d:forEach>
             </table>
                </div>
      
  </div>
</div>
   
        </body>
        </html>