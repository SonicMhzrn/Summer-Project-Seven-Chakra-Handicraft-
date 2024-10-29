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
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    private int p_id;
    private String p_detail;
    private String price;
    private String category;
    private String image;
    private String status;

    public Products() {
        super();
    }

    public Products(String p_detail, String price, String category, String image, String status) {
        this.p_detail = p_detail;
        this.price = price;
        this.category = category;
        this.image = image;
        this.status = status;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_detail() {
        return p_detail;
    }

    public void setP_detail(String p_detail) {
        this.p_detail = p_detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        return "Products{" + "p_id=" + p_id + ", p_detail=" + p_detail + ", price=" + price + ", category=" + category + ", image=" + image + ", status=" + status + '}';
    }
    
}

