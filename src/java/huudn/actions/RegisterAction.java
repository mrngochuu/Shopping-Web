/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.actions;

import com.opensymphony.xwork2.ActionSupport;
import huudn.daos.UserDAO;
import huudn.dtos.UserDTO;

/**
 *
 * @author ngochuu
 */
public class RegisterAction extends ActionSupport {

    private String username, fullname, password, confirm, address, phone, email;

    public RegisterAction() {
    }

    @Override
    public void validate() {
        //username
        if (username.length() < 6 || username.length() > 20) {
            addFieldError("lengthUsername", "Length username must be 6 to 20 characters");
        }

        if (!username.matches("[a-zA-Z0-9]*")) {
            addFieldError("specUsername", "Username can not contain special characters");
        }
        
        //fullname
        if (fullname.length() < 1 || fullname.length() > 50) {
            addFieldError("lengthFullname", "Length fullname must be 1 to 50 characters");
        }

        if (!fullname.matches("[a-zA-Z0-9\\s]*")) {
            addFieldError("specFullname", "Fullname can not contain special characters");
        }

        //password
        if (password.length() < 6 || password.length() > 20) {
            addFieldError("lengthPassword", "Length password must be 6 to 20 characters");
        }
        
        if (!password.matches("[a-zA-Z0-9]*")) {
            addFieldError("specPassword", "Password can not contain special characters");
        }
        
        //confirm
        if(!confirm.equals(password) && !password.isEmpty()) {
            addFieldError("confirm", "Password confirmation does not match");
        }
        
        //address
        if (address.isEmpty()) {
            addFieldError("requiredAddress", "Address is required");
        }

        if (!phone.matches("0\\d{9}")) {
            addFieldError("phone", "Phone format is 0xxxxxxxxx");
        }
        
        //email
        if (!email.matches("[a-zA-Z0-9]+([.-_][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z0-9]+([.][a-zA-Z0-9]+)?")) {
            addFieldError("email", "Email is invalid!");
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String execute() throws Exception {
        UserDTO dto = new UserDTO(username, password, fullname, phone, address, email, "user", true);
        UserDAO dao = new UserDAO();
        if (dao.createAccount(dto)) {
            return "success";
        }
        return "error";
    }

}
