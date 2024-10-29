/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Order;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface OrderDAO {
//    public int getOrderNo();

    public boolean saveOrder(List<Order> b);

    public List<Order> getOrder(String email);

    public List<Order> getAllOrder();

    public boolean deleteOrder(int id);
    
    public Order getAllOrder(int id);
    
    public boolean editOrder(Order o);
    
    public int countOrder();
}
