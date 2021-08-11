package cek_validasi;

import javax.swing.*;

public class EmptyValidation {

    public static String cekRegistrasi(JTextField email, JTextField username, JPasswordField password) {
        String hasil;
        String val_username = username.getText();
        String val_email = email.getText();
        
        if(val_email.equals("") || val_email.equals("email") || !val_email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$")){
            hasil = "EMAIL HARUS DIISI DENGAN BENAR";
        } else if(val_username.equals("") || val_username.equals("username") || !val_username.matches("[a-zA-Z0-9]{8,16}")){
            hasil = "MASUKKAN USERNAME (MINIMAL 8 HURUF TANPA SPASI)";
        } else if (new String(password.getPassword()).equals("") || new String(password.getPassword()).equals("Password") || !new String(password.getPassword()).matches("[a-zA-Z0-9]{8,16}")) {
            hasil = "PASSWORD HARUS DIISI DENGAN BENAR (MINIMAL 8 HURUF TANPA SPASI)";
        } else{
            hasil = "valid";
        }
        return hasil;
    }

    public static String cekLogin(JTextField username, JPasswordField password) {
        String hasil;
        String val_username = username.getText();
        
        if(val_username.equals("") || val_username.trim().equals("username") || !val_username.matches("[a-zA-Z0-9]{8,16}")){
            hasil = "MASUKKAN USERNAME DENGAN BENAR";
        } else if (new String(password.getPassword()).equals("") || new String(password.getPassword()).equals("Password") || !new String(password.getPassword()).matches("[a-zA-Z0-9]{8,16}")) {
            hasil = "MASUKKAN PASSWORD DENGAN BENAR";
        } else{
            hasil = "valid";
        }
        return hasil;
    }
    
    public static String cekReset(JTextField username, JPasswordField password, JPasswordField passwordVal) {
        String hasil;
        String val_username = username.getText();
        
        if(val_username.equals("") || val_username.trim().equals("username") || !val_username.matches("[a-zA-Z0-9]{8,16}")){
            hasil = "MASUKKAN USERNAME DENGAN BENAR";
        } else if (new String(password.getPassword()).equals("") || new String(password.getPassword()).equals("Password") || !new String(password.getPassword()).matches("[a-zA-Z0-9]{8,16}")) {
            hasil = "MASUKKAN PASSWORD DENGAN BENAR (MINIMAL 8 HURUF TANPA SPASI)";
        } else if (!new String(passwordVal.getPassword()).equals(new String(password.getPassword()))) {
            hasil = "PASSWORD TIDAK SAMA";
        } else {
            hasil = "valid";
        }
        return hasil;
    }

    public static String cekTopupSaldo(JComboBox nominal, JComboBox pembayaran) {
        String hasil;
        if(nominal.getSelectedIndex() == 0){
            hasil = "SILAKAN PILIH NOMINAL";
        } else if (pembayaran.getSelectedIndex() == 0) {
            hasil = "SILAKAN PILIH PEMBAYARAN";
        } else{
            hasil = "valid";
        }
        return hasil;
    }

    public static String cekTopupGame(JTextField id, JComboBox nominal, JTextField harga) {
        String hasil;
        String val_id = id.getText().trim();
        
        if(val_id.equals("") || val_id.trim().equals("MASUKKAN ID") || !val_id.matches("[a-zA-Z0-9#]{4,16}")){
            hasil = "SILAKAN MASUKKAN ID DENGAN BENAR";
        } else if (nominal.getSelectedIndex() == 0) {
            hasil = "SILAKAN PILIH NOMINAL";
        } else if (harga.getText().trim().equals("") || harga.getText().trim().equals("0")) {
            hasil = "SILAKAN PILIH PEMBAYARAN";
        } else {
            hasil = "valid";
        }
        return hasil;
    }
    
    public static String cekTopupAplikasi(JTextField email, JComboBox nominal, JTextField harga) {
        String hasil;
        
        String val_email = email.getText().trim();
        
        if(val_email.equals("") || val_email.equals("email") || !val_email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$")){
            hasil = "EMAIL HARUS DIISI DENGAN BENAR";
        } else if (nominal.getSelectedIndex() == 0) {
            hasil = "SILAKAN PILIH NOMINAL";
        } else if (harga.getText().trim().equals("") || harga.getText().trim().equals("0")) {
            hasil = "SILAKAN PILIH PEMBAYARAN";
        } else {
            hasil = "valid";
        }
        return hasil;
    }
        
}
