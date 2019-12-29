package DTO;


import Degiskenler.Kitapp;
import Fonksiyonlar.KitapFonksiyonlari;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Akbal-Emre Ertekin
 */
public class KitapGuncelle extends javax.swing.JFrame {

    /**
     * Creates new form KitapGuncelle
     */
    KitapFonksiyonlari yeni = new KitapFonksiyonlari();
    public KitapGuncelle() {
        super("Kitap Güncelleme");
        initComponents();
        jTable1.setModel(DbUtils.resultSetToTableModel(yeni.listele()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblKitapisim = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        txtBaski = new javax.swing.JTextField();
        lblBaski = new javax.swing.JLabel();
        lblYazar = new javax.swing.JLabel();
        txtYayinci = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSayfaSayisi = new javax.swing.JTextField();
        btnGüncelle = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKitapSec = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(30, 39, 46));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblKitapisim.setText("İsim");

        lblBaski.setText("Baskı");

        lblYazar.setText("Yazar");

        jLabel6.setText("Sayfa Sayısı");

        btnGüncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8-refresh-30.png"))); // NOI18N
        btnGüncelle.setText("Güncelle");
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnGeri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8-return-24.png"))); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel1.setText("Kitap Güncellemek İçin Sağ Taraftaki Listeden İlgili Kitabı Seçin Ve Ardından Bilgileri Düzenleyin ");

        btnKitapSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/icons8-add-book-24.png"))); // NOI18N
        btnKitapSec.setText("Kitap Seç");
        btnKitapSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitapSecActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconlar/baslikanatol.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnKitapSec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYazar)
                            .addComponent(lblBaski)
                            .addComponent(lblKitapisim)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnGüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSayfaSayisi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYayinci)
                            .addComponent(txtisim)
                            .addComponent(txtBaski, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKitapSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKitapisim))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBaski)
                            .addComponent(txtBaski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYayinci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYazar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Kitaplar yeni = new Kitaplar();
        yeni.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed
    int secilendeger;
    private void btnKitapSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitapSecActionPerformed
        // TODO add your handling code here:
        int tablosatir= jTable1.getSelectedRow();//Hangi satır olduğunu alıyor.
        secilendeger=(int) jTable1.getValueAt(tablosatir,0);
        KitapFonksiyonlari getir = new KitapFonksiyonlari();
        Kitapp gelen = getir.kitapGetir(secilendeger);
        txtisim.setText(gelen.isim);
        txtBaski.setText(String.valueOf(gelen.baski));
        txtSayfaSayisi.setText(String.valueOf(gelen.sayfasayisi));
        txtYayinci.setText(gelen.yayimci);
    }//GEN-LAST:event_btnKitapSecActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed
        // TODO add your handling code here:
        Kitapp guncellenecek = new Kitapp();
        guncellenecek.Kitap_ID = secilendeger;
        guncellenecek.isim = txtisim.getText();
        guncellenecek.baski = Integer.parseInt(txtBaski.getText());
        guncellenecek.yayimci = txtYayinci.getText();
        guncellenecek.sayfasayisi = Integer.parseInt(txtSayfaSayisi.getText());
        guncellenecek.stok = 1;
        KitapFonksiyonlari guncelle = new KitapFonksiyonlari();
        guncelle.guncelle(guncellenecek);
        jTable1.setModel(DbUtils.resultSetToTableModel(yeni.listele()));
    }//GEN-LAST:event_btnGüncelleActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KitapGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapGuncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGüncelle;
    private javax.swing.JButton btnKitapSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBaski;
    private javax.swing.JLabel lblKitapisim;
    private javax.swing.JLabel lblYazar;
    private javax.swing.JTextField txtBaski;
    private javax.swing.JTextField txtSayfaSayisi;
    private javax.swing.JTextField txtYayinci;
    private javax.swing.JTextField txtisim;
    // End of variables declaration//GEN-END:variables
}
