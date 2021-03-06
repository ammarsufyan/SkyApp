/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyapp;

import java.sql.*;
import database.Koneksi;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 1 (TI 2020 C)
 */
public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        this.setIconImage(new ImageIcon("src//images//logo//Logo.png").getImage());
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        progress_bar.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_loading = new javax.swing.JLabel();
        lbl_persen = new javax.swing.JLabel();
        progress_bar = new javax.swing.JProgressBar();
        icon_rocket = new javax.swing.JLabel();
        panel_welcome = new javax.swing.JPanel();
        lbl_gambarWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        lbl_loading.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lbl_loading.setForeground(new java.awt.Color(0, 0, 0));
        lbl_loading.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_loading.setText("Loading. . .");
        getContentPane().add(lbl_loading);
        lbl_loading.setBounds(70, 400, 330, 28);

        lbl_persen.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lbl_persen.setForeground(new java.awt.Color(0, 0, 0));
        lbl_persen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_persen.setText("0 %");
        getContentPane().add(lbl_persen);
        lbl_persen.setBounds(710, 400, 120, 28);

        progress_bar.setBackground(new java.awt.Color(255, 255, 255));
        progress_bar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        progress_bar.setForeground(new java.awt.Color(0, 167, 255));
        progress_bar.setOpaque(true);
        getContentPane().add(progress_bar);
        progress_bar.setBounds(70, 430, 760, 40);

        icon_rocket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Rocket.gif"))); // NOI18N
        getContentPane().add(icon_rocket);
        icon_rocket.setBounds(410, 320, 70, 80);

        panel_welcome.setLayout(null);

        lbl_gambarWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_gambarWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page/Welcome.png"))); // NOI18N
        lbl_gambarWelcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbl_gambarWelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_welcome.add(lbl_gambarWelcome);
        lbl_gambarWelcome.setBounds(0, 0, 900, 500);

        getContentPane().add(panel_welcome);
        panel_welcome.setBounds(0, 0, 900, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Welcome wl = new Welcome();
               
        wl.setVisible(true);
        wl.progress_bar.setForeground(new java.awt.Color(0, 167, 255));
        
        try {                  
            for(int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                    wl.lbl_persen.setText(i + "%");

                if(i == 10) {
                    wl.lbl_loading.setText("Turning on Modules. . .");
                } 

                if(i == 20) {
                     wl.lbl_loading.setText("Loading Modules. . .");
                }

                if(i == 50) {
                     wl.lbl_loading.setText("Connecting to Database . . .");
                     Connection conn = new Koneksi().getConSQL();
                }

                if(i == 70) {
                     wl.lbl_loading.setText("Connection Successful. . .");
                }

                if(i == 80) {
                     wl.lbl_loading.setText("Launching Application. . .");
                }

                 wl.progress_bar.setValue(i);
            } 
            
            Login lg = new Login();
            wl.setVisible(false);
            wl.dispose();
            lg.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_rocket;
    private javax.swing.JLabel lbl_gambarWelcome;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JLabel lbl_persen;
    private javax.swing.JPanel panel_welcome;
    private javax.swing.JProgressBar progress_bar;
    // End of variables declaration//GEN-END:variables
}
