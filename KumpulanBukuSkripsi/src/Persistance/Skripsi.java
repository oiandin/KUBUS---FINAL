/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lmao
 */
@Entity
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findByKodeskripsi", query = "SELECT s FROM Skripsi s WHERE s.kodeskripsi = :kodeskripsi"),
    @NamedQuery(name = "Skripsi.findByJudulskripsi", query = "SELECT s FROM Skripsi s WHERE s.judulskripsi = :judulskripsi"),
    @NamedQuery(name = "Skripsi.findByPenulis", query = "SELECT s FROM Skripsi s WHERE s.penulis = :penulis"),
    @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun"),
    @NamedQuery(name = "Skripsi.findByHalaman", query = "SELECT s FROM Skripsi s WHERE s.halaman = :halaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodeskripsi")
    private String kodeskripsi;
    @Basic(optional = false)
    @Column(name = "judulskripsi")
    private String judulskripsi;
    @Basic(optional = false)
    @Column(name = "penulis")
    private String penulis;
    @Column(name = "tahun")
    private Integer tahun;
    @Column(name = "halaman")
    private Integer halaman;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kodeskripsi")
    private Collection<Peminjamanskripsi> peminjamanskripsiCollection;

    public Skripsi() {
    }

    public Skripsi(String kodeskripsi) {
        this.kodeskripsi = kodeskripsi;
    }

    public Skripsi(String kodeskripsi, String judulskripsi, String penulis) {
        this.kodeskripsi = kodeskripsi;
        this.judulskripsi = judulskripsi;
        this.penulis = penulis;
    }

    public String getKodeskripsi() {
        return kodeskripsi;
    }

    public void setKodeskripsi(String kodeskripsi) {
        this.kodeskripsi = kodeskripsi;
    }

    public String getJudulskripsi() {
        return judulskripsi;
    }

    public void setJudulskripsi(String judulskripsi) {
        this.judulskripsi = judulskripsi;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Integer getHalaman() {
        return halaman;
    }

    public void setHalaman(Integer halaman) {
        this.halaman = halaman;
    }

    public Collection<Peminjamanskripsi> getPeminjamanskripsiCollection() {
        return peminjamanskripsiCollection;
    }

    public void setPeminjamanskripsiCollection(Collection<Peminjamanskripsi> peminjamanskripsiCollection) {
        this.peminjamanskripsiCollection = peminjamanskripsiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeskripsi != null ? kodeskripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.kodeskripsi == null && other.kodeskripsi != null) || (this.kodeskripsi != null && !this.kodeskripsi.equals(other.kodeskripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistance.Skripsi[ kodeskripsi=" + kodeskripsi + " ]";
    }
    
}
