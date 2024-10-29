/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Bowls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class BowlDAOImpl implements BowlDAO {

    public Connection conn;

    public BowlDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean addBowl(Bowls b) {
        boolean f = false;
        try {
            String sql = "Insert into bowls(bowl_detail,price,diameter,made_by,chakra,key_note,photo,status) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, b.getBowl_detail());
            pstmt.setString(2, b.getPrice());
            pstmt.setString(3, b.getDiameter());
            pstmt.setString(4, b.getMade_by());
            pstmt.setString(5, b.getChakra());
            pstmt.setString(6, b.getKey_note());
            pstmt.setString(7, b.getPhoto());
            pstmt.setString(8, b.getStatus());

            int res = pstmt.executeUpdate();
            if (res == 1) {
                f = true;
            }
        } catch (Exception e) {
        }
        return f;
    }

    @Override
    public List<Bowls> getAllBowls() {
        List<Bowls> list = new ArrayList<Bowls>();
        Bowls b = null;

        try {
            String sql = "Select * From bowls";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                b = new Bowls();
                b.setBowl_id(rs.getInt(1));
                b.setBowl_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setDiameter(rs.getString(4));
                b.setMade_by(rs.getString(5));
                b.setChakra(rs.getString(6));
                b.setKey_note(rs.getString(7));
                b.setPhoto(rs.getString(8));
                b.setStatus(rs.getString(9));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Bowls getBowlsBy(int id) {

        Bowls b = null;

        try {
            String sql = "Select *From bowls where bowl_id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                b = new Bowls();
                b.setBowl_id(rs.getInt(1));
                b.setBowl_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setDiameter(rs.getString(4));
                b.setMade_by(rs.getString(5));
                b.setChakra(rs.getString(6));
                b.setKey_note(rs.getString(7));
                b.setPhoto(rs.getString(8));
                b.setStatus(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return b;
    }

    @Override
    public boolean updateEditBowl(Bowls b) {
        boolean f = false;
        try {
            String sql = "Update bowls set bowl_detail=?,price=?,diameter=?,made_by=?,chakra=?,key_note=?,status=? where bowl_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, b.getBowl_detail());
            pstmt.setString(2, b.getPrice());
            pstmt.setString(3, b.getDiameter());
            pstmt.setString(4, b.getMade_by());
            pstmt.setString(5, b.getChakra());
            pstmt.setString(6, b.getKey_note());
            pstmt.setString(7, b.getStatus());
            pstmt.setInt(8, b.getBowl_id());

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
    public boolean deleteBowl(int id) {
        boolean f = false;
        try {
            String sql = "Delete from bowls where bowl_id=?";
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
    public List<Bowls> getBowls() {
        List<Bowls> list = new ArrayList<Bowls>();
        Bowls b = null;
        try {
            String sql = "Select * from bowls where status=? order by bowl_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Active");
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new Bowls();
                b.setBowl_id(rs.getInt(1));
                b.setBowl_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setDiameter(rs.getString(4));
                b.setMade_by(rs.getString(5));
                b.setChakra(rs.getString(6));
                b.setKey_note(rs.getString(7));
                b.setPhoto(rs.getString(8));
                b.setStatus(rs.getString(9));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<Bowls> displayAllBowl() {
        List<Bowls> list = new ArrayList<Bowls>();
        Bowls b = null;
        try {
            String sql = "Select * from bowls where status=? order by bowl_id DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Active");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                b = new Bowls();
                b.setBowl_id(rs.getInt(1));
                b.setBowl_detail(rs.getString(2));
                b.setPrice(rs.getString(3));
                b.setDiameter(rs.getString(4));
                b.setMade_by(rs.getString(5));
                b.setChakra(rs.getString(6));
                b.setKey_note(rs.getString(7));
                b.setPhoto(rs.getString(8));
                b.setStatus(rs.getString(9));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
