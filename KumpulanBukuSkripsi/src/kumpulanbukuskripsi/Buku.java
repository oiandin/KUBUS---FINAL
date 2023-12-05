/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kumpulanbukuskripsi;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "buku")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.findByKodeBuku", query = "SELECT b FROM Buku b WHERE b.kodeBuku = :kodeBuku"),
    @NamedQuery(name = "Buku.findByJudulBuku", query = "SELECT b FROM Buku b WHERE b.judulBuku = :judulBuku"),
    @NamedQuery(name = "Buku.findBySubJudul", query = "SELECT b FROM Buku b WHERE b.subJudul = :subJudul"),
    @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang"),
    @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "Buku.findByTahunTerbit", query = "SELECT b FROM Buku b WHERE b.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Buku.findByJumlahHalaman", query = "SELECT b FROM Buku b WHERE b.jumlahHalaman = :jumlahHalaman"),
    @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kode_buku")
    private Integer kodeBuku;
    @Basic(optional = false)
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "sub_judul")
    private String subJudul;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "tahun_terbit")
    private int tahunTerbit;
    @Basic(optional = false)
    @Column(name = "jumlah_halaman")
    private int jumlahHalaman;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;

    public Buku() {
    }

    public Buku(Integer kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public Buku(Integer kodeBuku, String judulBuku, String pengarang, String penerbit, int tahunTerbit, int jumlahHalaman, String isbn) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.isbn = isbn;
    }

    public Integer getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(Integer kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeBuku != null ? kodeBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.kodeBuku == null && other.kodeBuku != null) || (this.kodeBuku != null && !this.kodeBuku.equals(other.kodeBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kumpulanbukuskripsi.Buku[ kodeBuku=" + kodeBuku + " ]";
    }

    void add(ArrayList<Data> bukuData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
