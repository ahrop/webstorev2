/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.controller;

import com.alpha.model.User;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ropandi
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping()
    public String welcome(HttpSession session, Model model) {
     User user = new User("Tamu");
     session.setAttribute("user", user);
     model.addAttribute("user", user);
     model.addAttribute("salam", "Selamat datang di Rostore.com");
     model.addAttribute("tagline", "Toko online terpercaya dan kredibel");
     return "home";
    }
    
}
