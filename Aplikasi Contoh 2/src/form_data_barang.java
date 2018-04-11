import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_data_barang extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    
    private void tampil_barang(){
        Object[]baris = {"No. Pesanan", "Nama Pelanggan", "Kode Meja", "Pesanan Pelanggan", "Total Harga"};
        tabmode= new DefaultTableModel(null, baris);
        table_pesanan.setModel(tabmode);
        String sql = "select * from order1 order by nopesan asc";
        try {
            Connection konek = new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String nopesan = hasil.getString("nopesan");
                String namal = hasil.getString("namal");
                String kodemeja = hasil.getString("kodemeja");
                String pesanmenu = hasil.getString("pesanmenu");
                String totalharga = hasil.getString("hargatot");
                String[]data = {nopesan, namal, kodemeja, pesanmenu, totalharga};
                tabmode.addRow(data);
            }
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public form_data_barang() {
        initComponents();
        tampil_barang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pesanan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtpesan = new javax.swing.JTextField();
        b_Simpan = new javax.swing.JButton();
        b_Reset = new javax.swing.JButton();
        b_Update = new javax.swing.JButton();
        b_Delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtkodem = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesanan Makanan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PEMESANAN");
        jLabel1.setAutoscrolls(true);

        table_pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Pesanan", "Nama Pelanggan", "Kode Meja", "Pesanan Pelanggan", "Total Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pesanan);

        jButton1.setText("Refresh Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode Pesanan");

        jLabel4.setText("Nama Pelanggan");

        jLabel5.setText("Kode Meja");

        jLabel6.setText("Pesanan Pelanggan");

        b_Simpan.setText("Simpan");
        b_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SimpanActionPerformed(evt);
            }
        });

        b_Reset.setText("Reset");
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        b_Update.setText("Update");
        b_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UpdateActionPerformed(evt);
            }
        });

        b_Delete.setText("Delete");
        b_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Harga");

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga");

        jLabel9.setText("jumlah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(txtkodem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(63, 63, 63)
                        .addComponent(txttotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(b_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b_Simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(57, 84, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtpesan))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtkodem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Simpan)
                            .addComponent(b_Reset))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Delete)
                            .addComponent(b_Update))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil_barang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void b_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SimpanActionPerformed
        String nopesan="", namal = "", kodemeja="", pesanmenu="";
        int totalharga = 0;
        
        nopesan = txtno.getText();
        namal = txtnama.getText();
        kodemeja = txtkodem.getText();
        pesanmenu = txtpesan.getText();
        
        totalharga = Integer.parseInt(txttotal.getText());
        Connection konek = new koneksi_mysql().getConnection();
        try {
            String sql = "insert into order1 values('"+nopesan+"', '"+namal+"', '"+kodemeja+"', '"+pesanmenu+"', '"+totalharga+"')";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (HeadlessException | SQLException e) {
            
        }
    }//GEN-LAST:event_b_SimpanActionPerformed
    
    private void reset(){
        txtno.setText("");
        txtnama.setText("");
        txtkodem.setText("");
        txtjumlah.setText("");
        txtpesan.setText("");
        txttotal.setText("");
        txtharga.setText("");
    }
    
    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        reset();
    }//GEN-LAST:event_b_ResetActionPerformed

    
    
    private void table_pesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pesananMouseClicked
        // TODO add your handling code here:
        int tabelPesanan = table_pesanan.getSelectedRow();
        txtno.setText(table_pesanan.getValueAt(tabelPesanan, 0).toString());
        txtnama.setText(table_pesanan.getValueAt(tabelPesanan, 1).toString());
        txtkodem.setText(table_pesanan.getValueAt(tabelPesanan, 2).toString());
        txtpesan.setText(table_pesanan.getValueAt(tabelPesanan, 3).toString());
        txttotal.setText(table_pesanan.getValueAt(tabelPesanan, 4).toString());
        
    }//GEN-LAST:event_table_pesananMouseClicked

    private void b_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UpdateActionPerformed
        String nopesan="", namal = "", kodemeja="", pesanmenu="";
        int totalharga = 0;
        
        nopesan = txtno.getText();
        namal = txtnama.getText();
        kodemeja = txtkodem.getText();
        pesanmenu = txtpesan.getText();
        
        totalharga = Integer.parseInt(txttotal.getText());
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "update order1 set "
                    + "namal='"+namal+"', "
                    + "kodemeja='"+kodemeja+"', "
                    + "pesanmenu='"+pesanmenu+"', "
                    + "hargatot='"+totalharga+"'"
                    + "where nopesan='"+nopesan+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Merubah data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Merubah data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_UpdateActionPerformed

    private void b_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DeleteActionPerformed
        // TODO add your handling code here:
        String nopesan="";
        nopesan = txtno.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "delete from order1 where nopesan='"+nopesan+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Menghapus data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_DeleteActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
        int toth;
        toth = (Integer.parseInt(txtharga.getText()) * Integer.parseInt(txtjumlah.getText()));
        txttotal.setText(String.valueOf(toth));
    }//GEN-LAST:event_txtjumlahActionPerformed

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
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Delete;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Simpan;
    private javax.swing.JButton b_Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pesanan;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkodem;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtpesan;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
