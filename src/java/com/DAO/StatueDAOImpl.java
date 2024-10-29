/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

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
public class StatueDAOImpl implements StatueDAO {

    public Connection conn;

    public StatueDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean addStatue(Statue s) {
        boolean f = false;
        try {
            String sql = "Insert into statues(statue_detail,price,image,status) VALUES (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getStatue_detail());
            pstmt.setString(2, s.getPrice());
            pstmt.setString(3, s.getImage());
            pstmt.setString(4, s.getStatus());
            
            
            int res = pstmt.executeUpdate();
            if (res == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public List<Statue> getAllStatue() {
        List<Statue> list = new ArrayList<Statue>();
        Statue s = null;

        try {
            String sql = "Select * From statues";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s = new Statue();
                s.setStatue_id(rs.getInt(1));
                s.setStatue_detail(rs.getString(2));
                s.setPrice(rs.getString(3));
                s.setImage(rs.getString(4));
                s.setStatus(rs.getString(5));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
     @Override
    public Statue getStatueBy(int id) {

        Statue s = null;

        try {
            String sql = "Select *From statues where statue_id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s = new Statue();
                s.setStatue_id(rs.getInt(1));
                s.setStatue_detail(rs.getString(2));
                s.setPrice(rs.getString(3));
                s.setImage(rs.getString(4));
                s.setStatus(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return s;
    }
    
     @Override
    public boolean updateEditStatue(Statue s) {
        boolean f = false;
        try {
            String sql = "Update statues set statue_detail=?,price=?,image=?,status=? where statue_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getStatue_detail());
            pstmt.setString(2, s.getPrice());
            pstmt.setString(2, s.getImage());
            pstmt.setString(7, s.getStatus());
            pstmt.setInt(8, s.getStatue_id());

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
    public boolean deleteStatue(int id) {
        boolean f = false;
        try {
            String sql = "Delete from statues where statue_id=?";
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
    public List<Statue> getStatues() {
        List<Statue> list = new ArrayList<Statue>();
        Statue s = null;
        try {
            String sql = "Select * from statues where status=? order by statue_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Active");
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                s = new Statue();
                s.setStatue_id(rs.getInt(1));
                s.setStatue_detail(rs.getString(2));
                s.setPrice(rs.getString(3));
                s.setImage(rs.getString(4));
                s.setStatus(rs.getString(5));
                list.add(s);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
    
    @Override
    public List<Statue> displayAllStatue() {
        List<Statue> list = new ArrayList<Statue>();
        Statue s = null;
        try {
            String sql = "Select * from statues where status=? order by statue_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Active");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                s = new Statue();
                s.setStatue_id(rs.getInt(1));
                s.setStatue_detail(rs.getString(2));
                s.setPrice(rs.getString(3));
                s.setImage(rs.getString(4));
                s.setStatus(rs.getString(5));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}


