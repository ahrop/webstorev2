/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.controller;

import com.alpha.model.Product;
import com.alpha.model.User;
import com.alpha.repository.ProductService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail")
public class detailProductController {
    @Autowired
    ProductService ps;
    
    User user;
    @RequestMapping(value="/{productid}") 
   public String showOneCustomer(@PathVariable("productid") Integer productid, Model model, HttpSession session) {
       user = (User) session.getAttribute("user");
       Product pro = ps.findProductById(productid);
       session.setAttribute("product", pro);
       model.addAttribute("product", pro);
       return "productsdetail";
   }
   
   @RequestMapping("/add")
    public String addToCart(HttpSession session,Model model) {
        User user = (User) session.getAttribute("user");
        Product product = (Product) session.getAttribute("product");
        user.getCarts().add(product);
        model.addAttribute("msg", "berhasil ditambahkan ke keranjang");
        session.removeAttribute("product");
        return "succes";
        
    }
  @RequestMapping("/keranjang")
  public String listCarts(HttpSession session, Model model) {
      User user = (User) session.getAttribute("user");
      List <Product> barang = user.getCarts();
      model.addAttribute("barang", barang);
      return "keranjang";
  }
}
