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
public class CartDTO implements Serializable {
    private String username;
    private int productID;
    private Date addTime, checkoutTime;
    private boolean checkout;

    public CartDTO() {
    }

    public CartDTO(String username, int productID, Date addTime, Date checkoutTime, boolean checkout) {
        this.username = username;
        this.productID = productID;
        this.addTime = addTime;
        this.checkoutTime = checkoutTime;
        this.checkout = checkout;
    }
    
    //Contructer without checkoutTime
    public CartDTO(String username, int productID, Date addTime, boolean checkout) {
        this.username = username;
        this.productID = productID;
        this.addTime = addTime;
        this.checkout = checkout;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setIsCheckout(boolean checkout) {
        this.checkout = checkout;
    }
}
