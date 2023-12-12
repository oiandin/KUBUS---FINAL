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
@Table(name = "peminjamanskripsi")
@NamedQueries({
    @NamedQuery(name = "Peminjamanskripsi.findAll", query = "SELECT p FROM Peminjamanskripsi p"),
    @NamedQuery(name = "Peminjamanskripsi.findByKodepinjams", query = "SELECT p FROM Peminjamanskripsi p WHERE p.kodepinjams = :kodepinjams"),
    @NamedQuery(name = "Peminjamanskripsi.findByNama", query = "SELECT p FROM Peminjamanskripsi p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjamanskripsi.findByNim", query = "SELECT p FROM Peminjamanskripsi p WHERE p.nim = :nim"),
    @NamedQuery(name = "Peminjamanskripsi.findByAngkatan", query = "SELECT p FROM Peminjamanskripsi p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjamanskripsi.findByTglpinjam", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tglpinjam = :tglpinjam"),
    @NamedQuery(name = "Peminjamanskripsi.findByTglbalik", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tglbalik = :tglbalik"),
    @NamedQuery(name = "Peminjamanskripsi.findByStatus", query = "SELECT p FROM Peminjamanskripsi p WHERE p.status = :status")})
public class Peminjamanskripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodepinjams")
    private String kodepinjams;
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
    @JoinColumn(name = "kodeskripsi", referencedColumnName = "kodeskripsi")
    @ManyToOne(optional = false)
    private Skripsi kodeskripsi;

    public Peminjamanskripsi() {
    }

    public Peminjamanskripsi(String kodepinjams) {
        this.kodepinjams = kodepinjams;
    }

    public String getKodepinjams() {
        return kodepinjams;
    }

    public void setKodepinjams(String kodepinjams) {
        this.kodepinjams = kodepinjams;
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

    public Skripsi getKodeskripsi() {
        return kodeskripsi;
    }

    public void setKodeskripsi(Skripsi kodeskripsi) {
        this.kodeskripsi = kodeskripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodepinjams != null ? kodepinjams.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjamanskripsi)) {
            return false;
        }
        Peminjamanskripsi other = (Peminjamanskripsi) object;
        if ((this.kodepinjams == null && other.kodepinjams != null) || (this.kodepinjams != null && !this.kodepinjams.equals(other.kodepinjams))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistance.Peminjamanskripsi[ kodepinjams=" + kodepinjams + " ]";
    }
    
}
