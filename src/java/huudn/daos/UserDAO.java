/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huudn.daos;

import huudn.dtos.UserDTO;
import huudn.utils.DatabaseUtils;
import huudn.utils.MyToys;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ngochuu
 */
public class UserDAO implements Serializable {

    private final static String DEFAULT_IMG = "img/img_default.png";

    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public String checkLogin(String username, String password) throws Exception {
        String role = "quest";
        try {
            conn = DatabaseUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT rolename FROM tblUsers WHERE username = ? AND password = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, username);
                pstm.setString(2, MyToys.generateHash(password));
                rs = pstm.executeQuery();
                if (rs.next()) {
                    role = rs.getString("rolename");
                }
            }
        } finally {
            closeConnection();
        }
        return role;
    }

    public boolean createAccount(UserDTO dto) throws Exception {
        boolean check = false;
        try {
            conn = DatabaseUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO tblUsers (username, password, fullname, phone, address, email, isActive, roleName, avatar) values (?,?,?,?,?,?,?,?,?)";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, dto.getUsername());
                pstm.setString(2, MyToys.generateHash(dto.getPassword()));
                pstm.setString(3, dto.getFullname());
                pstm.setString(4, dto.getPhone());
                pstm.setString(5, dto.getAddress());
                pstm.setString(6, dto.getEmail());
                pstm.setBoolean(7, dto.isActive());
                pstm.setString(8, dto.getRoleName());
                pstm.setString(9, DEFAULT_IMG);
                check = pstm.executeUpdate() > 0;
            }
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean updateInfo(String username, String fullname, String phone, String address, String email, String avatar) throws Exception {
        boolean check = false;
        try {
            conn = DatabaseUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblUsers SET fullname = ?, phone = ?, address = ?, email = ?, avatar = ? WHERE username = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, fullname);
                pstm.setString(2, phone);
                pstm.setString(3, address);
                pstm.setString(4, email);
                pstm.setString(5, avatar);
                pstm.setString(6, username);
                check = pstm.executeUpdate() > 0;
            }
        } finally {
            closeConnection();
        }
        return check;
    }

    public UserDTO getUserInfoFromUser(String username) throws Exception {
        UserDTO dto = null;
        try {
            conn = DatabaseUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT fullname, address, phone, email, avatar FROM tblUsers WHERE username = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, username);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    dto = new UserDTO();
                    dto.setFullname(rs.getString("fullname"));
                    dto.setAddress(rs.getString("address"));
                    dto.setPhone(rs.getString("phone"));
                    dto.setEmail(rs.getString("email"));
                    dto.setAvatar(rs.getString("avatar"));
                }
            }
        } finally {
            closeConnection();
        }
        return dto;
    }

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (pstm != null) {
            pstm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
