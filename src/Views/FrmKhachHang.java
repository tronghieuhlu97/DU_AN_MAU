/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DomainModel.DongSP;
import DomainModel.KhachHang;
import Service.IManageKhachHangService;
import Service.ManageKhachHangService;
import ViewModels.QLKhachHang;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Trong Hieu
 */
public class FrmKhachHang extends javax.swing.JFrame {

    DefaultTableModel dtm;
    List<QLKhachHang> lstQLKH;
    int row;
    IManageKhachHangService _iManageKhachHangService;

    /**
     * Creates new form FrmKhachHang
     */
    public FrmKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        _iManageKhachHangService = new ManageKhachHangService();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenDem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnADD = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        btnEDIT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnDELETE = new javax.swing.JButton();
        txtMK = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        txtQG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("MA");

        jLabel12.setText("QUỐC GIA");

        jLabel3.setText("TÊN");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ", "TÊN", "TÊN ĐỆM", "HỌ", "NGÀY SINH", "SDT", "ĐỊA CHỈ", "THÀNH PHỐ", "QUỐC GIA", "MẬT KHẨU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKH);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel4.setText("TÊN ĐỆM");

        jLabel5.setText("HỌ");

        jLabel7.setText("NGÀY SINH");

        jLabel8.setText("ĐỊA CHỈ");

        jLabel9.setText("SDT");

        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnEDIT.setText("EDIT");
        btnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITActionPerformed(evt);
            }
        });

        jLabel10.setText("MẬT KHẨU");

        btnDELETE.setText("DELETE");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        jLabel11.setText("THÀNH PHỐ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1076, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTP)
                    .addComponent(txtQG, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(427, 427, 427))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1649, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(btnADD)
                                            .addGap(83, 83, 83)
                                            .addComponent(btnEDIT))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMa)
                                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                                    .addGap(79, 79, 79)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDELETE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTenDem)
                                                .addComponent(txtHo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                                    .addGap(79, 79, 79)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNS)
                                        .addComponent(txtDC)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(555, 555, 555)
                                    .addComponent(jLabel14)))
                            .addGap(417, 417, 417)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtQG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnADD)
                        .addComponent(btnEDIT)
                        .addComponent(btnDELETE))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void tblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMouseClicked
        row = tblKH.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMa.setText(tblKH.getValueAt(row, 1).toString());
        txtTen.setText(tblKH.getValueAt(row, 2).toString());
        txtTenDem.setText(tblKH.getValueAt(row, 3).toString());
        txtHo.setText(tblKH.getValueAt(row, 4).toString());
        txtNS.setText(tblKH.getValueAt(row, 5).toString());
        txtSDT.setText(tblKH.getValueAt(row, 6).toString());
        txtDC.setText(tblKH.getValueAt(row, 7).toString());
        txtTP.setText(tblKH.getValueAt(row, 8).toString());
        txtQG.setText(tblKH.getValueAt(row, 9).toString());
        txtMK.setText(tblKH.getValueAt(row, 10).toString());
    }//GEN-LAST:event_tblKHMouseClicked

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm ko?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            for (int i = 0; i < lstQLKH.size(); i++) {
                if (txtMa.getText().equalsIgnoreCase(lstQLKH.get(i).getMa())) {
                    JOptionPane.showMessageDialog(this, "Mã sản phẩm bị trùng");
                    return;
                }
            }

            try {
                JOptionPane.showMessageDialog(this, _iManageKhachHangService.add(getData()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Vui long chon lai");
            }
            loadDataToTable();
        }
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa?", "Sửa", JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            for (int i = 0; i < lstQLKH.size(); i++) {
                if (row != i && lstQLKH.get(i).getMa().equalsIgnoreCase(txtMa.getText())) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
                    return;
                }
            }
            try {
                JOptionPane.showMessageDialog(this, _iManageKhachHangService.update(getID(), getData()));
                loadDataToTable();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Vui long chon lai");
            }
        }
    }//GEN-LAST:event_btnEDITActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, _iManageKhachHangService.delete(getID()));
            loadDataToTable();
        }
    }//GEN-LAST:event_btnDELETEActionPerformed

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
            java.util.logging.Logger.getLogger(FrmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKH;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNS;
    private javax.swing.JTextField txtQG;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDem;
    // End of variables declaration//GEN-END:variables

    private void loadDataToTable() {
        lstQLKH = _iManageKhachHangService.getAll();
        dtm = (DefaultTableModel) tblKH.getModel();
        dtm.setRowCount(0);
        for (QLKhachHang x : lstQLKH) {
            dtm.addRow(new Object[]{lstQLKH.indexOf(x) + 1, x.getMa(), x.getTen(), x.getTendem(), x.getHo(), x.getNgaysinh(), x.getSdt(), x.getDiachi(), x.getThanhpho(), x.getQuocgia(), x.getMatkhau()});
        }
    }

//    private KhachHang getKHFromInput() throws ParseException {
//        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 = date.parse(txtNS.getText());
//        return new KhachHang(txtID.getText(), txtMa.getText(), txtTen.getText(), txtTenDem.getText(), txtHo.getText(), date1, txtSDT.getText(), txtDC.getText(), txtTP.getText(), txtQG.getText(), txtMK.getText());
//    }
    private QLKhachHang getData() throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = date.parse(txtNS.getText());
        return new QLKhachHang(txtMa.getText(), txtTen.getText(), txtTenDem.getText(), txtHo.getText(), d, txtSDT.getText(), txtDC.getText(), txtTP.getText(), txtQG.getText(), txtMK.getText());

    }

    private String getID() {
        int index = tblKH.getSelectedRow();
        return lstQLKH.get(index).getId();
    }
}
