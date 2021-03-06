/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyapp;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 1 (TI 2020 C)
 */
public class Loading extends javax.swing.JFrame {

    public String username;
    
    public Loading(String user) {
        this.setIconImage(new ImageIcon("src//images//logo//Logo.png").getImage());
        initComponents();
        this.username = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_gambar = new javax.swing.JPanel();
        lbl_loading = new javax.swing.JLabel();
        lbl_gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loading...");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 840));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        panel_gambar.setLayout(null);

        lbl_loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/1495.gif"))); // NOI18N
        panel_gambar.add(lbl_loading);
        lbl_loading.setBounds(450, 650, 100, 60);

        lbl_gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page/Loading.png"))); // NOI18N
        lbl_gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel_gambar.add(lbl_gambar);
        lbl_gambar.setBounds(0, 0, 1000, 840);

        getContentPane().add(panel_gambar);
        panel_gambar.setBounds(0, 0, 1000, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Thread.sleep(2000);
            
            
            Menu menu = new Menu(this.username);
            menu.setVisible(true);
            dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_gambar;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JPanel panel_gambar;
    // End of variables declaration//GEN-END:variables
}
