/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Statue;
import com.entity.User;
import com.user.servlet.PasswordHashing;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class UserDAOImpl implements UserDAO {

    private Connection conn;

    public UserDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean userRegister(User us) {
        boolean f = false;
        try {
            String sql = "Insert into user (username, email, password, re_password, address, phone) Values(?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, us.getUsername());
            pstmt.setString(2, us.getEmail());
            pstmt.setString(3, us.getPassword());
            pstmt.setString(4, us.getRe_password());
            pstmt.setString(5, us.getAddress());
            pstmt.setString(6, us.getPhone());

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
    public User login(String email, String password) {
        User us = null;
         
      try {
        String sql = "SELECT * FROM user WHERE email=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            // Get the hashed password stored in the database   
            String hashedPassword = rs.getString("password");

            // Compare the hashed password with the hashed user input password
            if (PasswordHashing.verifyPassword(password, hashedPassword)) {
                us = new User();
                us.setId(rs.getInt(1));
                us.setUsername(rs.getString(2));
                us.setEmail(rs.getString(3));
                // Avoid returning hashed passwords
                us.setPassword(""); // Or you can set it to null
                us.setRe_password(""); // Or you can set it to null
                us.setAddress(rs.getString(6));
                us.setPhone(rs.getString(7));
                break; // Exit loop if a matching user is found
            }
        }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return us;
    }

    @Override
    public boolean checkUser(String email) {
        boolean f = true;
        
        try {
            
            String sql = "Select *From user where email=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,email);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                f= false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
        
    }

     @Override
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<User>();
        User u = null;

        try {
            String sql = "Select * From user";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               String username = rs.getString(2);
            // Skip 'admin' user
            if (!username.equalsIgnoreCase("admin")) {
                u = new User();
                u.setId(rs.getInt(1));
                u.setUsername(username);
                u.setEmail(rs.getString(3));
                u.setAddress(rs.getString(6));
                u.setPhone(rs.getString(7));
                list.add(u);
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
     @Override
    public boolean deleteUser(int id) {
        boolean f = false;
        try {
            String sql = "Delete from user where statue_id=?";
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
    public User getUserby(int id) {
        List<User> list = new ArrayList<User>();
        User u = null;

        try {
            String sql = "Select * From user where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               String username = rs.getString(2);
            // Skip 'admin' user
            if (!username.equalsIgnoreCase("admin")) {
                u = new User();
                u.setId(rs.getInt(1));
                u.setUsername(username);
                u.setEmail(rs.getString(3));
                u.setAddress(rs.getString(6));
                u.setPhone(rs.getString(7));
                list.add(u);
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (User) list;
    }

    @Override
    public boolean updateUser(User u) {
        boolean f = false;
        try {
            String sql = "Update user set email=?,address=?,phone=? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, u.getEmail());
            pstmt.setString(2, u.getAddress());
            pstmt.setString(3, u.getPhone());
            pstmt.setInt(4, u.getId());


            int res = pstmt.executeUpdate();
            if (res == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    
}

