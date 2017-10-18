/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCT")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductid", query = "SELECT p FROM Product p WHERE p.productid = :productid")
    , @NamedQuery(name = "Product.findByProductname", query = "SELECT p FROM Product p WHERE p.productname = :productname")
    , @NamedQuery(name = "Product.findByUnitprice", query = "SELECT p FROM Product p WHERE p.unitprice = :unitprice")
    , @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description")
    , @NamedQuery(name = "Product.findByManufacture", query = "SELECT p FROM Product p WHERE p.manufacture = :manufacture")
    , @NamedQuery(name = "Product.findByCategory", query = "SELECT p FROM Product p WHERE p.category = :category")
    , @NamedQuery(name = "Product.findByCondition", query = "SELECT p FROM Product p WHERE p.condition = :condition")
    , @NamedQuery(name = "Product.findByUnitinstock", query = "SELECT p FROM Product p WHERE p.unitinstock = :unitinstock")
    , @NamedQuery(name = "Product.findByUnitinorder", query = "SELECT p FROM Product p WHERE p.unitinorder = :unitinorder")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCTID")
    private Integer productid;
    @Basic(optional = false)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Basic(optional = false)
    @Column(name = "UNITPRICE")
    private double unitprice;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "MANUFACTURE")
    private String manufacture;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @Column(name = "CONDITION")
    private String condition;
    @Column(name = "UNITINSTOCK")
    private BigInteger unitinstock;
    @Column(name = "UNITINORDER")
    private BigInteger unitinorder;

    public Product() {
    }

    public Product(Integer productid) {
        this.productid = productid;
    }

    public Product(Integer productid, String productname, double unitprice, String manufacture, String category, String condition) {
        this.productid = productid;
        this.productname = productname;
        this.unitprice = unitprice;
        this.manufacture = manufacture;
        this.category = category;
        this.condition = condition;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public BigInteger getUnitinstock() {
        return unitinstock;
    }

    public void setUnitinstock(BigInteger unitinstock) {
        this.unitinstock = unitinstock;
    }

    public BigInteger getUnitinorder() {
        return unitinorder;
    }

    public void setUnitinorder(BigInteger unitinorder) {
        this.unitinorder = unitinorder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alpha.model.Product[ productid=" + productid + " ]";
    }
    
}
