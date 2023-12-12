/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KUBUS;

import Persistance.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.DefaultComboBoxModel;
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
public class DataBuku extends javax.swing.JFrame {

    public DataBuku() {
        initComponents();
        tampilanBuku();
        initKodeBukuComboBox();
    }

    private void tampilanBuku() {
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
        Root<Buku> buku1 = cq.from(Buku.class);
        cq.select(buku1.get("kodebuku"));

        CriteriaQuery<Buku> select = cq.select(buku1);
        TypedQuery<Buku> q = em.createQuery(select);
        List<Buku> list = q.getResultList();

        for (Buku data : list) {
            Object[] baris = new Object[9];
            baris[0] = data.getKodebuku();
            baris[1] = data.getJudulbuku();
            baris[2] = data.getSubjudulbuku();
            baris[3] = data.getPengarang();
            baris[4] = data.getPenerbit();
            baris[5] = data.getTahunterbit();
            baris[6] = data.getHalaman();
            baris[7] = data.getIsbn();
            baris[8] = data.getKategori();

            model.addRow(baris);
        }

        jTableBuku.setModel(model);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jTextFieldKodeBuku = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSubjudul = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTahun = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldHalaman = new javax.swing.JTextField();
        jButtonBackMenu = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KUBUS (Kumpulan Buku & Skripsi)");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 520));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Kode Buku");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Data Buku");

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE", "JUDUL", "SUB JUDUL", "PENGARANG", "PENERBIT", "TAHUN", "HALAMAN", "ISBN", "KATEGORI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);
        if (jTableBuku.getColumnModel().getColumnCount() > 0) {
            jTableBuku.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableBuku.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTableBuku.getColumnModel().getColumn(5).setPreferredWidth(27);
            jTableBuku.getColumnModel().getColumn(6).setResizable(false);
            jTableBuku.getColumnModel().getColumn(6).setPreferredWidth(40);
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

        jTextFieldKodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodeBukuActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Sub Judul");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Pengarang");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Penerbit");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Tahun Terbit");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("ISBN");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Jumlah Halaman");

        jButtonBackMenu.setText("Kembali");
        jButtonBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMenuActionPerformed(evt);
            }
        });

        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Judul");

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basis Data", "Pemrograman Dasar", "Analisis dan Desain Sistem", "Keamanan Informasi", "Manajemen Proyek TI", "Sistem Operasi", "Pengembangan Aplikasi Web", "Integrasi Sistem", "Big Data dan Analitika", "Artificial Intelligence (AI)", "Machine Learning" }));
        jComboBoxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKategoriActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Kategori");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBackMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUbah)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCetak))
                    .addComponent(jTextFieldPenerbit)
                    .addComponent(jTextFieldPengarang)
                    .addComponent(jTextFieldSubjudul)
                    .addComponent(jTextFieldJudulBuku)
                    .addComponent(jTextFieldKodeBuku)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jTextFieldISBN)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSubjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonUbah)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButtonBackMenu)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        String kodeBuku = jTextFieldKodeBuku.getText().trim();
        String judul = jTextFieldJudulBuku.getText();
        String subjudul = jTextFieldSubjudul.getText();
        String pengarang = jTextFieldPengarang.getText();
        String penerbit = jTextFieldPenerbit.getText();
        int tahun = Integer.parseInt(jTextFieldTahun.getText());
        int halaman = Integer.parseInt(jTextFieldHalaman.getText());
        String isbn = jTextFieldISBN.getText();
        String kategori = jComboBoxKategori.getSelectedItem().toString();
        try {EntityManager entityManager = Persistence.createEntityManagerFactory
        ("KumpulanBukuSkripsiPU").createEntityManager();
            entityManager.getTransaction().begin();
            Buku b = new Buku();
            b.setKodebuku(kodeBuku);
            b.setJudulbuku(judul);
            b.setSubjudulbuku(subjudul);
            b.setPengarang(pengarang);
            b.setPenerbit(penerbit);
            b.setTahunterbit(tahun);
            b.setHalaman(halaman);
            b.setIsbn(isbn);
            b.setKategori(kategori);
            entityManager.persist(b);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data buku berhasil disimpan!");
            kosongkanBuku();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data buku gagal disimpan karena : " + String.valueOf(ex));
        }

        tampilanBuku();

    }//GEN-LAST:event_jButtonTambahActionPerformed

    
    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        String kodebuku = jTextFieldKodeBuku.getText().trim();
        EntityManager entityManager = Persistence.createEntityManagerFactory
        ("KumpulanBukuSkripsiPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, kodebuku);

        if (b != null) {
            entityManager.remove(b);
        }
        entityManager.flush();
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        tampilanBuku();
        
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
    String kodeBuku = jTextFieldKodeBuku.getText().trim();
    String judul = jTextFieldJudulBuku.getText();
    String subjudul = jTextFieldSubjudul.getText();
    String pengarang = jTextFieldPengarang.getText();
    String penerbit = jTextFieldPenerbit.getText();
    int tahun = Integer.parseInt(jTextFieldTahun.getText());
    int halaman = Integer.parseInt(jTextFieldHalaman.getText());
    String isbn = jTextFieldISBN.getText();
    String kategori = (String) jComboBoxKategori.getSelectedItem();        
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    try {Buku b = em.find(Buku.class, kodeBuku); 
        if (b != null) {
            b.setKodebuku(kodeBuku);
            b.setJudulbuku(judul);
            b.setSubjudulbuku(subjudul);
            b.setPengarang(pengarang);
            b.setPenerbit(penerbit);
            b.setTahunterbit(tahun);
            b.setHalaman(halaman);
            b.setIsbn(isbn);
            b.setKategori(kategori);
            em.merge(b);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
            tampilanBuku();
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan kode buku: " + kodeBuku + " tidak ditemukan.");}
    } catch (Exception e) {
        em.getTransaction().rollback(); // Rollback jika terjadi kesalahan
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah data." + String.valueOf(e));
    } finally {
        kosongkanBuku();
    }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMenuActionPerformed
        // TODO add your handling code here:
        Dashboard MenuFrame = new Dashboard();
        MenuFrame.setVisible(true);
        MenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonBackMenuActionPerformed

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        String reportPath = "src/Report/reportBuku.jrxml";
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
        Root<Buku> buku1 = cq.from(Buku.class);
        cq.select(buku1);

        Query query = em.createQuery("SELECT b FROM Buku b");
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

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        // TODO add your handling code here:
        int row = jTableBuku.getSelectedRow();
        if (row >= 0) {
            String kodebuku = jTableBuku.getValueAt(row, 0).toString();
            String judulbuku = jTableBuku.getValueAt(row, 1).toString();
            String subjudul = jTableBuku.getValueAt(row, 2).toString();
            String pengarang = jTableBuku.getValueAt(row, 3).toString();
            String penerbit = jTableBuku.getValueAt(row, 4).toString();
            String tahun = jTableBuku.getValueAt(row, 5).toString();
            String halaman = jTableBuku.getValueAt(row, 6).toString();
            String isbn = jTableBuku.getValueAt(row, 7).toString();
            Object kategori = (Object) jTableBuku.getValueAt(row, 8);

            jTextFieldKodeBuku.setText(kodebuku);
            jTextFieldJudulBuku.setText(judulbuku);
            jTextFieldSubjudul.setText(subjudul);
            jTextFieldPengarang.setText(pengarang);
            jTextFieldPenerbit.setText(penerbit);
            jTextFieldISBN.setText(isbn);
            jTextFieldTahun.setText(tahun);
            jTextFieldHalaman.setText(halaman);
            jComboBoxKategori.setSelectedItem(kategori);
        }
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jTextFieldKodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBukuActionPerformed

    private void jComboBoxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKategoriActionPerformed

    /**
     * @param args the command line arguments
     */
    

    public void kosongkanBuku(){
            jTextFieldKodeBuku.setText("");
            jTextFieldSubjudul.setText("");
            jTextFieldJudulBuku.setText("");
            jTextFieldPengarang.setText("");
            jTextFieldPenerbit.setText("");
            jTextFieldISBN.setText("");
            jTextFieldTahun.setText("");
            jTextFieldHalaman.setText("");}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackMenu;
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextFieldHalaman;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldKodeBuku;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldSubjudul;
    private javax.swing.JTextField jTextFieldTahun;
    // End of variables declaration//GEN-END:variables

private void initKodeBukuComboBox() {
        // Daftar opsi untuk JComboBox
        String[] options = {
            "Basis Data",
            "Pemrograman Dasar",
            "Analisis Desain Sistem",
            "Keamanan Informasi",
            "Manajemen Proyek TI",
            "Sistem Operasi",
            "Pengembangan Aplikasi",
            "Integrasi Sistem",
            "Big Data dan Analitika",
            "Artificial Intelligence",
            "Machine Learning"
        };

        // Buat model ComboBox dengan opsi-opsi di atas
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(options);

        // Set model ComboBox pada JComboBox
        jComboBoxKategori.setModel(model);
    }
}
