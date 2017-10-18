/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.repository;

import com.alpha.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author
 */
@Repository
@Transactional
public class ProductService {
//    @PersistenceUnit
//    EntityManagerFactory emf;
    @PersistenceContext
    private EntityManager em;

    public ProductService() {
//        em=emf.createEntityManager();
    }
    
    public List<Product> findAllProduct() {
     List<Product> listproduct = getEm().createNamedQuery("Product.findAll").getResultList();
     return listproduct;
    }
    
   public Product findProductById(int productid){
       Product product = em.find(Product.class, productid);
       return product;
   }
    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
