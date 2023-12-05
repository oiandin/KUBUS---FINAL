package KUBUS;

import Persistance.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Dashboard extends javax.swing.JFrame {

    private final Timer refreshTimer;

    public Dashboard() {

        initComponents();
        tampilanBuku();
        tampilanSkripsi();
        tampilanPinjamBuku();
        tampilanPinjamSkripsi();
        initKodeBukuComboBox();
        initKodeSkripsiComboBox();
        totalbukubanyak();
        judulbukubanyak();
        judulskripsibanyak();
        judulkategoribanyak();
        totalskripsibanyak();
        totalbukukategori();

        refreshTimer = new Timer(5000, (ActionEvent e) -> {
        });
        refreshTimer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Jpanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_bukuterbanyak = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtoncetakbukubanyak = new javax.swing.JButton();
        jLabeljudulbuku = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_skripsiterbanyak = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButtonCetakSkripsiBanyak = new javax.swing.JButton();
        jLabeljudulskripsi = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_kategoriterbanyak = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButtonCetakKategoriBanyak = new javax.swing.JButton();
        jLabeljudulkategori = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        transaksi = new javax.swing.JTabbedPane();
        PeminjamanBuku = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTablePinjamBuku = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldKodepinjambuku = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldnamab = new javax.swing.JTextField();
        jTextFieldangkatanb = new javax.swing.JTextField();
        jTextFieldnimb = new javax.swing.JTextField();
        jDateChoosertpb = new com.toedter.calendar.JDateChooser();
        jComboBoxPinjamBuku = new javax.swing.JComboBox<>();
        jTextFieldCaripinjambuku = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jDateChoosertkb = new com.toedter.calendar.JDateChooser();
        jButtonTambahPinjamBuku = new javax.swing.JButton();
        jButtonUbahPinjamBuku = new javax.swing.JButton();
        jButtonHapusPinjamBuku = new javax.swing.JButton();
        jComboBoxspb = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jComboBoxKodebuku = new javax.swing.JComboBox<>();
        jPanelcetaklb = new javax.swing.JPanel();
        jButtonCetakPinjamBuku = new javax.swing.JButton();
        jDateChooserTAKPB = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooserTAWPB = new com.toedter.calendar.JDateChooser();
        PeminjamanSkripsi = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTablePeminjamanSkripsi = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldKodepinjamskripsi = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldnamas = new javax.swing.JTextField();
        jTextFieldangkatans = new javax.swing.JTextField();
        jTextFieldnims = new javax.swing.JTextField();
        jDateChoosertps = new com.toedter.calendar.JDateChooser();
        jComboBoxPinjamSkripsi = new javax.swing.JComboBox<>();
        jTextFieldPencarianSkripsi = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jDateChoosertks = new com.toedter.calendar.JDateChooser();
        jButtonPinjamSkripsi = new javax.swing.JButton();
        jButtonUbahPinjamSkripsi = new javax.swing.JButton();
        jButtonHapusPinjamSkripsi = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jComboBoxsps = new javax.swing.JComboBox<>();
        jComboBoxKodeskripsi = new javax.swing.JComboBox<>();
        jPanelcetakls = new javax.swing.JPanel();
        jButtonCetakPinjamSkripsi = new javax.swing.JButton();
        jDateChooserTAKPS = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserTAWPS = new com.toedter.calendar.JDateChooser();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        javax.swing.JPanel BukuMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditDataBuku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jTextFieldCariBuku = new javax.swing.JTextField();
        jButtonCariBuku = new javax.swing.JButton();
        FilterBuku = new javax.swing.JComboBox<>();
        jButtonCetakSearchBuku = new javax.swing.JButton();
        SkripsiMenu1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonEditDataSkripsi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        FilterSkripsi = new javax.swing.JComboBox<>();
        jTextFieldCariSkripsi = new javax.swing.JTextField();
        jButtonCariSkripsi = new javax.swing.JButton();
        jButtonCariCetakSkripsi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        jDialog1.setTitle("CETAK RENTANG TANGGAL");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Tanggal awal");

        jLabel16.setText("Tanggal akhir");

        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KUBUS");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jTabbedPane1.setOpaque(true);

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 153, 153)));

        lbl_bukuterbanyak.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_bukuterbanyak.setForeground(new java.awt.Color(0, 102, 102));
        lbl_bukuterbanyak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_bukuterbanyak.setText("244");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Buku");

        jButtoncetakbukubanyak.setText("CETAK");
        jButtoncetakbukubanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncetakbukubanyakActionPerformed(evt);
            }
        });

        jLabeljudulbuku.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabeljudulbuku.setForeground(new java.awt.Color(0, 102, 102));
        jLabeljudulbuku.setText("Buku");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtoncetakbukubanyak, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_bukuterbanyak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeljudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabeljudulbuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lbl_bukuterbanyak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtoncetakbukubanyak)
                .addGap(16, 16, 16))
        );

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Peminjaman Terbanyak");

        jPanel7.setBackground(new java.awt.Color(248, 248, 248));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 153, 153)));

        lbl_skripsiterbanyak.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_skripsiterbanyak.setForeground(new java.awt.Color(0, 102, 102));
        lbl_skripsiterbanyak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_skripsiterbanyak.setText("244");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Skripsi");

        jButtonCetakSkripsiBanyak.setText("CETAK");
        jButtonCetakSkripsiBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakSkripsiBanyakActionPerformed(evt);
            }
        });

        jLabeljudulskripsi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabeljudulskripsi.setForeground(new java.awt.Color(0, 102, 102));
        jLabeljudulskripsi.setText("Skripsi");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeljudulskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_skripsiterbanyak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCetakSkripsiBanyak, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabeljudulskripsi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_skripsiterbanyak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCetakSkripsiBanyak)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(248, 248, 248));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 153, 153)));

        lbl_kategoriterbanyak.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_kategoriterbanyak.setForeground(new java.awt.Color(0, 102, 102));
        lbl_kategoriterbanyak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_kategoriterbanyak.setText("244");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Kategori");

        jButtonCetakKategoriBanyak.setText("CETAK");
        jButtonCetakKategoriBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakKategoriBanyakActionPerformed(evt);
            }
        });

        jLabeljudulkategori.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabeljudulkategori.setForeground(new java.awt.Color(0, 102, 102));
        jLabeljudulkategori.setText("Kategori");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeljudulkategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 215, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_kategoriterbanyak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCetakKategoriBanyak, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabeljudulkategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_kategoriterbanyak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCetakKategoriBanyak)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Frame 3(2).png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\ion_home.png"), Home); // NOI18N

        transaksi.setBackground(new java.awt.Color(255, 255, 255));
        transaksi.setForeground(new java.awt.Color(0, 153, 153));
        transaksi.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        transaksi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        PeminjamanBuku.setBackground(new java.awt.Color(255, 255, 255));

        jTablePinjamBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PINJAM", "KODE BUKU", "NAMA", "NIM", "ANGKATAN", "TANGGAL PINJAM", "TANGGAL KEMBALI", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePinjamBukuMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTablePinjamBuku);

        jLabel25.setText("Kode Peminjaman");

        jTextFieldKodepinjambuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodepinjambukuActionPerformed(evt);
            }
        });

        jLabel26.setText("Kode Buku");

        jLabel27.setText("Tanggal Pinjam");

        jLabel28.setText("Tanggal Kembali");

        jLabel29.setText("Nama Lengkap");

        jTextFieldnamab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnamabActionPerformed(evt);
            }
        });

        jTextFieldangkatanb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldangkatanbActionPerformed(evt);
            }
        });

        jTextFieldnimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnimbActionPerformed(evt);
            }
        });

        jComboBoxPinjamBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Peminjaman", "Nama Lengkap", "NIM", "Angkatan", "Status" }));
        jComboBoxPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPinjamBukuActionPerformed(evt);
            }
        });

        jTextFieldCaripinjambuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaripinjambukuActionPerformed(evt);
            }
        });
        jTextFieldCaripinjambuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCaripinjambukuKeyReleased(evt);
            }
        });

        jButton14.setText("CARI");

        jLabel31.setText("NIM");

        jLabel32.setText("Tahun Angkatan");

        jButtonTambahPinjamBuku.setText("TAMBAH");
        jButtonTambahPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahPinjamBukuActionPerformed(evt);
            }
        });

        jButtonUbahPinjamBuku.setText("UBAH");
        jButtonUbahPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahPinjamBukuActionPerformed(evt);
            }
        });

        jButtonHapusPinjamBuku.setText("HAPUS");
        jButtonHapusPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusPinjamBukuActionPerformed(evt);
            }
        });

        jComboBoxspb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dipinjam", "Kembali" }));

        jLabel41.setText("Status Peminjaman");

        jPanelcetaklb.setBackground(new java.awt.Color(255, 255, 255));
        jPanelcetaklb.setBorder(javax.swing.BorderFactory.createTitledBorder("Cetak Laporan"));

        jButtonCetakPinjamBuku.setText("CETAK");
        jButtonCetakPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakPinjamBukuActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal Akhir");

        jLabel2.setText("Tanggal Awal");

        javax.swing.GroupLayout jPanelcetaklbLayout = new javax.swing.GroupLayout(jPanelcetaklb);
        jPanelcetaklb.setLayout(jPanelcetaklbLayout);
        jPanelcetaklbLayout.setHorizontalGroup(
            jPanelcetaklbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcetaklbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcetaklbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooserTAWPB, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jDateChooserTAKPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcetaklbLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCetakPinjamBuku)))
                .addContainerGap())
        );
        jPanelcetaklbLayout.setVerticalGroup(
            jPanelcetaklbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcetaklbLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTAWPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTAKPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCetakPinjamBuku)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout PeminjamanBukuLayout = new javax.swing.GroupLayout(PeminjamanBuku);
        PeminjamanBuku.setLayout(PeminjamanBukuLayout);
        PeminjamanBukuLayout.setHorizontalGroup(
            PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                        .addComponent(jButtonTambahPinjamBuku)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUbahPinjamBuku)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHapusPinjamBuku))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanBukuLayout.createSequentialGroup()
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25)
                                .addComponent(jTextFieldKodepinjambuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26)
                                .addComponent(jComboBoxKodebuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChoosertpb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28)
                                    .addComponent(jDateChoosertkb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel29)
                                .addComponent(jTextFieldnamab, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanBukuLayout.createSequentialGroup()
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldnimb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel31))
                                    .addGap(18, 18, 18)
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jTextFieldangkatanb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jComboBoxspb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jPanelcetaklb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PeminjamanBukuLayout.createSequentialGroup()
                            .addComponent(jComboBoxPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCaripinjambuku)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton14))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        PeminjamanBukuLayout.setVerticalGroup(
            PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCaripinjambuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelcetaklb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(28, 28, 28))
                                .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldKodepinjambuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel32))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldnimb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldangkatanb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxKodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldnamab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(28, 28, 28))
                                .addComponent(jDateChoosertkb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChoosertpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxspb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambahPinjamBuku)
                    .addComponent(jButtonUbahPinjamBuku)
                    .addComponent(jButtonHapusPinjamBuku))
                .addGap(33, 33, 33))
        );

        jPanelcetaklb.getAccessibleContext().setAccessibleName("Cetak Laporan Buku");

        transaksi.addTab("Peminjaman Buku", PeminjamanBuku);

        PeminjamanSkripsi.setBackground(new java.awt.Color(255, 255, 255));

        jTablePeminjamanSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PINJAM", "KODE SKRIPSI", "NAMA", "NIM", "ANGKATAN", "TANGGAL PINJAM", "TANGGAL KEMBALI", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePeminjamanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePeminjamanSkripsiMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTablePeminjamanSkripsi);

        jLabel33.setText("Kode Peminjaman");

        jTextFieldKodepinjamskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodepinjamskripsiActionPerformed(evt);
            }
        });

        jLabel34.setText("Kode Skripsi");

        jLabel35.setText("Tanggal Pinjam");

        jLabel36.setText("Tanggal Kembali");

        jLabel37.setText("Nama Lengkap");

        jTextFieldnamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnamasActionPerformed(evt);
            }
        });

        jTextFieldangkatans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldangkatansActionPerformed(evt);
            }
        });

        jComboBoxPinjamSkripsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Peminjaman", "Nama Lengkap", "NIM", "Angkatan", "Status" }));
        jComboBoxPinjamSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPinjamSkripsiActionPerformed(evt);
            }
        });

        jTextFieldPencarianSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPencarianSkripsiActionPerformed(evt);
            }
        });
        jTextFieldPencarianSkripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPencarianSkripsiKeyReleased(evt);
            }
        });

        jButton15.setText("CARI");

        jLabel39.setText("NIM");

        jLabel40.setText("Tahun Angkatan");

        jButtonPinjamSkripsi.setText("TAMBAH");
        jButtonPinjamSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinjamSkripsiActionPerformed(evt);
            }
        });

        jButtonUbahPinjamSkripsi.setText("UBAH");
        jButtonUbahPinjamSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahPinjamSkripsiActionPerformed(evt);
            }
        });

        jButtonHapusPinjamSkripsi.setText("HAPUS");
        jButtonHapusPinjamSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusPinjamSkripsiActionPerformed(evt);
            }
        });

        jLabel42.setText("Status Peminjaman");

        jComboBoxsps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dipinjam", "Kembali" }));

        jComboBoxKodeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKodeskripsiActionPerformed(evt);
            }
        });

        jPanelcetakls.setBackground(new java.awt.Color(255, 255, 255));
        jPanelcetakls.setBorder(javax.swing.BorderFactory.createTitledBorder("Cetak Laporan"));

        jButtonCetakPinjamSkripsi.setText("CETAK");
        jButtonCetakPinjamSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakPinjamSkripsiActionPerformed(evt);
            }
        });

        jLabel10.setText("Tanggal Akhir");

        jLabel11.setText("Tanggal Awal");

        javax.swing.GroupLayout jPanelcetaklsLayout = new javax.swing.GroupLayout(jPanelcetakls);
        jPanelcetakls.setLayout(jPanelcetaklsLayout);
        jPanelcetaklsLayout.setHorizontalGroup(
            jPanelcetaklsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcetaklsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcetaklsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jDateChooserTAWPS, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jDateChooserTAKPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcetaklsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCetakPinjamSkripsi)))
                .addContainerGap())
        );
        jPanelcetaklsLayout.setVerticalGroup(
            jPanelcetaklsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcetaklsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTAWPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTAKPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCetakPinjamSkripsi)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout PeminjamanSkripsiLayout = new javax.swing.GroupLayout(PeminjamanSkripsi);
        PeminjamanSkripsi.setLayout(PeminjamanSkripsiLayout);
        PeminjamanSkripsiLayout.setHorizontalGroup(
            PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                            .addComponent(jButtonPinjamSkripsi)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonUbahPinjamSkripsi)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonHapusPinjamSkripsi))
                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                            .addComponent(jComboBoxPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPencarianSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton15)))
                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel33)
                                .addComponent(jTextFieldKodepinjamskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addComponent(jComboBoxKodeskripsi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChoosertps, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jDateChoosertks, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel37)
                                .addComponent(jTextFieldnamas, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanSkripsiLayout.createSequentialGroup()
                                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                            .addComponent(jTextFieldnims)
                                            .addGap(18, 18, 18))
                                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                            .addComponent(jLabel39)
                                            .addGap(159, 159, 159)))
                                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40)
                                        .addComponent(jTextFieldangkatans, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jComboBoxsps, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jPanelcetakls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        PeminjamanSkripsiLayout.setVerticalGroup(
            PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPencarianSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(28, 28, 28))
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldKodepinjamskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldnamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldnims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldangkatans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxKodeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(28, 28, 28))
                                .addComponent(jDateChoosertks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChoosertps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxsps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanelcetakls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPinjamSkripsi)
                    .addComponent(jButtonUbahPinjamSkripsi)
                    .addComponent(jButtonHapusPinjamSkripsi))
                .addGap(63, 63, 63))
        );

        transaksi.addTab("Peminjaman Skripsi", PeminjamanSkripsi);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/aset/grommet-icons_transaction.png")), transaksi); // NOI18N
        transaksi.getAccessibleContext().setAccessibleName("transaksi");

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BukuMenu.setBackground(new java.awt.Color(255, 255, 255));
        BukuMenu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                BukuMenuInputMethodTextChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Buku");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Berikut data buku Program Studi Sistem Informasi UINSA");

        jButtonEditDataBuku.setText("Edit Data Buku");
        jButtonEditDataBuku.setDoubleBuffered(true);
        jButtonEditDataBuku.setPreferredSize(new java.awt.Dimension(114, 23));
        jButtonEditDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataBukuActionPerformed(evt);
            }
        });

        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentAdded(evt);
            }
        });
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });
        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentShown(evt);
            }
        });

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "JUDUL", "SUB JUDUL", "PENGARANG", "PENERBIT", "TAHUN", "HALAMAN", "ISBN", "KATEGORI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuku.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableBukuComponentAdded(evt);
            }
        });
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);
        if (jTableBuku.getColumnModel().getColumnCount() > 0) {
            jTableBuku.getColumnModel().getColumn(0).setResizable(false);
            jTableBuku.getColumnModel().getColumn(1).setResizable(false);
            jTableBuku.getColumnModel().getColumn(2).setResizable(false);
            jTableBuku.getColumnModel().getColumn(3).setResizable(false);
            jTableBuku.getColumnModel().getColumn(4).setResizable(false);
            jTableBuku.getColumnModel().getColumn(5).setResizable(false);
            jTableBuku.getColumnModel().getColumn(6).setResizable(false);
            jTableBuku.getColumnModel().getColumn(7).setResizable(false);
            jTableBuku.getColumnModel().getColumn(8).setResizable(false);
        }

        jTextFieldCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCariBukuActionPerformed(evt);
            }
        });
        jTextFieldCariBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariBukuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCariBukuKeyTyped(evt);
            }
        });

        jButtonCariBuku.setText("CARI");
        jButtonCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariBukuActionPerformed(evt);
            }
        });

        FilterBuku.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FilterBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Buku", "Judul", "Subjudul", "Pengarang", "Penerbit", "Tahun Terbit", "Halaman", "ISBN", "Kategori" }));
        FilterBuku.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        FilterBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FilterBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBukuActionPerformed(evt);
            }
        });

        jButtonCetakSearchBuku.setText("CETAK");
        jButtonCetakSearchBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakSearchBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BukuMenuLayout = new javax.swing.GroupLayout(BukuMenu);
        BukuMenu.setLayout(BukuMenuLayout);
        BukuMenuLayout.setHorizontalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(BukuMenuLayout.createSequentialGroup()
                        .addComponent(FilterBuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCariBuku)
                        .addGap(4, 4, 4))
                    .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BukuMenuLayout.createSequentialGroup()
                            .addComponent(jButtonCetakSearchBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        BukuMenuLayout.setVerticalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCariBuku)
                    .addComponent(FilterBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCetakSearchBuku))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Buku   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books.png"), BukuMenu); // NOI18N
        BukuMenu.getAccessibleContext().setAccessibleParent(BukuMenu);

        SkripsiMenu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Skripsi");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Berikut data Skripsi Program Studi Sistem Informasi UINSA");

        jButtonEditDataSkripsi.setText("Edit Data Skripsi");
        jButtonEditDataSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataSkripsiActionPerformed(evt);
            }
        });

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE", "JUDUL", "PENGARANG", "TAHUN", "HALAMAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSkripsi.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableSkripsiComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSkripsi);
        if (jTableSkripsi.getColumnModel().getColumnCount() > 0) {
            jTableSkripsi.getColumnModel().getColumn(0).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(1).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(2).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(3).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(4).setResizable(false);
        }

        FilterSkripsi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FilterSkripsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Skripsi", "Judul", "Pengarang", "Tahun", "Halaman" }));
        FilterSkripsi.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        FilterSkripsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldCariSkripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariSkripsiKeyReleased(evt);
            }
        });

        jButtonCariSkripsi.setText("CARI");

        jButtonCariCetakSkripsi.setText("CETAK");
        jButtonCariCetakSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariCetakSkripsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SkripsiMenu1Layout = new javax.swing.GroupLayout(SkripsiMenu1);
        SkripsiMenu1.setLayout(SkripsiMenu1Layout);
        SkripsiMenu1Layout.setHorizontalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkripsiMenu1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkripsiMenu1Layout.createSequentialGroup()
                        .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCariCetakSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonEditDataSkripsi))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addComponent(FilterSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCariSkripsi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        SkripsiMenu1Layout.setVerticalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataSkripsi)
                    .addComponent(jButtonCariCetakSkripsi))
                .addGap(31, 31, 31))
        );

        jTextFieldCariSkripsi.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane2.addTab("Skripsi   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books(1).png"), SkripsiMenu1); // NOI18N

        jTabbedPane1.addTab("", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\material-symbols_inventory-2.png"), jTabbedPane2); // NOI18N

        Jpanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1130, 570));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Buku");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\Frame 11(2).png")); // NOI18N
        Jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 66));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Sistem Informasi UINSA");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Jpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("KUMPULAN BUKU & SKRIPSI");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Jpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 20));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/mdi_exit-run.png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        Jpanel.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataBukuActionPerformed
        // TODO add your handling code here:
        DataBuku DataBukuFrame = new DataBuku();
        DataBukuFrame.setVisible(true);
        DataBukuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataBukuActionPerformed

    private void jButtonEditDataSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataSkripsiActionPerformed
        // TODO add your handling code here:
        DataSkripsi DataSkripsiFrame = new DataSkripsi();
        DataSkripsiFrame.setVisible(true);
        DataSkripsiFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataSkripsiActionPerformed

    private void jButtonCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariBukuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonCariBukuActionPerformed

    private void jScrollPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentShown

    }//GEN-LAST:event_jScrollPane1ComponentShown

    private void BukuMenuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_BukuMenuInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_BukuMenuInputMethodTextChanged

    private void jScrollPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentAdded

    }//GEN-LAST:event_jScrollPane1ComponentAdded

    private void jTableBukuComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableBukuComponentAdded
        // TODO add your handling code here:
        // TODO add your handling code here:
        tampilanBuku();
    }//GEN-LAST:event_jTableBukuComponentAdded

    private void jTableSkripsiComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableSkripsiComponentAdded
        // TODO add your handling code here:
        tampilanSkripsi();
    }//GEN-LAST:event_jTableSkripsiComponentAdded

    private void jButtonCetakSearchBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakSearchBukuActionPerformed
        // TODO add your handling code here:
        try {
            String selection = (String) FilterBuku.getSelectedItem();
            String reportPath = "src/Report/reportBuku.jrxml";
            String searchTerm = jTextFieldCariBuku.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b ";

            switch (FilterBuku.getSelectedIndex()) {
                case 0:
                    queryString += "WHERE LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "WHERE LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "WHERE LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "WHERE LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "WHERE LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                    break;
                case 5:
                    queryString += "WHERE (b.tahunterbit) = (:searchTerm)";
                    break;
                case 6:
                    queryString += "WHERE (b.halaman) = (:searchTerm)";
                    break;
                case 7:
                    queryString += "WHERE LOWER(b.isbn) LIKE LOWER (:searchTerm)";
                    break;
                case 8:
                    queryString += "WHERE LOWER(b.kategori) LIKE LOWER (:searchTerm)";
                    break;
                default:
                    queryString += "WHERE LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> bok = cq.from(Buku.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                Query query = em.createQuery("SELECT b FROM Buku b");
            }

            TypedQuery<Buku> q = em.createQuery(cq);
            List<Buku> list = q.getResultList();
            Query query = em.createQuery(queryString);
            //query.setParameter("searchTerm", "%" + searchTerm + "%");

//            if (!searchTerm.isEmpty()) {
            if (FilterBuku.getSelectedIndex() == 5 || FilterBuku.getSelectedIndex() == 6) {
                query.setParameter("searchTerm", Integer.parseInt(searchTerm));
            } else {
                query.setParameter("searchTerm", "%" + searchTerm + "%");
            }
//            }

            List<Buku> results = query.getResultList();

            List<Object[]> data = new ArrayList<>();
            for (Buku result : results) {
                Object[] rowData = {
                    result.getKodebuku(),
                    result.getJudulbuku(),
                    result.getSubjudulbuku(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunterbit(),
                    result.getHalaman(),
                    result.getIsbn(),
                    result.getKategori(),};
                data.add(rowData);
            }
            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String, Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar", selection);

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakSearchBukuActionPerformed

    private void jTextFieldCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCariBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCariBukuActionPerformed

    private void jButtonCariCetakSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariCetakSkripsiActionPerformed
        try {
            String selection = (String) FilterSkripsi.getSelectedItem();
            String reportPath = "src/Report/reportSkripsi.jrxml";
            String searchTerm = jTextFieldCariSkripsi.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s ";

            switch (FilterSkripsi.getSelectedIndex()) {
                case 0:
                    queryString += " WHERE LOWER(s.kodeskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += " WHERE LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += " WHERE LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "WHERE (s.tahun) = (:searchTerm)";
                    break;
                case 4:
                    queryString += "WHERE (s.halaman) = (:searchTerm)";
                default:
                    queryString += "WHERE LOWER(s.kodeskripsi) LIKE LOWER(:searchTerm)";
                    break;
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
            Root<Skripsi> Skrip = cq.from(Skripsi.class);
            cq.select(Skrip);

            // Check if WHERE clause is not empty
            if (queryString.isEmpty()) {
                Query query = em.createQuery("SELECT s FROM Skripsi s");
                List<Skripsi> results = query.getResultList();

                JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);
            }

            TypedQuery<Skripsi> q = em.createQuery(cq);
            List<Skripsi> list = q.getResultList();
            Query query = em.createQuery(queryString);
            //query.setParameter("searchTerm", "%" + searchTerm + "%");

           // if (searchTerm.isEmpty()) {
                if (FilterSkripsi.getSelectedIndex() == 3 | FilterSkripsi.getSelectedIndex() == 4) {
                    query.setParameter("searchTerm", Integer.parseInt(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }
            //}

            List<Skripsi> results = query.getResultList();

            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Skripsi result : results) {
                Object[] rowData = {
                    result.getKodeskripsi(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getTahun(),
                    result.getHalaman()
                };
                data.add(rowData);
            }

            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String, Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar", selection);

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariCetakSkripsiActionPerformed

    private void FilterBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBukuActionPerformed

    private void jTextFieldCariBukuKeyReleased(java.awt.event.KeyEvent evt) {
        try {
            String selection = (String) FilterBuku.getSelectedItem();
            String searchTerm = jTextFieldCariBuku.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b";

            switch (FilterBuku.getSelectedIndex()) {
                case 0:
                    queryString += "WHERE LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "WHERE LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "WHERE LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "WHERE LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "WHERE LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                    break;
                case 5:
                    queryString += "WHERE (b.tahunterbit) = (:searchTerm)";
                    break;
                case 6:
                    queryString += "WHERE (b.halaman) = (:searchTerm)";
                    break;
                case 7:
                    queryString += "WHERE LOWER(b.isbn) LIKE LOWER (:searchTerm)";
                    break;
                case 8:
                    queryString += "WHERE LOWER(b.kategori) LIKE LOWER (:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            // Create and execute the JPA query
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
                //query.setParameter("searchTerm", "%" + searchTerm + "%");

                if (FilterBuku.getSelectedIndex() == 5 | FilterBuku.getSelectedIndex() == 6) {
                    query.setParameter("searchTerm", Integer.valueOf(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }

                List<Buku> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE");
                dataModel.addColumn("JUDUL");
                dataModel.addColumn("SUBJUDUL");
                dataModel.addColumn("PENGARANG");
                dataModel.addColumn("PENERBIT");
                dataModel.addColumn("TAHUN");
                dataModel.addColumn("HALAMAN");
                dataModel.addColumn("ISBN");
                dataModel.addColumn("KATEGORI");

                // Add rows to the model
                for (Buku result : results) {
                    Object[] rowData = {
                        result.getKodebuku(),
                        result.getJudulbuku(),
                        result.getSubjudulbuku(),
                        result.getPengarang(),
                        result.getPenerbit(),
                        result.getTahunterbit(),
                        result.getHalaman(),
                        result.getIsbn(),
                        result.getKategori(),};
                    dataModel.addRow(rowData);
                }

                // Set jTableBuku with the created model
                jTableBuku.setModel(dataModel);

            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private void jTextFieldCariBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariBukuKeyTyped

    }//GEN-LAST:event_jTextFieldCariBukuKeyTyped

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jTextFieldCariSkripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariSkripsiKeyReleased
        // TODO add your handling code here:
        try {
            String selection = (String) FilterSkripsi.getSelectedItem();
            String searchTerm = jTextFieldCariSkripsi.getText().trim();

            // Check if a search criteria is selected
            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s WHERE ";
            switch (FilterSkripsi.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(s.kodeskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "(s.tahun) = (:searchTerm)";
                    break;
                case 4:
                    queryString += "(s.halaman) = (:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            // Create and execute the JPA query
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Skripsi> query = em.createQuery(queryString, Skripsi.class);
                //query.setParameter("searchTerm", "%" + searchTerm + "%");

                if (FilterSkripsi.getSelectedIndex() == 3 | FilterSkripsi.getSelectedIndex() == 4) {
                    query.setParameter("searchTerm", Integer.parseInt(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }

                List<Skripsi> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE");
                dataModel.addColumn("JUDUL");
                dataModel.addColumn("PENULIS");
                dataModel.addColumn("TAHUN");
                dataModel.addColumn("HALAMAN");

                // Add rows to the model
                for (Skripsi result : results) {
                    Object[] rowData = {
                        result.getKodeskripsi(),
                        result.getJudulskripsi(),
                        result.getPenulis(),
                        result.getTahun(),
                        result.getHalaman()
                    };
                    dataModel.addRow(rowData);
                }

                // Set tabel skripsi dengan created model
                jTableSkripsi.setModel(dataModel);

            } catch (IllegalArgumentException ex) {
                // Handle the case where no search criteria selected
                ex.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jTextFieldCariSkripsiKeyReleased

    private void jTextFieldKodepinjambukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodepinjambukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodepinjambukuActionPerformed

    private void jTextFieldnamabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnamabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnamabActionPerformed

    private void jComboBoxPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPinjamBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPinjamBukuActionPerformed

    private void jTextFieldangkatanbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldangkatanbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldangkatanbActionPerformed

    private void jTextFieldKodepinjamskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodepinjamskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodepinjamskripsiActionPerformed

    private void jTextFieldnamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnamasActionPerformed

    private void jTextFieldangkatansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldangkatansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldangkatansActionPerformed

    private void jComboBoxPinjamSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPinjamSkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPinjamSkripsiActionPerformed

    private void jTextFieldnimbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnimbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnimbActionPerformed

    private void jButtonTambahPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahPinjamBukuActionPerformed
        // TODO add your handling code here:
        String kodepinjamb = jTextFieldKodepinjambuku.getText().trim();
        String namab = jTextFieldnamab.getText();
        String nimb = jTextFieldnimb.getText();
        int angkatanb = Integer.parseInt(jTextFieldangkatanb.getText());
        Date tglpinjamb = jDateChoosertpb.getDate();
        Date tglbalikb = jDateChoosertkb.getDate();
        String status = jComboBoxspb.getSelectedItem().toString();

        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
            entityManager.getTransaction().begin();
            String kodebuku = (String) jComboBoxKodebuku.getSelectedItem();
            Buku kodbuk = entityManager.find(Buku.class, kodebuku);
            Peminjamanbuku pb = new Peminjamanbuku();
            pb.setKodepinjamb(kodepinjamb);
            pb.setKodebuku(kodbuk);
            pb.setNama(namab);
            pb.setNim(nimb);
            pb.setAngkatan(angkatanb);
            pb.setTglpinjam(tglpinjamb);
            pb.setTglbalik(tglbalikb);
            pb.setStatus(status);

            entityManager.persist(pb);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data buku berhasil disimpan!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data buku gagal disimpan karena : " + String.valueOf(ex));
        }

        tampilanPinjamBuku();
    }//GEN-LAST:event_jButtonTambahPinjamBukuActionPerformed

    private void jButtonPinjamSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPinjamSkripsiActionPerformed
        // TODO add your handling code here:
        String kodepinjams = jTextFieldKodepinjamskripsi.getText().trim();
        Skripsi kodskrip = new Skripsi();
        kodskrip.setKodeskripsi((String) jComboBoxKodeskripsi.getSelectedItem());
        String namas = jTextFieldnamas.getText();
        String nims = jTextFieldnims.getText();
        int angkatans = Integer.parseInt(jTextFieldangkatans.getText());
        Date tglpinjams = jDateChoosertps.getDate();
        Date tglbaliks = jDateChoosertks.getDate();
        String status = jComboBoxsps.getSelectedItem().toString();

        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
            entityManager.getTransaction().begin();
            Peminjamanskripsi pb = new Peminjamanskripsi();
            pb.setKodepinjams(kodepinjams);
            pb.setKodeskripsi(kodskrip);
            pb.setNama(namas);
            pb.setNim(nims);
            pb.setAngkatan(angkatans);
            pb.setTglpinjam(tglpinjams);
            pb.setTglbalik(tglbaliks);
            pb.setStatus(status);

            entityManager.persist(pb);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data buku berhasil disimpan!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Skripsi gagal disimpan karena : " + String.valueOf(ex));
        }

        tampilanPinjamSkripsi();
    }//GEN-LAST:event_jButtonPinjamSkripsiActionPerformed

    private void jTablePinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePinjamBukuMouseClicked
        int row = jTablePinjamBuku.getSelectedRow();
        if (row >= 0) {

            String kodepinjamb = jTablePinjamBuku.getValueAt(row, 0).toString();
            String kodebukup = jTablePinjamBuku.getValueAt(row, 1).toString();
            String nama = jTablePinjamBuku.getValueAt(row, 2).toString();
            String nim = jTablePinjamBuku.getValueAt(row, 3).toString();
            String angkatan = jTablePinjamBuku.getValueAt(row, 4).toString();
            Date tglpinjam = (Date) jTablePinjamBuku.getValueAt(row, 5);
            Date tglbalik = (Date) jTablePinjamBuku.getValueAt(row, 6);
            String status = jTablePinjamBuku.getValueAt(row, 7).toString();

            jTextFieldKodepinjambuku.setText(kodepinjamb);
            jComboBoxKodebuku.setSelectedItem(kodebukup);
            jTextFieldnamab.setText(nama);
            jTextFieldnimb.setText(nim);
            jTextFieldangkatanb.setText(angkatan);
            jDateChoosertpb.setDate(tglpinjam);
            jDateChoosertkb.setDate(tglbalik);
            jComboBoxspb.setSelectedItem(status);
        } else {
            // Handle jika tidak ada baris yang dipilih
            System.out.println("Tidak ada baris yang dipilih.");
        }

    }//GEN-LAST:event_jTablePinjamBukuMouseClicked

    private void jButtonUbahPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahPinjamBukuActionPerformed
        // TODO add your handling code here:
        String kodepinjamb = jTextFieldKodepinjambuku.getText().trim();
        Buku kodbuk = new Buku();
        kodbuk.setKodebuku((String) jComboBoxKodebuku.getSelectedItem());
        String namab = jTextFieldnamab.getText();
        String nimb = jTextFieldnimb.getText();
        int angkatanb = Integer.parseInt(jTextFieldangkatanb.getText());
        Date tglpinjamb = jDateChoosertpb.getDate();
        Date tglbalikb = jDateChoosertkb.getDate();
        String status = jComboBoxspb.getSelectedItem().toString();

        EntityManager em = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
        em.getTransaction().begin();

        try {
            Peminjamanbuku pb = em.find(Peminjamanbuku.class, kodepinjamb); // Mencari buku berdasarkan kode buku

            if (pb != null) {

                pb.setKodepinjamb(kodepinjamb);
                pb.setKodebuku(kodbuk);
                pb.setNama(namab);
                pb.setNim(nimb);
                pb.setAngkatan(angkatanb);
                pb.setTglpinjam(tglpinjamb);
                pb.setTglbalik(tglbalikb);
                pb.setStatus(status);

                em.merge(pb);
                em.getTransaction().commit(); // Commit transaksi
                JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
                tampilanPinjamBuku();
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan kode buku: " + kodepinjamb + " tidak ditemukan.");
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); // Rollback jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah data." + String.valueOf(e));
        } finally {
            jTextFieldKodepinjambuku.setText("");
            jComboBoxKodebuku.setSelectedIndex(0);
            jTextFieldnamab.setText("");
            jTextFieldnimb.setText("");
            jTextFieldangkatanb.setText("");
            jDateChoosertpb.setCalendar(null);
            jDateChoosertkb.setCalendar(null);
            jComboBoxspb.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonUbahPinjamBukuActionPerformed

    private void jButtonCetakPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakPinjamBukuActionPerformed
        try {
            String selection = (String) jComboBoxPinjamSkripsi.getSelectedItem();
            String reportPath = "src/Report/reportPeminjamanSkripsi.jrxml";
            Date tanggalAwal = (Date) jDateChooserTAWPB.getDate();
            Date tanggalAkhir = (Date) jDateChooserTAKPB.getDate();

            String searchTerm = jTextFieldPencarianSkripsi.getText().trim();
            String queryString = "SELECT ps FROM Peminjamanskripsi ps ";

            if (!searchTerm.isEmpty()) {
                switch (jComboBoxPinjamSkripsi.getSelectedIndex()) {
                    case 0:
                        queryString += "WHERE LOWER(ps.kodepinjams) LIKE LOWER(:searchTerm)";
                        break;
                    case 1:
                        queryString += "WHERE LOWER(ps.nama) LIKE LOWER(:searchTerm)";
                        break;
                    case 2:
                        queryString += "WHERE LOWER(ps.nim) LIKE LOWER(:searchTerm)";
                        break;
                    case 3:
                        queryString += "WHERE ps.angkatan = :searchTerm";
                        break;
                    case 4:
                        queryString += "WHERE LOWER(ps.status) LIKE LOWER(:searchTerm)";
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid search criteria selected.");
                }
            }

            if (tanggalAwal != null && tanggalAkhir != null) {
                if (!searchTerm.isEmpty()) {
                    queryString += " AND ";
                } else {
                    queryString += " WHERE ";
                }
                queryString += "ps.tglpinjam BETWEEN :tanggalAwal AND :tanggalAkhir";
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Peminjamanskripsi> query = em.createQuery(queryString, Peminjamanskripsi.class);

            // Set parameter tanggal jika dimasukkan
            if (tanggalAwal != null && tanggalAkhir != null) {
                query.setParameter("tanggalAwal", tanggalAwal);
                query.setParameter("tanggalAkhir", tanggalAkhir);
            }

            if (!searchTerm.isEmpty()) {
                if (jComboBoxPinjamSkripsi.getSelectedIndex() == 3) {
                    query.setParameter("searchTerm", Integer.valueOf(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }
            }

            List<Peminjamanskripsi> results = query.getResultList();
            List<Object[]> data = new ArrayList<>();
            for (Peminjamanskripsi result : results) {
                Object[] rowData = {
                    result.getKodepinjams(),
                    result.getKodeskripsi().getKodeskripsi(),
                    result.getNama(),
                    result.getNim(),
                    result.getTglpinjam(),
                    result.getTglbalik(),
                    result.getStatus()
                };
                data.add(rowData);
            }

            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String, Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar", selection);
            param.put("tanggalAwal", tanggalAwal);
            param.put("tanggalAkhir", tanggalAkhir);

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(rootPaneCheckingEnabled);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakPinjamBukuActionPerformed

    private void jTextFieldCaripinjambukuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCaripinjambukuKeyReleased
        try {
            String selection = (String) jComboBoxPinjamBuku.getSelectedItem();
            String searchTerm = jTextFieldCaripinjambuku.getText().trim();
            String queryString = "SELECT pb FROM Peminjamanbuku pb ";

            switch (jComboBoxPinjamBuku.getSelectedIndex()) {
                case 0:
                    queryString += "WHERE LOWER(pb.kodepinjamb) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "WHERE LOWER(pb.nama) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "WHERE LOWER(pb.nim) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "WHERE (pb.angkatan) = (:searchTerm)";
                    break;
                case 4:
                    queryString += "WHERE LOWER(pb.status) LIKE LOWER (:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Peminjamanbuku> query = em.createQuery(queryString, Peminjamanbuku.class);
                //query.setParameter("searchTerm", "%" + searchTerm + "%");

                if (jComboBoxPinjamBuku.getSelectedIndex() == 3) {
                    query.setParameter("searchTerm", Integer.valueOf(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }

                List<Peminjamanbuku> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE PINJAM");
                dataModel.addColumn("KODE BUKU");
                dataModel.addColumn("NAMA");
                dataModel.addColumn("NIM");
                dataModel.addColumn("ANGKATAN");
                dataModel.addColumn("TGL PINJAM");
                dataModel.addColumn("TGL KEMBALI");
                dataModel.addColumn("STATUS");

                // Add rows to the model
                for (Peminjamanbuku result : results) {
                    Object[] rowData = {
                        result.getKodepinjamb(),
                        result.getKodebuku().getKodebuku(),
                        result.getNama(),
                        result.getNim(),
                        result.getAngkatan(),
                        result.getTglpinjam(),
                        result.getTglbalik(),
                        result.getStatus()};
                    dataModel.addRow(rowData);
                }

                jTablePinjamBuku.setModel(dataModel);

            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTextFieldCaripinjambukuKeyReleased

    private void jComboBoxKodeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKodeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKodeskripsiActionPerformed

    private void jButtonUbahPinjamSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahPinjamSkripsiActionPerformed
        String kodepinjams = jTextFieldKodepinjamskripsi.getText().trim();
        Skripsi skrip = new Skripsi();
        skrip.setKodeskripsi((String) jComboBoxKodeskripsi.getSelectedItem());
        String namab = jTextFieldnamas.getText();
        String nimb = jTextFieldnims.getText();
        int angkatanb = Integer.parseInt(jTextFieldangkatans.getText());
        Date tglpinjamb = jDateChoosertps.getDate();
        Date tglbalikb = jDateChoosertks.getDate();
        String status = jComboBoxsps.getSelectedItem().toString();

        EntityManager em = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
        em.getTransaction().begin();

        try {
            Peminjamanskripsi ps = em.find(Peminjamanskripsi.class, kodepinjams);

            if (ps != null) {

                ps.setKodepinjams(kodepinjams);
                ps.setKodeskripsi(skrip);
                ps.setNama(namab);
                ps.setNim(nimb);
                ps.setAngkatan(angkatanb);
                ps.setTglpinjam(tglpinjamb);
                ps.setTglbalik(tglbalikb);
                ps.setStatus(status);

                em.merge(ps);
                em.getTransaction().commit(); // Commit transaksi
                JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
                tampilanPinjamSkripsi();
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan kode peminjaman: " + kodepinjams + " tidak ditemukan.");
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); // Rollback jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah data." + String.valueOf(e));
        } finally {
            jTextFieldKodepinjamskripsi.setText("");
            jComboBoxKodeskripsi.setSelectedIndex(0);
            jTextFieldnamas.setText("");
            jTextFieldnims.setText("");
            jTextFieldangkatans.setText("");
            jDateChoosertps.setCalendar(null);
            jDateChoosertks.setCalendar(null);
            jComboBoxsps.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jButtonUbahPinjamSkripsiActionPerformed

    private void jButtonHapusPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusPinjamBukuActionPerformed
        String kodepinjamb = jTextFieldKodepinjambuku.getText().trim();
        EntityManager entityManager = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
        entityManager.getTransaction().begin();
        Peminjamanbuku pb = entityManager.find(Peminjamanbuku.class, kodepinjamb);

        if (pb != null) {
            entityManager.remove(pb);
        }
        entityManager.flush();
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        tampilanPinjamBuku();
    }//GEN-LAST:event_jButtonHapusPinjamBukuActionPerformed

    private void jTablePeminjamanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePeminjamanSkripsiMouseClicked
        int row = jTablePeminjamanSkripsi.getSelectedRow();
        if (row >= 0) {

            String kodepinjams = jTablePeminjamanSkripsi.getValueAt(row, 0).toString();
            String kodeskripsip = jTablePeminjamanSkripsi.getValueAt(row, 1).toString();
            String nama = jTablePeminjamanSkripsi.getValueAt(row, 2).toString();
            String nim = jTablePeminjamanSkripsi.getValueAt(row, 3).toString();
            String angkatan = jTablePeminjamanSkripsi.getValueAt(row, 4).toString();
            Date tglpinjam = (Date) jTablePeminjamanSkripsi.getValueAt(row, 5);
            Date tglbalik = (Date) jTablePeminjamanSkripsi.getValueAt(row, 6);
            String status = jTablePeminjamanSkripsi.getValueAt(row, 7).toString();

            jTextFieldKodepinjamskripsi.setText(kodepinjams);
            jComboBoxKodeskripsi.setSelectedItem(kodeskripsip);
            jTextFieldnamas.setText(nama);
            jTextFieldnims.setText(nim);
            jTextFieldangkatans.setText(angkatan);
            jDateChoosertps.setDate(tglpinjam);
            jDateChoosertks.setDate(tglbalik);
            jComboBoxsps.setSelectedItem(status);
        } else {
            // Handle jika tidak ada baris yang dipilih
            System.out.println("Tidak ada baris yang dipilih.");
        }

    }//GEN-LAST:event_jTablePeminjamanSkripsiMouseClicked

    private void jButtonHapusPinjamSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusPinjamSkripsiActionPerformed
        // TODO add your handling code here:
        String kodepinjamskripsi = jTextFieldKodepinjamskripsi.getText().trim();
        EntityManager entityManager = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU").createEntityManager();
        entityManager.getTransaction().begin();
        Peminjamanskripsi ps = entityManager.find(Peminjamanskripsi.class, kodepinjamskripsi);

        if (ps != null) {
            entityManager.remove(ps);
        }
        entityManager.flush();
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        tampilanPinjamSkripsi();
    }//GEN-LAST:event_jButtonHapusPinjamSkripsiActionPerformed

    private void jTextFieldCaripinjambukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaripinjambukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaripinjambukuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtoncetakbukubanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncetakbukubanyakActionPerformed
        try {
            String reportPath = "src/Report/reportBukuTerbanyak.jrxml";

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
            Root<Peminjamanbuku> peminjamanRoot = cq.from(Peminjamanbuku.class);
            Join<Peminjamanbuku, Buku> bukuJoin = peminjamanRoot.join("kodebuku", JoinType.INNER);

            cq.multiselect(
                    bukuJoin.get("kodebuku"),
                    bukuJoin.get("judulbuku"),
                    cb.count(peminjamanRoot.get("kodepinjamb")).alias("jumlahpeminjaman")
            );

            cq.groupBy(bukuJoin.get("kodebuku"), bukuJoin.get("judulbuku"));
            cq.orderBy(cb.desc(cb.count(peminjamanRoot.get("kodepinjamb"))));

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();

            em.close();
            emf.close();

            // Mapping hasil query ke dalam parameter JasperReport
            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                String kodebuku = (String) result[0];
                String judulbuku = (String) result[1];
                Long jumlah_peminjaman = (Long) result[2];

                map.put("kodebuku", kodebuku);
                map.put("judulbuku", judulbuku);
                map.put("jumlah_peminjaman", jumlah_peminjaman);
                mappedResults.add(map);
            }

            // Creating a JasperReports data source from the mapped results
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            // Loading the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Peminjamanbuku.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtoncetakbukubanyakActionPerformed

    private static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/KUBUS";
        String user = "postgres";
        String password = "123";
        return DriverManager.getConnection(url, user, password);
    }

    private void jButtonCetakSkripsiBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakSkripsiBanyakActionPerformed
        try {
            String reportPath = "src/Report/reportSkripsiTerbanyak.jrxml";

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
            Root<Peminjamanskripsi> peminjamanRoot1 = cq.from(Peminjamanskripsi.class);
            Join<Peminjamanskripsi, Skripsi> skripsiJoin = peminjamanRoot1.join("kodeskripsi", JoinType.INNER);

            cq.multiselect(
                    skripsiJoin.get("kodeskripsi"),
                    skripsiJoin.get("judulskripsi"),
                    cb.count(peminjamanRoot1.get("kodepinjams")).alias("jumlahpeminjaman")
            );

            cq.groupBy(skripsiJoin.get("kodeskripsi"), skripsiJoin.get("judulskripsi"));
            cq.orderBy(cb.desc(cb.count(peminjamanRoot1.get("kodepinjams"))));

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();

            em.close();
            emf.close();

            // Mapping hasil query ke dalam parameter JasperReport
            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                String kodeskripsi = (String) result[0];
                String judulskripsi = (String) result[1];
                Long jumlah_peminjaman = (Long) result[2];

                map.put("kodeskripsi", kodeskripsi);
                map.put("judulskripsi", judulskripsi);
                map.put("jumlah_peminjaman", jumlah_peminjaman);
                mappedResults.add(map);
            }

            // Creating a JasperReports data source from the mapped results
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            // Loading the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Peminjamanbuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakSkripsiBanyakActionPerformed

    private void jButtonCetakKategoriBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakKategoriBanyakActionPerformed
        // TODO add your handling code here:
        try {
            String reportPath = "src/Report/reportKategoriTerbanyak.jrxml";

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
            Root<Peminjamanbuku> peminjamanRoot2 = cq.from(Peminjamanbuku.class);
            Join<Peminjamanbuku, Buku> kategoriJoin = peminjamanRoot2.join("kodebuku", JoinType.INNER);
            //Join<Peminjamanbuku, Buku> kategoriJoin = kategoriJoin.join("kodepinjamb", JoinType.INNER);

            cq.multiselect(
                    kategoriJoin.get("kategori"),
                    cb.count(peminjamanRoot2.get("kodepinjamb")).alias("jumlah_peminjaman")
            );

            cq.groupBy(kategoriJoin.get("kategori"));
            //cq.orderBy(cb.desc(cb.count(peminjamanRoot2.get("kodepinjamb"))));

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();

            em.close();
            emf.close();

            // Mapping hasil query ke dalam parameter JasperReport
            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                String kategori = (String) result[0];
                Long jumlahPeminjaman = (Long) result[1];

                map.put("kategori", kategori); // Sesuaikan dengan atribut yang sesuai pada kelas Kategori_1
                map.put("jumlah_peminjaman", jumlahPeminjaman);
                mappedResults.add(map);
            }

            // Creating a JasperReports data source from the mapped results
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            // Loading the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Peminjamanbuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakKategoriBanyakActionPerformed

    private void jTextFieldPencarianSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPencarianSkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarianSkripsiActionPerformed

    private void jTextFieldPencarianSkripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPencarianSkripsiKeyReleased
        try {
            String selection = (String) jComboBoxPinjamSkripsi.getSelectedItem();
            String searchTerm = jTextFieldPencarianSkripsi.getText().trim();
            String queryString = "SELECT ps FROM Peminjamanskripsi ps ";

            switch (jComboBoxPinjamSkripsi.getSelectedIndex()) {
                case 0:
                    queryString += "WHERE LOWER(ps.kodepinjams) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "WHERE LOWER(ps.nama) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "WHERE LOWER(ps.nim) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "WHERE (ps.angkatan) = (:searchTerm)";
                    break;
                case 4:
                    queryString += "WHERE LOWER(ps.status) LIKE LOWER (:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Peminjamanskripsi> query = em.createQuery(queryString, Peminjamanskripsi.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                if (jComboBoxPinjamSkripsi.getSelectedIndex() == 3) {
                    query.setParameter("searchTerm", Integer.parseInt(searchTerm));
                } else {
                    query.setParameter("searchTerm", "%" + searchTerm + "%");
                }

                List<Peminjamanskripsi> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE PINJAM");
                dataModel.addColumn("KODE SKRIPSI");
                dataModel.addColumn("NAMA");
                dataModel.addColumn("NIM");
                dataModel.addColumn("ANGKATAN");
                dataModel.addColumn("TGL PINJAM");
                dataModel.addColumn("TGL KEMBALI");
                dataModel.addColumn("STATUS");

                // Add rows to the model
                for (Peminjamanskripsi result : results) {
                    Object[] rowData = {
                        result.getKodepinjams(),
                        result.getKodeskripsi().getKodeskripsi(),
                        result.getNama(),
                        result.getNim(),
                        result.getAngkatan(),
                        result.getTglpinjam(),
                        result.getTglbalik(),
                        result.getStatus()};
                    dataModel.addRow(rowData);
                }
                jTablePeminjamanSkripsi.setModel(dataModel);

            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jTextFieldPencarianSkripsiKeyReleased

    private void jButtonCetakPinjamSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakPinjamSkripsiActionPerformed
        try {
            String selection = (String) jComboBoxPinjamSkripsi.getSelectedItem();
            String reportPath = "src/Report/reportPeminjamanSkripsi.jrxml";
            Date tanggalAwal = (Date) jDateChooserTAWPB.getDate();
            Date tanggalAkhir = (Date) jDateChooserTAKPB.getDate();

            String searchTerm = jTextFieldPencarianSkripsi.getText().trim();
            String queryString = "SELECT ps FROM Peminjamanskripsi ps ";

            if (!searchTerm.isEmpty()) {
                switch (jComboBoxPinjamSkripsi.getSelectedIndex()) {
                    case 0:
                        queryString += "WHERE LOWER(ps.kodepinjams) LIKE LOWER(:searchTerm)";
                        break;
                    case 1:
                        queryString += "WHERE LOWER(ps.nama) LIKE LOWER(:searchTerm)";
                        break;
                    case 2:
                        queryString += "WHERE LOWER(ps.nim) LIKE LOWER(:searchTerm)";
                        break;
                    case 3:
                        queryString += "WHERE ps.angkatan = :searchTerm";
                        break;
                    case 4:
                        queryString += "WHERE LOWER(ps.status) LIKE LOWER(:searchTerm)";
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid search criteria selected.");
                }
            }

            if (tanggalAwal != null && tanggalAkhir != null) {
                if (!searchTerm.isEmpty()) {
                    queryString += " AND ";
                } else {
                    queryString += "WHERE ";
                }
                queryString += "ps.tglpinjam BETWEEN :tanggalAwal AND :tanggalAkhir";
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Peminjamanskripsi> query = em.createQuery(queryString, Peminjamanskripsi.class);

            // Set parameter tanggal jika dimasukkan
            if (tanggalAwal != null && tanggalAkhir != null) {
                query.setParameter("tanggalAwal", tanggalAwal);
                query.setParameter("tanggalAkhir", tanggalAkhir);
            }

            if (!searchTerm.isEmpty()) {
                if (jComboBoxPinjamBuku.getSelectedIndex() == 3) {
                    query.setParameter("searchTerm", Integer.parseInt(searchTerm));
                } else {
                    query.setParameter("searchTerm", searchTerm);
                }
            }

            List<Peminjamanskripsi> results = query.getResultList();
            List<Object[]> data = new ArrayList<>();
            for (Peminjamanskripsi result : results) {
                Object[] rowData = {
                    result.getKodepinjams(),
                    result.getKodeskripsi().getKodeskripsi(),
                    result.getNama(),
                    result.getNim(),
                    result.getTglpinjam(),
                    result.getTglbalik(),
                    result.getStatus()
                };
                data.add(rowData);
            }

            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String, Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar", selection);
            param.put("tanggalAwal", tanggalAwal);
            param.put("tanggalAkhir", tanggalAkhir);

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(rootPaneCheckingEnabled);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonCetakPinjamSkripsiActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed

        // Menampilkan JOptionPane untuk konfirmasi logout
        int confirmLogout = JOptionPane.showConfirmDialog(Dashboard.this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        // Memeriksa hasil dari dialog konfirmasi
        if (confirmLogout == JOptionPane.YES_OPTION) {
            FormLogin FL = new FormLogin();
            FL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            FL.setVisible(true);

            dispose();
        } else {

        }


    }//GEN-LAST:event_btn_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FilterBuku;
    private javax.swing.JComboBox<String> FilterSkripsi;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JPanel PeminjamanBuku;
    private javax.swing.JPanel PeminjamanSkripsi;
    private javax.swing.JPanel SkripsiMenu1;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButtonCariBuku;
    private javax.swing.JButton jButtonCariCetakSkripsi;
    private javax.swing.JButton jButtonCariSkripsi;
    private javax.swing.JButton jButtonCetakKategoriBanyak;
    private javax.swing.JButton jButtonCetakPinjamBuku;
    private javax.swing.JButton jButtonCetakPinjamSkripsi;
    private javax.swing.JButton jButtonCetakSearchBuku;
    private javax.swing.JButton jButtonCetakSkripsiBanyak;
    private javax.swing.JButton jButtonEditDataBuku;
    private javax.swing.JButton jButtonEditDataSkripsi;
    private javax.swing.JButton jButtonHapusPinjamBuku;
    private javax.swing.JButton jButtonHapusPinjamSkripsi;
    private javax.swing.JButton jButtonPinjamSkripsi;
    private javax.swing.JButton jButtonTambahPinjamBuku;
    private javax.swing.JButton jButtonUbahPinjamBuku;
    private javax.swing.JButton jButtonUbahPinjamSkripsi;
    private javax.swing.JButton jButtoncetakbukubanyak;
    private javax.swing.JComboBox<String> jComboBoxKodebuku;
    private javax.swing.JComboBox<String> jComboBoxKodeskripsi;
    private javax.swing.JComboBox<String> jComboBoxPinjamBuku;
    private javax.swing.JComboBox<String> jComboBoxPinjamSkripsi;
    private javax.swing.JComboBox<String> jComboBoxspb;
    private javax.swing.JComboBox<String> jComboBoxsps;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooserTAKPB;
    private com.toedter.calendar.JDateChooser jDateChooserTAKPS;
    private com.toedter.calendar.JDateChooser jDateChooserTAWPB;
    private com.toedter.calendar.JDateChooser jDateChooserTAWPS;
    private com.toedter.calendar.JDateChooser jDateChoosertkb;
    private com.toedter.calendar.JDateChooser jDateChoosertks;
    private com.toedter.calendar.JDateChooser jDateChoosertpb;
    private com.toedter.calendar.JDateChooser jDateChoosertps;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeljudulbuku;
    private javax.swing.JLabel jLabeljudulkategori;
    private javax.swing.JLabel jLabeljudulskripsi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelcetaklb;
    private javax.swing.JPanel jPanelcetakls;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTable jTablePeminjamanSkripsi;
    private javax.swing.JTable jTablePinjamBuku;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTextField jTextFieldCariBuku;
    private javax.swing.JTextField jTextFieldCariSkripsi;
    private javax.swing.JTextField jTextFieldCaripinjambuku;
    private javax.swing.JTextField jTextFieldKodepinjambuku;
    private javax.swing.JTextField jTextFieldKodepinjamskripsi;
    private javax.swing.JTextField jTextFieldPencarianSkripsi;
    private javax.swing.JTextField jTextFieldangkatanb;
    private javax.swing.JTextField jTextFieldangkatans;
    private javax.swing.JTextField jTextFieldnamab;
    private javax.swing.JTextField jTextFieldnamas;
    private javax.swing.JTextField jTextFieldnimb;
    private javax.swing.JTextField jTextFieldnims;
    private javax.swing.JLabel lbl_bukuterbanyak;
    private javax.swing.JLabel lbl_kategoriterbanyak;
    private javax.swing.JLabel lbl_skripsiterbanyak;
    private javax.swing.JTabbedPane transaksi;
    // End of variables declaration//GEN-END:variables

    private void tampilanBuku() {
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class
        );
        Root<Buku> stud = cq.from(Buku.class
        );
        cq.select(stud.get("kodebuku"));

        CriteriaQuery<Buku> select = cq.select(stud);
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

    private void tampilanSkripsi() {

        DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class
        );
        Root<Skripsi> stud = cq.from(Skripsi.class
        );
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

    private void tampilanPinjamBuku() {
        DefaultTableModel model = (DefaultTableModel) jTablePinjamBuku.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Peminjamanbuku> cq = cb.createQuery(Peminjamanbuku.class
        );
        Root<Peminjamanbuku> pbuk = cq.from(Peminjamanbuku.class
        );
        Join<Peminjamanbuku, Buku> bukuJoin = pbuk.join("kodebuku", JoinType.INNER);

        cq.multiselect(
                pbuk.get("kodepinjamb"),
                bukuJoin.get("kodebuku"),
                pbuk.get("nama"),
                pbuk.get("nim"),
                pbuk.get("angkatan"),
                pbuk.get("tglpinjam"),
                pbuk.get("tglbalik"),
                pbuk.get("status")
        );

        CriteriaQuery<Peminjamanbuku> select = cq.select(pbuk);
        TypedQuery<Peminjamanbuku> q = em.createQuery(select);
        List<Peminjamanbuku> resultList = q.getResultList();

        for (Peminjamanbuku data : resultList) {
            Object[] baris = new Object[8];
            baris[0] = data.getKodepinjamb();
            baris[1] = data.getKodebuku().getKodebuku();
            baris[2] = data.getNama();
            baris[3] = data.getNim();
            baris[4] = data.getAngkatan();
            baris[5] = data.getTglpinjam();
            baris[6] = data.getTglbalik();
            baris[7] = data.getStatus();

            model.addRow(baris);
        }

        jTablePinjamBuku.setModel(model);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private void tampilanPinjamSkripsi() {
        DefaultTableModel model = (DefaultTableModel) jTablePeminjamanSkripsi.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Peminjamanskripsi> cq = cb.createQuery(Peminjamanskripsi.class
        );
        Root<Peminjamanskripsi> pbuk = cq.from(Peminjamanskripsi.class
        );
        Join<Peminjamanskripsi, Skripsi> bukuJoin = pbuk.join("kodeskripsi", JoinType.INNER);

        cq.multiselect(
                pbuk.get("kodepinjams"),
                bukuJoin.get("kodeskripsi"),
                pbuk.get("nama"),
                pbuk.get("nim"),
                pbuk.get("angkatan"),
                pbuk.get("tglpinjam"),
                pbuk.get("tglbalik"),
                pbuk.get("status")
        );

        CriteriaQuery<Peminjamanskripsi> select = cq.select(pbuk);
        TypedQuery<Peminjamanskripsi> q = em.createQuery(select);
        List<Peminjamanskripsi> resultList = q.getResultList();

        for (Peminjamanskripsi data : resultList) {
            Object[] baris = new Object[8];
            baris[0] = data.getKodepinjams();
            baris[1] = data.getKodeskripsi().getKodeskripsi();
            baris[2] = data.getNama();
            baris[3] = data.getNim();
            baris[4] = data.getAngkatan();
            baris[5] = data.getTglpinjam();
            baris[6] = data.getTglbalik();
            baris[7] = data.getStatus();

            model.addRow(baris);
        }

        jTablePeminjamanSkripsi.setModel(model);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private void initKodeBukuComboBox() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b.kodebuku FROM Buku b ORDER BY b.kodebuku");
        List<String> kodeBukuList = query.getResultList();
        em.getTransaction().commit();

        em.close();
        emf.close();

        for (String kodeBuku : kodeBukuList) {
            jComboBoxKodebuku.addItem(kodeBuku);
        }
    }

    private void initKodeSkripsiComboBox() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s.kodeskripsi FROM Skripsi s ORDER BY s.kodeskripsi");
        List<String> kodeBukuList = query.getResultList();
        em.getTransaction().commit();

        em.close();
        emf.close();

        for (String kodeskripsi : kodeBukuList) {
            jComboBoxKodeskripsi.addItem(kodeskripsi);
        }
    }

    private void totalbukukategori() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT COUNT(pb.kodepinjamb) AS jumlah_peminjaman FROM Buku b LEFT JOIN Peminjamanbuku pb ON b.kodebuku = pb.kodebuku GROUP BY b.kategori ORDER BY jumlah_peminjaman DESC LIMIT 1;");
        Long totalktg = (Long) query.getSingleResult();
        Integer totalktgint = totalktg.intValue();

        em.getTransaction().commit();

        em.close();
        emf.close();

        lbl_kategoriterbanyak.setText(String.valueOf(totalktgint));;

    }

    private void totalbukubanyak() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT COUNT(pb.kodepinjamb) AS jumlah_peminjaman FROM Buku b LEFT JOIN Peminjamanbuku pb ON b.kodebuku = pb.kodebuku GROUP BY b.kodebuku ORDER BY jumlah_peminjaman DESC LIMIT 1");
        Long totalBuku = (Long) query.getSingleResult();
        Integer totalBukuInt = totalBuku.intValue();
        em.getTransaction().commit();

        em.close();
        emf.close();

        lbl_bukuterbanyak.setText(String.valueOf(totalBukuInt));;

    }

    private void totalskripsibanyak() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT COUNT(ps.kodepinjams) AS jumlah_peminjaman FROM Skripsi s LEFT JOIN Peminjamanskripsi ps ON s.kodeskripsi = ps.kodeskripsi GROUP BY s.kodeskripsi ORDER BY jumlah_peminjaman DESC LIMIT 1");
        Long totalSkripsi = (Long) query.getSingleResult();
        Integer totalSkripsiInt = totalSkripsi.intValue();

        em.getTransaction().commit();

        em.close();
        emf.close();

        lbl_skripsiterbanyak.setText(String.valueOf(totalSkripsiInt));;

    }

    private void judulkategoribanyak() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT b.kategori FROM Buku b LEFT JOIN Peminjamanbuku pb ON b.kodebuku = pb.kodebuku GROUP BY b.kategori ORDER BY COUNT(pb.kodepinjamb) DESC LIMIT 1;");
        String judulktg = (String) query.getSingleResult();

        em.getTransaction().commit();

        em.close();
        emf.close();

        jLabeljudulkategori.setText(String.valueOf(judulktg));

    }

    private void judulskripsibanyak() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT s.judulskripsi FROM Skripsi s LEFT JOIN Peminjamanskripsi ps ON s.kodeskripsi = ps.kodeskripsi GROUP BY s.judulskripsi ORDER BY COUNT(ps.kodepinjams) DESC LIMIT 1;");
        String judulskripsi = (String) query.getSingleResult();

        em.getTransaction().commit();

        em.close();
        emf.close();

        jLabeljudulskripsi.setText(String.valueOf(judulskripsi));

    }

    private void judulbukubanyak() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createNativeQuery("SELECT b.judulbuku FROM Buku b LEFT JOIN Peminjamanbuku pb ON b.kodebuku = pb.kodebuku GROUP BY b.judulbuku ORDER BY COUNT(pb.kodepinjamb) DESC LIMIT 1;");
        String judulbuku = (String) query.getSingleResult();

        em.getTransaction().commit();

        em.close();
        emf.close();

        jLabeljudulbuku.setText(String.valueOf(judulbuku));;

    }
}
