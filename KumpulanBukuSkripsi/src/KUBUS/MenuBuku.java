/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KUBUS;

import Persistance.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lmao
 */
    public class MenuBuku extends javax.swing.JPanel {

        private javax.swing.JTable jTableBuku;

        private void tampilanBuku() {
            DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
            model.setRowCount(0);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> stud = cq.from(Buku.class);
            cq.select(stud.get("kodeBuku"));

            CriteriaQuery<Buku> select = cq.select(stud);
            TypedQuery<Buku> q = em.createQuery(select);
            List<Buku> list = q.getResultList();

            for (Buku data : list) {
                Object[] baris = new Object[6];
                baris[0] = data.getKodebuku();
                baris[1] = data.getJudulbuku();
                baris[2] = data.getPengarang();
                baris[3] = data.getPenerbit();
                baris[4] = data.getTahunterbit();
                baris[5] = data.getHalaman();
                baris[6] = data.getIsbn();

                model.addRow(baris);
            }

            jTableBuku.setModel(model);

            em.getTransaction().commit();
            em.close();
            emf.close();

        }
    }