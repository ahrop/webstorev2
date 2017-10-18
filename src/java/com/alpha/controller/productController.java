/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.controller;

import com.alpha.model.Product;
import com.alpha.model.User;
import com.alpha.repository.ProductService;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author angga
 */
@Controller
@RequestMapping("/products")
public class productController {
    @Autowired
    ProductService ps;
    
    User user;
//    @RequestMapping()
//    public String product(HttpSession session, Model model) {
//       Product product = new Product();
//       product.setProductid(1);
//       product.setProductname("iPhone 6s");
//       product.setUnitprice(8000000.0);
//       product.setDescription("Apple iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
//              product.setCategory("Smartphone");
//              product.setManufacture("Apple");
////              product.setUnitinstock(BigInteger(1000));
//              model.addAttribute("product", product);
//              return "products";

//    }
    @RequestMapping()
    public String getProductAll(HttpSession session, Model model) {
        user = (User) session.getAttribute("user");
        
        model.addAttribute("products", ps.findAllProduct());
        return "products";
    }
     
    
    
}
