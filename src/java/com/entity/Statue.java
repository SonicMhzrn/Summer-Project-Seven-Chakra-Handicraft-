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
public class Statue implements Serializable {

    private static final long serialVersionUID = 1L;
    private int statue_id;
    private String statue_detail;
    private String price;
    private String image;
    private String status;

    public Statue() {
        super();
    }

    public Statue(String statue_detail, String price, String image, String status) {
        super();

        this.statue_detail = statue_detail;
        this.price = price;
        this.image = image;
        this.status = status;
    }

    public int getStatue_id() {
        return statue_id;
    }

    public void setStatue_id(int statue_id) {
        this.statue_id = statue_id;
    }

    public String getStatue_detail() {
        return statue_detail;
    }

    public void setStatue_detail(String statue_detail) {
        this.statue_detail = statue_detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Statue{" + "statue_id=" + statue_id + ", statue_detail=" + statue_detail + ", price=" + price + ", image=" + image + ", status=" + status + '}';
    }

  
}
