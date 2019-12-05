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
                String sql = "INSERT INTO tblUsers (username, password, fullname, phone, address, email, isActive, roleName) values (?,?,?,?,?,?,?,?)";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, dto.getUsername());
                pstm.setString(2, MyToys.generateHash(dto.getPassword()));
                pstm.setString(3, dto.getFullname());
                pstm.setString(4, dto.getPhone());
                pstm.setString(5, dto.getAddress());
                pstm.setString(6, dto.getEmail());
                pstm.setBoolean(7, dto.isActive());
                pstm.setString(8, dto.getRoleName());
                check = pstm.executeUpdate() > 0;
            }
        }finally {
            closeConnection();
        }
        return check;
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
