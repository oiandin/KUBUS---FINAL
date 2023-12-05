/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KUBUS;

import Persistance.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lmao
 */
public class DataSkripsi extends javax.swing.JFrame{

    /**
     * Creates new form Menu
     */
    public DataSkripsi() {
        initComponents();
        tampilanSkripsi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jTextFieldKodeSkripsi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTahun = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldHalaman = new javax.swing.JTextField();
        jButtonBackMenu1 = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jTextFieldJudul = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KUBUS (Kumpulan Buku & Skripsi)");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 520));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Kode Skripsi");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Data Skripsi");

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE SKRIPSI", "JUDUL", "PENGARANG", "TAHUN", "HALAMAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSkripsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSkripsi);
        if (jTableSkripsi.getColumnModel().getColumnCount() > 0) {
            jTableSkripsi.getColumnModel().getColumn(0).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableSkripsi.getColumnModel().getColumn(1).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(2).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(3).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableSkripsi.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonTambah.setText("TAMBAH");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonUbah.setText("UBAH");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Pengarang");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Tahun");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Jumlah Halaman");

        jButtonBackMenu1.setText("Kembali");
        jButtonBackMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMenu1ActionPerformed(evt);
            }
        });

        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jTextFieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Judul");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUbah)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCetak))
                    .addComponent(jTextFieldPengarang)
                    .addComponent(jTextFieldJudul)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jTextFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jTextFieldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKodeSkripsi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonBackMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKodeSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonUbah)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBackMenu1)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        String kodeskripsi = jTextFieldKodeSkripsi.getText().trim();
        String judul = jTextFieldJudul.getText();
        String pengarang = jTextFieldPengarang.getText();
        int tahun = Integer.parseInt(jTextFieldTahun.getText());
        int halaman = Integer.parseInt(jTextFieldHalaman.getText());

        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory
            ("KumpulanBukuSkripsiPU").createEntityManager();
            entityManager.getTransaction().begin();

            Skripsi s = new Skripsi();

            s.setKodeskripsi(kodeskripsi);
                s.setJudulskripsi(judul);
                s.setPenulis(pengarang);
                s.setTahun(tahun);
                s.setHalaman(halaman);

            entityManager.persist(s);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data buku berhasil disimpan!");
            kosongkanSkripsi();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data buku gagal disimpan karena : " + String.valueOf(ex));
        }

        tampilanSkripsi();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        String kodeskripsi = jTextFieldKodeSkripsi.getText().trim();
        EntityManager entityManager = Persistence.createEntityManagerFactory
        ("KumpulanBukuSkripsiPU").createEntityManager();
        entityManager.getTransaction().begin();
        Skripsi s = entityManager.find(Skripsi.class, kodeskripsi);

        if (s != null) {
            entityManager.remove(s);
        }
        entityManager.flush();
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        tampilanSkripsi();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        String kodeskripsi = jTextFieldKodeSkripsi.getText().trim();
        String judul = jTextFieldJudul.getText();
        String pengarang = jTextFieldPengarang.getText();
        int tahun = Integer.parseInt(jTextFieldTahun.getText());
        int halaman = Integer.parseInt(jTextFieldHalaman.getText());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            Skripsi s = em.find(Skripsi.class, kodeskripsi); 
            if (s != null) {

                s.setKodeskripsi(kodeskripsi);
                s.setJudulskripsi(judul);
                s.setPenulis(pengarang);
                s.setTahun(tahun);
                s.setHalaman(halaman);

                em.merge(s);
                em.getTransaction().commit(); // Commit transaksi
                JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
                tampilanSkripsi();
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan kode skripsi: " + kodeskripsi + " tidak ditemukan.");
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); // Rollback jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah data." + String.valueOf(e));
        } finally {
            kosongkanSkripsi();
        }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonBackMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMenu1ActionPerformed
        // TODO add your handling code here:
        Dashboard MenuFrame1 = new Dashboard();
        MenuFrame1.setVisible(true);
        MenuFrame1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonBackMenu1ActionPerformed

    private void jTableSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSkripsiMouseClicked
        // TODO add your handling code here
        
        int row = jTableSkripsi.getSelectedRow();
        if (row >= 0) {
            String kodeSkripsi = jTableSkripsi.getValueAt(row, 0).toString();
            String judulSkripsi = jTableSkripsi.getValueAt(row, 1).toString();
            String pengarang = jTableSkripsi.getValueAt(row, 2).toString();
            String tahun = jTableSkripsi.getValueAt(row, 3).toString();
            String halaman = jTableSkripsi.getValueAt(row, 4).toString();
            
            jTextFieldKodeSkripsi.setText(kodeSkripsi);
            jTextFieldJudul.setText(judulSkripsi);
            jTextFieldPengarang.setText(pengarang);
            jTextFieldTahun.setText(tahun);
            jTextFieldHalaman.setText(halaman);
        }
    }//GEN-LAST:event_jTableSkripsiMouseClicked

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        String reportPath = "src/Report/reportSkripsi.jrxml";
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
        Root<Skripsi> skrip = cq.from(Skripsi.class);
        cq.select(skrip);

        Query query = em.createQuery("SELECT s FROM Skripsi s");
        List<Buku> results = query.getResultList();
        
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

        try {
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, dataSource);
            JasperViewer vw = new JasperViewer(jp, false);
            vw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(DataBuku.class.getName()).log(Level.SEVERE, null, ex);            
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jTextFieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulActionPerformed

    private void tampilanSkripsi() {
        
            DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
            model.setRowCount(0);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
            Root<Skripsi> stud = cq.from(Skripsi.class);
            cq.select(stud.get("kodeskripsi"));

            CriteriaQuery<Skripsi> select = cq.select(stud);
            TypedQuery<Skripsi> q = em.createQuery(select);
            List<Skripsi> list = q.getResultList();

            for (Skripsi data : list) {
                Object[] baris = new Object[5];
                baris[0] = data.getKodeskripsi();
                baris[1] = data.getJudulskripsi();
                baris[2] = data.getPenulis();
                baris[3] = data.getTahun();
                baris[4] = data.getHalaman();

                model.addRow(baris);
            }

            jTableSkripsi.setModel(model);

            em.getTransaction().commit();
            em.close();
            emf.close();
    }
    
    public void kosongkanSkripsi(){
            jTextFieldKodeSkripsi.setText("");
            jTextFieldJudul.setText("");
            jTextFieldPengarang.setText("");
            jTextFieldTahun.setText("");
            jTextFieldHalaman.setText("");}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackMenu1;
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTextField jTextFieldHalaman;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTextField jTextFieldKodeSkripsi;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldTahun;
    // End of variables declaration//GEN-END:variables
}
