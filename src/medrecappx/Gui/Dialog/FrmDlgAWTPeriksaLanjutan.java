/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmDlgAWTPeriksaLanjutan.java
 *
 * Created on Jan 18, 2014, 12:30:58 PM
 */
package medrecappx.Gui.Dialog;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import medrecappx.Dao.RekamMedisDao;
import medrecappx.Entity.RekamMedis;
import medrecappx.Gui.Internal.FrmIntPoliklinik;
import medrecappx.Services.RekamMedisService;
import medrecappx.TabelModel.TabelModelRekmedByNoDaftar;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class FrmDlgAWTPeriksaLanjutan extends java.awt.Dialog {

    RekamMedisService rms = new RekamMedisService();
    TabelModelRekmedByNoDaftar tabelModelRekamMedisByNoDaftar = new TabelModelRekmedByNoDaftar();
    String noPendaftaran = FrmIntPoliklinik.noPendaftaranPoli;

    /** Creates new form FrmDlgAWTPeriksaLanjutan */
    public FrmDlgAWTPeriksaLanjutan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);

        tabelModelRekamMedisByNoDaftar.setData(rms.serviceGetRekamMedisByNoDaftar(noPendaftaran));

        if (tabelModelRekamMedisByNoDaftar.getRowCount() == 0) {
            txtAnamnesa.setText("");
            txtDiagnosis.setText("");
            txtTerapi.setText("");
        } else {

            /***************** Pemeriksaan Lanjutan *****************/
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 8) == null) {
                txtAnamnesa.setText("");
            } else {
                txtAnamnesa.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 8).toString());
            }
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 9) == null) {
                txtDiagnosis.setText("");
            } else {
                txtDiagnosis.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 9).toString());
            }
            if (tabelModelRekamMedisByNoDaftar.getValueAt(0, 10) == null) {
                txtTerapi.setText("");
            } else {
                txtTerapi.setText(tabelModelRekamMedisByNoDaftar.getValueAt(0, 10).toString());
            }
        }

        txtAnamnesa.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    txtAnamnesa.transferFocus();
                    e.consume();
                }
            }
        });

        txtDiagnosis.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    txtDiagnosis.transferFocus();
                    e.consume();
                }
            }
        });

        txtTerapi.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    txtTerapi.transferFocus();
                    e.consume();
                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnamnesa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnosis = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTerapi = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();

        setName("periksaLanjutan"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pemeriksaan Lanjutan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Anamnesa");

        jLabel3.setText("Terapi");

        jLabel4.setText(":");

        txtAnamnesa.setColumns(20);
        txtAnamnesa.setLineWrap(true);
        txtAnamnesa.setRows(5);
        txtAnamnesa.setName("txtAnamnesa"); // NOI18N
        jScrollPane1.setViewportView(txtAnamnesa);

        txtDiagnosis.setColumns(20);
        txtDiagnosis.setLineWrap(true);
        txtDiagnosis.setRows(5);
        txtDiagnosis.setName("txtDiagnosis"); // NOI18N
        jScrollPane2.setViewportView(txtDiagnosis);

        txtTerapi.setColumns(20);
        txtTerapi.setLineWrap(true);
        txtTerapi.setRows(5);
        txtTerapi.setName("txtTerapi"); // NOI18N
        jScrollPane3.setViewportView(txtTerapi);

        jLabel2.setText("Diagnosis");

        jLabel5.setText(":");

        jLabel6.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOK.setText("OK");
        btnOK.setName("tombolOK"); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String anamnesa = txtAnamnesa.getText();
        String diagnosis = txtDiagnosis.getText();
        String terapi = txtTerapi.getText();

        if ((anamnesa.equals("")) || (diagnosis.equals("")) || (terapi.equals(""))) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!", "Update Pemeriksaan Lanjutan Gagal!", JOptionPane.ERROR_MESSAGE);
        } else {

            RekamMedis rm = new RekamMedis();
            rm.setAnamnesa(anamnesa);
            rm.setDiagnosis(diagnosis);
            rm.setTerapi(terapi);
            rms.serviceUpdatePemeriksaanLanjutan(rm, noPendaftaran);
            if (RekamMedisDao.hasilUpdatePemeriksaanLanjutan.equals("ok")) {
                JOptionPane.showMessageDialog(null, "Data pemeriksaan lanjutan berhasil diubah!", "Update Pemeriksaan Lanjutan", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, RekamMedisDao.hasilUpdatePemeriksaanLanjutan, "Update Pemeriksaan Lanjutan Gagal!", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FrmDlgAWTPeriksaLanjutan dialog = new FrmDlgAWTPeriksaLanjutan(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnamnesa;
    private javax.swing.JTextArea txtDiagnosis;
    private javax.swing.JTextArea txtTerapi;
    // End of variables declaration//GEN-END:variables
}
