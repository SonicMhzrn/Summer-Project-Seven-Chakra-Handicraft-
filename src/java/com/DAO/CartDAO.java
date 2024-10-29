/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Bowls;
import com.entity.Cart;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface CartDAO {
    public boolean addCart(Cart c);
    public List<Cart> getProductByUser(int userId);
    public boolean deleteProduct(int pid,int uid);
    public boolean deleteCartByUser(int uid);
}
