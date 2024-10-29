/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Bowls;
import java.util.List;


/**
 *
 * @author Dell
 */
public interface BowlDAO {
    
    public boolean addBowl(Bowls b);
    public List<Bowls> getAllBowls();
    public Bowls getBowlsBy(int id);
    public boolean updateEditBowl(Bowls b);
    public boolean deleteBowl(int id);
    public List<Bowls> getBowls();
    public List<Bowls> displayAllBowl();
   
    
}
