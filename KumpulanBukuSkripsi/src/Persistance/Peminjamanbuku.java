/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lmao
 */
@Entity
@Table(name = "peminjamanbuku")
@NamedQueries({
    @NamedQuery(name = "Peminjamanbuku.findAll", query = "SELECT p FROM Peminjamanbuku p"),
    @NamedQuery(name = "Peminjamanbuku.findByKodepinjamb", query = "SELECT p FROM Peminjamanbuku p WHERE p.kodepinjamb = :kodepinjamb"),
    @NamedQuery(name = "Peminjamanbuku.findByNama", query = "SELECT p FROM Peminjamanbuku p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjamanbuku.findByNim", query = "SELECT p FROM Peminjamanbuku p WHERE p.nim = :nim"),
    @NamedQuery(name = "Peminjamanbuku.findByAngkatan", query = "SELECT p FROM Peminjamanbuku p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjamanbuku.findByTglpinjam", query = "SELECT p FROM Peminjamanbuku p WHERE p.tglpinjam = :tglpinjam"),
    @NamedQuery(name = "Peminjamanbuku.findByTglbalik", query = "SELECT p FROM Peminjamanbuku p WHERE p.tglbalik = :tglbalik"),
    @NamedQuery(name = "Peminjamanbuku.findByStatus", query = "SELECT p FROM Peminjamanbuku p WHERE p.status = :status")})
public class Peminjamanbuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodepinjamb")
    private String kodepinjamb;
    @Column(name = "nama")
    private String nama;
    @Column(name = "nim")
    private String nim;
    @Column(name = "angkatan")
    private Integer angkatan;
    @Column(name = "tglpinjam")
    @Temporal(TemporalType.DATE)
    private Date tglpinjam;
    @Column(name = "tglbalik")
    @Temporal(TemporalType.DATE)
    private Date tglbalik;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "kodebuku", referencedColumnName = "kodebuku")
    @ManyToOne(optional = false)
    private Buku kodebuku;

    public Peminjamanbuku() {
    }

    public Peminjamanbuku(String kodepinjamb) {
        this.kodepinjamb = kodepinjamb;
    }

    public String getKodepinjamb() {
        return kodepinjamb;
    }

    public void setKodepinjamb(String kodepinjamb) {
        this.kodepinjamb = kodepinjamb;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(Integer angkatan) {
        this.angkatan = angkatan;
    }

    public Date getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(Date tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public Date getTglbalik() {
        return tglbalik;
    }

    public void setTglbalik(Date tglbalik) {
        this.tglbalik = tglbalik;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Buku getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(Buku kodebuku) {
        this.kodebuku = kodebuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodepinjamb != null ? kodepinjamb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjamanbuku)) {
            return false;
        }
        Peminjamanbuku other = (Peminjamanbuku) object;
        if ((this.kodepinjamb == null && other.kodepinjamb != null) || (this.kodepinjamb != null && !this.kodepinjamb.equals(other.kodepinjamb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistance.Peminjamanbuku[ kodepinjamb=" + kodepinjamb + " ]";
    }
    
}
