/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import huudn.daos.UserDAO;
import java.io.File;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author ngochuu
 */
public class UpdateInfoAction extends ActionSupport {

    private String fullname, address, phone, email;
    private File avatar;

    public UpdateInfoAction() {
    }

    @Override
    public void validate() {
        //fullname
        if (fullname.length() < 1 || fullname.length() > 50) {
            addFieldError("lengthFullname", "Length fullname must be 1 to 50 characters");
        }

        if (!fullname.matches("[a-zA-Z0-9\\s]*")) {
            addFieldError("specFullname", "Fullname can not contain special characters");
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
        Map session = ActionContext.getContext().getSession();
        String username = (String) session.get("USERNAME");
        HttpServletRequest request = ServletActionContext.getRequest();
        UserDAO dao = new UserDAO();
        if (dao.updateInfo(username, fullname, phone, address, email, avatar.getPath())) {
            return "success";
        }
        request.setAttribute("ERROR", "Update failed!");
        return "error";
    }

}
