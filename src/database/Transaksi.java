/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ammar Sufyan
 */
public class Transaksi {
    
    Connection connection;
    Statement statement;
    ResultSet rs;
    
    static String username, id, kode_pembayaran, jenis_topup; 
    static int hargadb, sisa_saldo;
    
    public String tambah_data(
            String username, String id, String kode_pembayaran, 
            String jenis_topup, int harga, int sisa_saldo
    ) {

        String result = "";
        try {
            connection = new Koneksi().getConSQL();
            String str = "INSERT INTO tb_transaksi(tanggal, username, kode_pembayaran, id, jenis_topup, harga, sisa_saldo) VALUES(getdate(), ?, ?, ?, ?, ?, ?);";
            PreparedStatement pr = connection.prepareStatement(str);

            pr.setString(1, username);
            pr.setString(2, kode_pembayaran);
            pr.setString(3, id);
            pr.setString(4, jenis_topup);
            pr.setInt(5, harga);
            pr.setInt(6, sisa_saldo);

            int i = pr.executeUpdate();
            
            if(i!=0){
                result = "TOPUP BERHASIL";
                connection.close();
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN");
            result = "TOPUP GAGAL";
            e.printStackTrace();
        }

        return  result;

    }
    
        public ArrayList <Object> get_transaksi(String user) {

        ArrayList<Object> assetList = new ArrayList<>();
        try{
            connection = new Koneksi().getConSQL();
            PreparedStatement pr_statment =  connection.prepareStatement("SELECT * FROM tb_transaksi WHERE username = '" + user + "' ORDER BY tanggal DESC");
            ResultSet rs = pr_statment.executeQuery();
            
        while(rs.next()) {
            
            SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy - hh:mm");
            Date date = new Date(rs.getTimestamp(1).getTime()); //AMBIL DARI DATABASE
            String tanggal = ft.format(date); //TANGGAL DARI DATABASE DI FORMAT DENGAN FORMAT YG UDAH DIBUAT
            
            String kode_pembayaran = rs.getString(3).trim();
            String id = rs.getString(4).trim();
            String jenis_topup = rs.getString(5).trim();
            int harga = rs.getInt(6);
            int sisa_saldo = rs.getInt(7);
            
            Object [] dataField = {tanggal, kode_pembayaran, id, jenis_topup, harga, sisa_saldo};
            Collections.addAll(assetList, dataField);
        }
        
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return assetList;
    }
        
    public ArrayList<Object> get_rupiah(String user) {

        ArrayList<Object> assetList = new ArrayList<>();
        try {
            connection = new Koneksi().getConSQL();
            PreparedStatement pr_statment = connection.prepareStatement("SELECT * FROM tb_transaksi WHERE username = ? ORDER BY tanggal DESC");
            pr_statment.setString(1, user);
            ResultSet rs = pr_statment.executeQuery();

            rs.next();
            int sisa_saldo = rs.getInt(7);

            Object[] dataField = {sisa_saldo};
            Collections.addAll(assetList, dataField);

        } catch (SQLException e) {

        }
        return assetList;
    }
    
    public static void set_rupiah(String user, JLabel lbl_rupiah) {
        List<Object> data = new Transaksi().get_rupiah(user);
        
        Object[] sl = data.toArray(new Object[1]);
        Object[] df = {sl[0]};
        
        if(df[0] != null) {
            lbl_rupiah.setText(String.valueOf(df[0]));
        } else if (df[0] == null) {
            lbl_rupiah.setText("0");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR DATABASE SALDO");
        }
    }
    
    public static ArrayList<Character> randomToken() {
        Random rd = new Random();

        String token = "ABCDEFGHXYZ123456789";

        ArrayList<Character> random = new ArrayList<Character>();

        for (int i = 0; i < 12; i++) {
            random.add(token.charAt(rd.nextInt(token.length())));
        }

        return random;
    }
}
