/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angga
 */
public class User {
    private String username;
    private String password;
    private List<Product> carts;

    /**
     * @return the username
     */
    
    public User() {
    }

    public User(String username) {
        this.username = username;
        this.carts = new ArrayList();
    }
    
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the carts
     */
    public List<Product> getCarts() {
        return carts;
    }

    /**
     * @param carts the carts to set
     */
    public void setCarts(List<Product> carts) {
        this.carts = carts;
    }
    
}
