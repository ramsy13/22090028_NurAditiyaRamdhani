/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Nur Aditiya Ramadhani
 */
public class Cetak_Tiket extends javax.swing.JFrame {
    private Connection conn= new koneksi().connect();
    private DefaultTableModel tabmode;
    private BufferedImage image = null;
    /**
     * Creates new form Cetak_Tiket
     */
    public Cetak_Tiket() {
        initComponents();
        setLocationRelativeTo(null);
        datatablecetak();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void datatablecetak(){
        Object[] Baris = {"ID", "Kategori"};
        tabmode = new DefaultTableModel(null, Baris);
        tblCtk.setModel(tabmode);
        String sql = "SELECT * FROM data_pengunjung";
      try {
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()) {
            String a = hasil.getString("ID");
            String e = hasil.getString("KATEGORI");
            String[] data = {a, e};
            tabmode.addRow(data);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIDCtk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPrintTkt = new javax.swing.JButton();
        lb_BC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCtk = new javax.swing.JTable();
        cbBC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CETAK TIKET");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("ID");

        jLabel3.setText("Jenis BC");

        btnPrintTkt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/print_filled_20px.png"))); // NOI18N
        btnPrintTkt.setText("Print");
        btnPrintTkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTktActionPerformed(evt);
            }
        });

        tblCtk.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCtk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCtkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCtk);

        cbBC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bundling", "Non Bundling", " " }));
        cbBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDCtk)
                            .addComponent(cbBC, 0, 125, Short.MAX_VALUE)))
                    .addComponent(btnPrintTkt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDCtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(btnPrintTkt)
                        .addGap(18, 18, 18)
                        .addComponent(lb_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean cekID(String id) {
        String query = "SELECT * FROM data_pengunjung WHERE ID = ?";

        try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}
    private boolean cekBC(String id, String selectedBarcodeType) {
        String query = "SELECT KATEGORI FROM data_pengunjung WHERE ID = ?";
        try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String existingCategory = resultSet.getString("KATEGORI");
            return !existingCategory.equals(selectedBarcodeType);
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }

    private void btnPrintTktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTktActionPerformed

        String id = txtIDCtk.getText().trim();
        if (id.equals("")) {
        return;
    }
        if (!cekID(id)) {
        JOptionPane.showMessageDialog(null, "ID Tidak Valid.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String selectedBarcodeType = cbBC.getSelectedItem().toString();
        if (cekBC(id, selectedBarcodeType)) {
        JOptionPane.showMessageDialog(null, "Barcode sudah pernah dicetak.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        Barcode barcode = null;
        switch (selectedBarcodeType) {
            case "Bundling":
                try {
                barcode = BarcodeFactory.createCode128(id);
                } catch (BarcodeException ex) {
                Logger.getLogger(Cetak_Tiket.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;

            case "Non Bundling":
                try {
                barcode = BarcodeFactory.createEAN128(id);
                } catch (BarcodeException ex) {
                Logger.getLogger(Cetak_Tiket.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;

            default:
                break;
            }

        if (barcode != null) {
            barcode.setBarWidth(2);
            barcode.setBarHeight(100);

            try {
                Image image = BarcodeImageHandler.getImage(barcode);
                ImageIcon barcodeIcon = new ImageIcon(image);
                lb_BC.setIcon(barcodeIcon);
                String insertSql = "INSERT INTO cetak (ID, KATEGORI) VALUES (?, ?)";
                try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(insertSql)) {
                    preparedStatement.setString(1, id);
                    preparedStatement.setString(2, selectedBarcodeType);
                    preparedStatement.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (OutputException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnPrintTktActionPerformed

    private void tblCtkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCtkMouseClicked
        int bar = tblCtk.getSelectedRow();
        String a = tabmode.getValueAt(bar,0).toString();
        String e = tabmode.getValueAt(bar,1).toString();
        
        txtIDCtk.setText(a);
        if(e.equals("Bundling")){
            cbBC.setSelectedItem("Bundling");
        }else{
            cbBC.setSelectedItem("Non Bundling");
        }
    }//GEN-LAST:event_tblCtkMouseClicked

    private void cbBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBCActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cetak_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cetak_Tiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintTkt;
    private javax.swing.JComboBox<String> cbBC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_BC;
    private javax.swing.JTable tblCtk;
    private javax.swing.JTextField txtIDCtk;
    // End of variables declaration//GEN-END:variables
}
