/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import huudn.daos.UserDAO;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author ngochuu
 */
public class LoginAction extends ActionSupport {

    private String username, password;
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    private static final String INVALID = "invalid";

    public LoginAction() {
    }

    @Override
    public void validate() {
        if(username.isEmpty()) {
            addFieldError("username", "Username is required!");
        }
        if(password.isEmpty()) {
            addFieldError("password", "Password is required!");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        String url = ERROR;
        UserDAO dao = new UserDAO();
        String role = dao.checkLogin(username, password);
        Map session = ActionContext.getContext().getSession();
        HttpServletRequest request = ServletActionContext.getRequest();

        if (role.equals("quest")) {
            url = INVALID;
            request.setAttribute("INVALID", "Invalid username or password!");
        } else {
            if (role.equals("admin") || role.equals("user")) {
                session.put("ROLE", role);
                session.put("USERNAME", username);
                url = SUCCESS;
            } else {
                request.setAttribute("ERROR", "Your role is not supported!");
            }
        }
        return url;
    }

}
