/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmIntPasienBaru.java
 *
 * Created on Dec 19, 2013, 4:59:09 PM
 */
package medrecappx.Gui.Internal;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import medrecappx.Dao.PasienDao;
import medrecappx.Entity.Pasien;
import medrecappx.Services.PasienService;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class FrmIntPasienBaru extends javax.swing.JInternalFrame {

    PasienService ps = new PasienService();
    //TabelModelPasien tabelModelPasien = new TabelModelPasien();
    Connection connection;
    public static String ID, nama, jk, tglLahir, agama, alamat;

    /** Creates new form FrmIntPasienBaru */
    public FrmIntPasienBaru() {
        initComponents();

        txtAlamat.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    txtAlamat.transferFocus();
                    e.consume();
                }
            }
        });
    }

    public void clear() {
        txtNmPasien.setText("");
        txtTglLahir.setText("");
        pilihAgama.setSelectedItem("Islam");
        txtAlamat.setText("");
        //tabelModelPasien.setData(ps.serviceGetAllPasien());
        txtNmPasien.requestFocus();


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pilihAgama = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTglLahir = new javax.swing.JTextField();
        txtNmPasien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        radioLaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasien"));

        pilihAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Katholik", "Protestan", "Hindu", "Budha" }));
        pilihAgama.setName("pilihAgama"); // NOI18N

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 11));
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        txtAlamat.setName("txtAlamat"); // NOI18N
        jScrollPane1.setViewportView(txtAlamat);

        jLabel9.setText(":");

        jLabel6.setText("Alamat");

        jLabel5.setText("Agama");

        jLabel7.setText(":");

        jLabel10.setText(":");

        jLabel11.setText(":");

        jLabel2.setText("Nama Pasien");

        jLabel3.setText("Jenkel");

        jLabel4.setText("Tanggal Lahir");

        txtTglLahir.setName("txtTglLahir"); // NOI18N

        txtNmPasien.setName("txtNmPasien"); // NOI18N

        jLabel12.setText(":");

        grupRadio.add(radioLaki);
        radioLaki.setSelected(true);
        radioLaki.setText("Laki-laki");
        radioLaki.setName("radioLaki"); // NOI18N

        grupRadio.add(radioPerempuan);
        radioPerempuan.setText("Perempuan");
        radioPerempuan.setName("radioPerempuan"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilihAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioLaki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPerempuan)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtNmPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(radioLaki)
                    .addComponent(radioPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(pilihAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnInsert.setText("SIMPAN");
        btnInsert.setName("btnInsert"); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        nama = txtNmPasien.getText();
        tglLahir = txtTglLahir.getText();
        alamat = txtAlamat.getText();

        if ((nama.equals("")) || (tglLahir.equals("")) || (alamat.equals(""))) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!", "Insert Pasien Gagal!", JOptionPane.ERROR_MESSAGE);
            ID = "";
            nama = "";
            jk = "";
            tglLahir = "";
            agama = "";
            alamat = "";
        } else {

            Pasien p = new Pasien();

            ID = ps.serviceGetMaxNoRm();
            agama = pilihAgama.getSelectedItem().toString();
            if (radioLaki.isSelected()) {
                p.setJkPas("L");
                jk = "Laki-laki";
            } else {
                p.setJkPas("P");
                jk = "Perempuan";
            }

            FrmIntPasienLama fip = new FrmIntPasienLama();
            p.setNoRm(ID);
            p.setNmPas(nama);
            p.setTglLahir(tglLahir);
            p.setAgama(agama);
            p.setAlamatPas(alamat);
            ps.serviceInsertPasien(p);

            if (PasienDao.hasilInsert.equals("ok")) {
                JOptionPane.showMessageDialog(null, "Data pasien berhasil ditambah!", "Insert Pasien", JOptionPane.INFORMATION_MESSAGE);
                Dimension parentSize = this.getParent().getSize();
                Dimension childSize = fip.getSize();
                fip.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
                this.getParent().add(fip);
                this.dispose();
                fip.show();
                fip.toFront();
            } else {
                JOptionPane.showMessageDialog(null, PasienDao.hasilInsert, "Insert Pasien Gagal!", JOptionPane.ERROR_MESSAGE);
                ID = "";
                jk = "";
            }
        }

    }//GEN-LAST:event_btnInsertActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.ButtonGroup grupRadio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox pilihAgama;
    private javax.swing.JRadioButton radioLaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNmPasien;
    private javax.swing.JTextField txtTglLahir;
    // End of variables declaration//GEN-END:variables
}
