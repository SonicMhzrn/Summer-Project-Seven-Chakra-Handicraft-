/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.Statue;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface StatueDAO {

    public boolean addStatue(Statue b);

    public List<Statue> getAllStatue();

    public Statue getStatueBy(int id);

    public boolean updateEditStatue(Statue b);

    public boolean deleteStatue(int id);

    public List<Statue> getStatues();

    public List<Statue> displayAllStatue();
}
