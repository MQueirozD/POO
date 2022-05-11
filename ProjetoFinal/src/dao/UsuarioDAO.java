/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author rafae
 */
public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public boolean autenticar(String email, String senha) {
        try {
            PreparedStatement stmt = 
   conn.prepareStatement("select * from tab_usuario where email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
        }
        return false;

    }

}
