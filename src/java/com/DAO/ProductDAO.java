/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Products;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ProductDAO {

    public boolean addProduct(Products b);

    public List<Products> getAllBowl();
    
    public List<Products> getAllStatue();
    
    public List<Products> getAllBell();

    public Products getProductBy(int id);

    public boolean updateEditProduct(Products b);
    
    public boolean deleteProduct(int id);
    
    public List<Products> getBowls();
    
    public List<Products> getStatues();
    
    public List<Products> getBells();
    
    public List<Products> getProductBySearch(String ch );
    
    public int countBowls();
    
    public int countStatues();
    
    public int countBells();
}
