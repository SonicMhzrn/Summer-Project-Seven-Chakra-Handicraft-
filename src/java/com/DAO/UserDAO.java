/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.User;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface UserDAO {

    public boolean userRegister(User us);

    public User login(String email, String password);

    public boolean checkUser(String email);

    public List<User> getAllUsers();

    public boolean deleteUser(int id);

    public User getUserby(int id);
    
    public boolean updateUser(User u);
    
}
