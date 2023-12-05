/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kumpulanbukuskripsi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author lmao
 */
@Entity
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findByKodeSkripsi", query = "SELECT s FROM Skripsi s WHERE s.kodeSkripsi = :kodeSkripsi"),
    @NamedQuery(name = "Skripsi.findByJudulSkripsi", query = "SELECT s FROM Skripsi s WHERE s.judulSkripsi = :judulSkripsi"),
    @NamedQuery(name = "Skripsi.findByPengarang", query = "SELECT s FROM Skripsi s WHERE s.pengarang = :pengarang"),
    @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun"),
    @NamedQuery(name = "Skripsi.findByJumlahHalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahHalaman = :jumlahHalaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kode_skripsi")
    private Integer kodeSkripsi;
    @Column(name = "judul_skripsi")
    private String judulSkripsi;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "tahun")
    private Integer tahun;
    @Column(name = "jumlah_halaman")
    private Integer jumlahHalaman;

    public Skripsi() {
    }

    public Skripsi(Integer kodeSkripsi) {
        this.kodeSkripsi = kodeSkripsi;
    }

    public Integer getKodeSkripsi() {
        return kodeSkripsi;
    }

    public void setKodeSkripsi(Integer kodeSkripsi) {
        this.kodeSkripsi = kodeSkripsi;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Integer getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(Integer jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeSkripsi != null ? kodeSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.kodeSkripsi == null && other.kodeSkripsi != null) || (this.kodeSkripsi != null && !this.kodeSkripsi.equals(other.kodeSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kumpulanbukuskripsi.Skripsi[ kodeSkripsi=" + kodeSkripsi + " ]";
    }
    
}
