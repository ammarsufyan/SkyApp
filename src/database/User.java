/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Ammar Sufyan
 */
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;


public class User {

    Connection connection;
    Statement statement;
    ResultSet rs;

    public String tambah_user(String email, String username, String password) {

        String result = "";
        try {

            connection = new Koneksi().getConSQL();
            String str = "INSERT INTO tb_login(email, username, password) VALUES(?,?,?);";
            PreparedStatement pr = connection.prepareStatement(str);

            pr.setString(1,email);
            pr.setString(2,username);
            pr.setString(3,password);

            int i = pr.executeUpdate();
            if(i!=0){
                result = "REGISTRASI BERHASIL";
                connection.close();
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "EMAIL ATAU USERNAME SUDAH TERDAFTAR");
            result = "DATA GAGAL DITAMBAHKAN";
        }

        return  result;

    }
    
    public String update_user(String username, String password) {

        String result = "";
        try {

            connection = new Koneksi().getConSQL();
            String str = "UPDATE tb_login SET password = ? WHERE username = ?;";
            PreparedStatement pr = connection.prepareStatement(str);

            pr.setString(1,password);
            pr.setString(2,username);

            int i = pr.executeUpdate();
            if(i!=0){
                result = "RESET PASSWORD BERHASIL";
                connection.close();
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "RESET PASSWORD GAGAL");
            result = "DATA GAGAL DITAMBAHKAN";
        }

        return  result;

    }
    

    public boolean verifikasi_user (String username, String password) {
        try {
            
            connection = new Koneksi().getConSQL();
            statement = connection.createStatement();
            String str = "SELECT * FROM tb_login WHERE username = '" + username + "' AND password = '" + password + "' ";
            rs = statement.executeQuery(str);

            
            if (rs.next()) {
                return true;            
                
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    return false;

    }
    
    public ArrayList <Object> get_user(String str) {

        ArrayList<Object> assetList = new ArrayList<>();
        try{
            connection = new Koneksi().getConSQL();
            PreparedStatement pr_statment =  connection.prepareStatement("SELECT * FROM tb_login WHERE username = ?");
            pr_statment.setString(1, str);
            pr_statment.setString(2, str);
            ResultSet rs = pr_statment.executeQuery();
            rs.next();

            String email = rs.getString(1).trim();
            String username = rs.getString(2).trim();
            String password = rs.getString(3).trim();

            Object [] dataField = {email, username, password};
            Collections.addAll(assetList, dataField);

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return assetList;
    }
}

