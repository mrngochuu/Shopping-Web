/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.dtos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ngochuu
 */
public class RealEstateDTO implements Serializable {
    private int productID;
    private String title, description, address, picture, categoryName;
    private float area;
    private long price;
    private Date postTime;
    private boolean active;

    public RealEstateDTO() {
    }

    public RealEstateDTO(int productID, String title, String description, String address, String picture, String categoryName, float area, long price, Date postTime, boolean active) {
        this.productID = productID;
        this.title = title;
        this.description = description;
        this.address = address;
        this.picture = picture;
        this.categoryName = categoryName;
        this.area = area;
        this.price = price;
        this.postTime = postTime;
        this.active = active;
    }

    //Contructor without productID
    public RealEstateDTO(String title, String description, String address, String picture, String categoryName, float area, long price, Date postTime, boolean active) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.picture = picture;
        this.categoryName = categoryName;
        this.area = area;
        this.price = price;
        this.postTime = postTime;
        this.active = active;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
