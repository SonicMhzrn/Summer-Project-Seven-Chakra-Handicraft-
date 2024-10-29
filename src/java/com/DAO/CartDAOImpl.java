/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Bowls;
import com.entity.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CartDAOImpl implements CartDAO {

    private Connection conn;

    public CartDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean addCart(Cart c) {
        boolean f = false;
        try {
            String sql = "Insert into cart(pid,uid,product_name,quantity,price,total_price,image) Values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, c.getProductid());
            pstmt.setInt(2, c.getUserid());
            pstmt.setString(3, c.getProduct_name());
            pstmt.setInt(4, c.getQuantity());
            pstmt.setDouble(5, c.getPrice());
            pstmt.setDouble(6, c.getTotal_price());
            pstmt.setString(7, c.getPhoto());

            int res = pstmt.executeUpdate();
            if (res == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }

    @Override
    public List<Cart> getProductByUser(int userId) {
        List<Cart> list = new ArrayList<Cart>();

        try {
            String sql = "SELECT *FROM cart WHERE uid = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Cart c = new Cart();
                c.setCid(rs.getInt(1));
                c.setProductid(rs.getInt(2));
                c.setUserid(rs.getInt(3));
                c.setProduct_name(rs.getString(4));
                c.setQuantity(rs.getInt(5));
                c.setPrice(rs.getDouble(6));
                c.setPhoto(rs.getString(8));
                Double totalPrice = 0.0;
                totalPrice = totalPrice + rs.getDouble(7);
                c.setTotal_price(totalPrice);

                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean deleteProduct(int pid,int uid) {
        boolean f = false;
        try {
            String sql = "Delete from cart where pid=? and uid=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, pid);
            pstmt.setInt(2, uid);
            int res = pstmt.executeUpdate();
            
            if(res==1){
                f= true;
            }
 
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        return f;

    }

    @Override
    public boolean deleteCartByUser(int uid) {
    boolean f = false;
    try {
        String sql = "DELETE FROM cart WHERE uid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, uid);
        int res = pstmt.executeUpdate();
        
        if(res == 1) {
            f = true;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return f;
}

}
