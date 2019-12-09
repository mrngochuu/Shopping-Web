/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import huudn.daos.UserDAO;
import huudn.dtos.UserDTO;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author ngochuu
 */
public class ShowInfoAction extends ActionSupport {
    
    public ShowInfoAction() {
    }
    
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        String username = (String) session.get("USERNAME");
        UserDAO dao = new UserDAO();
        UserDTO dto = dao.getUserInfoFromUser(username);
        HttpServletRequest request = ServletActionContext.getRequest();
        System.out.println("avatar: " + dto.getAvatar());
        if (dto != null) {
            request.setAttribute("USER", dto);
            return "success";
        }
        request.setAttribute("ERROR", "Show infomation failed!");
        return "error";
    }
    
}
