/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_games;

import cek_validasi.EmptyValidation;
import database.Transaksi;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import skyapp.Menu;

/**
 *
 * @author Kelompok 1 (TI 2020 C)
 */
public class HONKAI extends javax.swing.JFrame {
    public int saldo;
    public String user;
    
    int xMouse;
    int yMouse;

    String username, id, kode_pembayaran, jenis_topup; 
    int hargadb, sisa_saldo;

    public HONKAI(String user) {
        this.setIconImage(new ImageIcon("src//images//logo//Logo.png").getImage());
        initComponents();
        
        Transaksi.set_rupiah(user, lbl_rupiah);
        this.user = user;
        this.saldo += Integer.parseInt(lbl_rupiah.getText().trim());
        
        cb_nominal.setBackground(new Color(0,0,0,0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_harga = new javax.swing.JTextField();
        lbl_HI3 = new javax.swing.JLabel();
        cb_nominal = new javax.swing.JComboBox<>();
        lbl_rupiah = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        lbl_bayar = new javax.swing.JLabel();
        txt_userid = new javax.swing.JTextField();
        panel_gambarHONKAI = new javax.swing.JPanel();
        lbl_gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HONKAI IMPACT 3");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        txt_harga.setEditable(false);
        txt_harga.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_harga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_harga.setText("0");
        txt_harga.setBorder(null);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        txt_harga.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_hargaPropertyChange(evt);
            }
        });
        getContentPane().add(txt_harga);
        txt_harga.setBounds(270, 400, 220, 30);

        lbl_HI3.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        lbl_HI3.setForeground(new java.awt.Color(0, 167, 255));
        lbl_HI3.setText("HONKAI IMPACT 3");
        getContentPane().add(lbl_HI3);
        lbl_HI3.setBounds(70, 10, 260, 40);

        cb_nominal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cb_nominal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Pilih Nominal-----", "30 Crystals ", "65 Crystals", "330 Crystals ", "710 Crystals ", "1430 Crystals", "3860 Crystals", "8088 Crystals ", " " }));
        cb_nominal.setBorder(null);
        cb_nominal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nominalActionPerformed(evt);
            }
        });
        getContentPane().add(cb_nominal);
        cb_nominal.setBounds(270, 360, 220, 30);

        lbl_rupiah.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        lbl_rupiah.setForeground(new java.awt.Color(0, 167, 255));
        lbl_rupiah.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_rupiah.setText("0");
        getContentPane().add(lbl_rupiah);
        lbl_rupiah.setBounds(420, 20, 180, 40);

        lbl_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_back);
        lbl_back.setBounds(10, 10, 50, 40);

        lbl_bayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_bayarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_bayar);
        lbl_bayar.setBounds(250, 510, 100, 30);

        txt_userid.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txt_userid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_userid.setText("MASUKKAN ID");
        txt_userid.setBorder(null);
        txt_userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_useridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_useridFocusLost(evt);
            }
        });
        txt_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_useridActionPerformed(evt);
            }
        });
        getContentPane().add(txt_userid);
        txt_userid.setBounds(270, 310, 220, 30);

        panel_gambarHONKAI.setBackground(new java.awt.Color(204, 204, 204));
        panel_gambarHONKAI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel_gambarHONKAI.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_gambarHONKAIMouseDragged(evt);
            }
        });
        panel_gambarHONKAI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_gambarHONKAIMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_gambarHONKAIMouseReleased(evt);
            }
        });
        panel_gambarHONKAI.setLayout(null);

        lbl_gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frametopup/FrameTopupHonkai.png"))); // NOI18N
        lbl_gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel_gambarHONKAI.add(lbl_gambar);
        lbl_gambar.setBounds(0, 0, 600, 600);

        getContentPane().add(panel_gambarHONKAI);
        panel_gambarHONKAI.setBounds(0, 0, 600, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void set_data() {
        username = this.user;
        
        id = txt_userid.getText().trim();
        
        kode_pembayaran = Transaksi.randomToken().toString().replaceAll("([^A-Z0-9]+)", "");
     
        jenis_topup = lbl_HI3.getText().trim();
        
        hargadb = Integer.parseInt(txt_harga.getText().trim());
        sisa_saldo = Integer.parseInt(lbl_rupiah.getText().trim());
    }
    
    private void cb_nominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nominalActionPerformed
        int cb = cb_nominal.getSelectedIndex();
        if(cb == 0) {
            txt_harga.setText("0");
        } else if (cb == 1) {
            txt_harga.setText("8000");
        } else if (cb == 2) {
            txt_harga.setText("15000");
        } else if (cb == 3) {
            txt_harga.setText("75000");
        } else if (cb == 4) {
            txt_harga.setText("149000");
        } else if (cb == 5) {
            txt_harga.setText("299000");
        } else if (cb == 6) {
            txt_harga.setText("600000");
        } else if (cb == 7) {
            txt_harga.setText("1490000");
        }

    }//GEN-LAST:event_cb_nominalActionPerformed

    private void txt_hargaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_hargaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaPropertyChange

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_useridActionPerformed

    private void lbl_bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_bayarMouseClicked
        String cek = EmptyValidation.cekTopupGame(txt_userid, cb_nominal, txt_harga);
        
        int harga = Integer.parseInt(txt_harga.getText());
        int saldo = Integer.parseInt(lbl_rupiah.getText());
        
        if(cek.equals("valid")) {
            if (harga <= saldo) {
            this.saldo -= harga;

            lbl_rupiah.setText(String.valueOf(this.saldo));
            JOptionPane.showMessageDialog(null, "SELAMAT! TOPUP " + cb_nominal.getSelectedItem().toString() + " KAMU BERHASIL", "TOPUP BERHASIL", JOptionPane.INFORMATION_MESSAGE);
            set_data();
            String simpan = new Transaksi().tambah_data(username, id, kode_pembayaran, jenis_topup, hargadb, sisa_saldo);
            } else if (harga > saldo) {
                JOptionPane.showMessageDialog(null, "SALDO TIDAK CUKUP!");
            }        
            
        } else {
            JOptionPane.showMessageDialog(null, cek);
        }  
    }//GEN-LAST:event_lbl_bayarMouseClicked

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        Menu Menu = new Menu(this.user);
        
        Menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_backMouseClicked

    private void panel_gambarHONKAIMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_gambarHONKAIMouseReleased
        panel_gambarHONKAI.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_panel_gambarHONKAIMouseReleased

    private void panel_gambarHONKAIMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_gambarHONKAIMouseDragged
       panel_gambarHONKAI.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
       
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();

       this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_panel_gambarHONKAIMouseDragged

    private void panel_gambarHONKAIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_gambarHONKAIMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_gambarHONKAIMousePressed

    private void txt_useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_useridFocusGained
        if(txt_userid.getText().equals("MASUKKAN ID")){
            txt_userid.setText("");
        }

        txt_userid.setForeground(new Color (54, 64, 77));
    }//GEN-LAST:event_txt_useridFocusGained

    private void txt_useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_useridFocusLost
        if(txt_userid.getText().equals("")){
            txt_userid.setText("MASUKKAN ID");
        }

        txt_userid.setForeground(new Color (54, 64, 77));
    }//GEN-LAST:event_txt_useridFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_nominal;
    private javax.swing.JLabel lbl_HI3;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_bayar;
    private javax.swing.JLabel lbl_gambar;
    static javax.swing.JLabel lbl_rupiah;
    private javax.swing.JPanel panel_gambarHONKAI;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_userid;
    // End of variables declaration//GEN-END:variables
}