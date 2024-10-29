/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Products;
import com.entity.Statue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ProductDAOImpl implements ProductDAO {

    public Connection conn;

    public ProductDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean addProduct(Products p) {
        boolean f = false;
        try {
            String sql = "Insert into products(p_detail,price,category,image,status) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, p.getP_detail());
            pstmt.setString(2, p.getPrice());
            pstmt.setString(3, p.getCategory());
            pstmt.setString(4, p.getImage());
            pstmt.setString(5, p.getStatus());

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
    public List<Products> getAllBowl() {
        List<Products> list = new ArrayList<Products>();
        Products p = null;

        try {
            String sql = "SELECT * FROM products WHERE category = 'Bowl'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Products();
                p.setP_id(rs.getInt(1));
                p.setP_detail(rs.getString(2));
                p.setPrice(rs.getString(3));
                p.setCategory(rs.getString(4));
                p.setImage(rs.getString(5));
                p.setStatus(rs.getString(6));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Products> getAllStatue() {
        List<Products> list = new ArrayList<Products>();
        Products p = null;

        try {
            String sql = "SELECT * FROM products WHERE category = 'Statue'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Products();
                p.setP_id(rs.getInt(1));
                p.setP_detail(rs.getString(2));
                p.setPrice(rs.getString(3));
                p.setCategory(rs.getString(4));
                p.setImage(rs.getString(5));
                p.setStatus(rs.getString(6));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Products> getAllBell() {
        List<Products> list = new ArrayList<Products>();
        Products p = null;

        try {
            String sql = "SELECT * FROM products WHERE category = 'Bell'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Products();
                p.setP_id(rs.getInt(1));
                p.setP_detail(rs.getString(2));
                p.setPrice(rs.getString(3));
                p.setCategory(rs.getString(4));
                p.setImage(rs.getString(5));
                p.setStatus(rs.getString(6));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Products getProductBy(int id) {
        Products s = null;

        try {
            String sql = "Select *From products where p_id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s = new Products();
                s.setP_id(rs.getInt(1));
                s.setP_detail(rs.getString(2));
                s.setPrice(rs.getString(3));
                s.setCategory(rs.getString(4));
                s.setImage(rs.getString(5));
                s.setStatus(rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return s;
    }

    @Override
    public boolean updateEditProduct(Products p) {
        boolean f = false;
        try {
            String sql = "Update products set p_detail=?,price=?,category=?,image=?,status=? where p_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, p.getP_detail());
            pstmt.setString(2, p.getPrice());
            pstmt.setString(3, p.getCategory());
            pstmt.setString(4, p.getImage());
            pstmt.setString(5, p.getStatus());
            pstmt.setInt(6, p.getP_id());

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
    public boolean deleteProduct(int id) {
        boolean f = false;
        try {
            String sql = "Delete from products where p_id=?";
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
    public List<Products> getBowls() {
        List<Products> list = new ArrayList<Products>();
        Products b = null;
        try {
            String sql = "Select * from products where category=? and status=? order by p_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "Bowl");
            pstmt.setString(2, "Active");
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new Products();
                b.setP_id(rs.getInt(1));
                b.setP_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setCategory(rs.getString(4));
                b.setImage(rs.getString(5));
                b.setStatus(rs.getString(6));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<Products> getStatues() {
        List<Products> list = new ArrayList<Products>();
        Products b = null;
        try {
            String sql = "Select * from products where category=? and status=? order by p_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "Statue");
            pstmt.setString(2, "Active");
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new Products();
                b.setP_id(rs.getInt(1));
                b.setP_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setCategory(rs.getString(4));
                b.setImage(rs.getString(5));
                b.setStatus(rs.getString(6));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<Products> getBells() {
        List<Products> list = new ArrayList<Products>();
        Products b = null;
        try {
            String sql = "Select * from products where category=? and status=? order by p_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "Bell");
            pstmt.setString(2, "Active");
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new Products();
                b.setP_id(rs.getInt(1));
                b.setP_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setCategory(rs.getString(4));
                b.setImage(rs.getString(5));
                b.setStatus(rs.getString(6));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<Products> getProductBySearch(String ch) {
        List<Products> list = new ArrayList<Products>();
        Products p = null;

        try {
            String sql = "SELECT * FROM products WHERE p_detail like ? or category like ? and status=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + ch + "%");
            pstmt.setString(2, "%" + ch + "%");
            pstmt.setString(3, "Active");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Products();
                p.setP_id(rs.getInt(1));
                p.setP_detail(rs.getString(2));
                p.setPrice(rs.getString(3));
                p.setCategory(rs.getString(4));
                p.setImage(rs.getString(5));
                p.setStatus(rs.getString(6));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int countBowls() {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM products WHERE category = 'Bowl'";
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

    @Override
    public int countStatues() {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM products WHERE category = 'Statue'";
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

    @Override
    public int countBells() {
       int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM products WHERE category = 'Bell'";
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
