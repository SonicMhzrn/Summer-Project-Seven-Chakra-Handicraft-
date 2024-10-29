/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Order;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class OrderDAOImpl implements OrderDAO {

    private Connection conn;

    public OrderDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean saveOrder(List<Order> blist) {
        boolean f = false;
        try {

            String sql = "Insert into orders (order_id,first_name,last_name,username,email,phone,address,product_name,price,date,image,payment,status) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (Order b : blist) {
                pstmt.setString(1, b.getOrder_id());
                pstmt.setString(2, b.getFirst_name());
                pstmt.setString(3, b.getLast_name());
                pstmt.setString(4, b.getUsername());
                pstmt.setString(5, b.getEmail());
                pstmt.setString(6, b.getPhone());
                pstmt.setString(7, b.getAddress());
                pstmt.setString(8, b.getProduct_name());
                pstmt.setString(9, b.getPrice());
                pstmt.setDate(10, Date.valueOf(b.getDate()));
                pstmt.setString(11, b.getImage());
                pstmt.setString(12, b.getPayment());
                pstmt.setString(13, "Pending");
                pstmt.addBatch();
            }
            int[] count = pstmt.executeBatch();
            conn.commit();
            f = true;
            conn.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public List<Order> getOrder(String email) {
        List<Order> list = new ArrayList<Order>();
        Order ord = null;
        try {
            
            String sql = "Select * From orders where email=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ord = new Order();
                ord.setId(rs.getInt(1));
                ord.setOrder_id(rs.getString(2));
                ord.setFirst_name(rs.getString(3));
                ord.setLast_name(rs.getString(4));
                ord.setUsername(rs.getString(5));
                ord.setEmail(rs.getString(6));
                ord.setPhone(rs.getString(7));
                ord.setAddress(rs.getString(8));
                ord.setProduct_name(rs.getString(9));
                ord.setPrice(rs.getString(10));
                Date date = rs.getDate(11);
                LocalDate localDate = date.toLocalDate();
                ord.setDate(localDate);
                ord.setImage(rs.getString(12));
                ord.setPayment(rs.getString(13));
                ord.setStatus(rs.getString(14));
                 list.add(ord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
        
    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> list = new ArrayList<Order>();
        Order ord = null;
        try {
            
            String sql = "Select * From orders";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ord = new Order();
                ord.setId(rs.getInt(1));
                ord.setOrder_id(rs.getString(2));
                ord.setFirst_name(rs.getString(3));
                ord.setLast_name(rs.getString(4));
                ord.setUsername(rs.getString(5));
                ord.setEmail(rs.getString(6));
                ord.setPhone(rs.getString(7));
                ord.setAddress(rs.getString(8));
                ord.setProduct_name(rs.getString(9));
                ord.setPrice(rs.getString(10));
                Date date = rs.getDate(11);
                LocalDate localDate = date.toLocalDate();
                ord.setDate(localDate);
                ord.setImage(rs.getString(12));
                ord.setPayment(rs.getString(13));
                ord.setStatus(rs.getString(14));
                 list.add(ord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
        
    }
    
        @Override
    public boolean deleteOrder(int id) {
        boolean f = false;
        try {
            String sql = "Delete from orders where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int res = pstmt.executeUpdate();
            if (res == 1) {
                f = true;
            }
        } catch (Exception e) {
        }
        return f;
    }

    @Override
    public boolean editOrder(Order o) {
         boolean f = false;
        try {

            String sql = "Update orders set status=? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, o.getStatus());
            pstmt.setInt(2, o.getId());

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
    public Order getAllOrder(int id) {
        Order ord = null;
        try {
            
            String sql = "Select * From orders where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ord = new Order();
                ord.setId(rs.getInt(1));
                ord.setOrder_id(rs.getString(2));
                ord.setFirst_name(rs.getString(3));
                ord.setLast_name(rs.getString(4));
                ord.setUsername(rs.getString(5));
                ord.setEmail(rs.getString(6));
                ord.setPhone(rs.getString(7));
                ord.setAddress(rs.getString(8));
                ord.setProduct_name(rs.getString(9));
                ord.setPrice(rs.getString(10));
                ord.setStatus(rs.getString(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ord;
        
    }

    @Override
    public int countOrder() {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM orders";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
    
}
