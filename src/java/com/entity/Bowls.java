/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Bowls implements Serializable{
    private static final long serialVersionUID = 1L;
    private int bowl_id;
    private String bowl_detail;
    private String price;
    private String diameter;
    private String made_by;
    private String chakra;
    private String key_note;
    private String photo;
    private String status;
    public Bowls() {
        super();
    }

    public Bowls(String bowl_detail, String price, String diameter, String made_by, String chakra, String key_note, String photo, String status) {
        super();
        this.bowl_detail = bowl_detail;
        this.price = price;
        this.diameter = diameter;
        this.made_by = made_by;
        this.chakra = chakra;
        this.key_note = key_note;
        this.photo = photo;
        this.status = status;
    }

    public int getBowl_id() {
        return bowl_id;
    }

    public void setBowl_id(int bowl_id) {
        this.bowl_id = bowl_id;
    }

    public String getBowl_detail() {
        return bowl_detail;
    }

    public void setBowl_detail(String bowl_detail) {
        this.bowl_detail = bowl_detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getMade_by() {
        return made_by;
    }

    public void setMade_by(String made_by) {
        this.made_by = made_by;
    }

    public String getChakra() {
        return chakra;
    }

    public void setChakra(String chakra) {
        this.chakra = chakra;
    }

    public String getKey_note() {
        return key_note;
    }

    public void setKey_note(String key_note) {
        this.key_note = key_note;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bowls{" + "bowl_id=" + bowl_id + ", bowl_detail=" + bowl_detail + ", price=" + price + ", diameter=" + diameter + ", made_by=" + made_by + ", chakra=" + chakra + ", key_note=" + key_note + ", photo=" + photo + ", status=" + status + '}';
    }
    
    
}
