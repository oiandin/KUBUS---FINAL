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
@Table(name = "buku")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.findByKodebuku", query = "SELECT b FROM Buku b WHERE b.kodebuku = :kodebuku"),
    @NamedQuery(name = "Buku.findByJudulbuku", query = "SELECT b FROM Buku b WHERE b.judulbuku = :judulbuku"),
    @NamedQuery(name = "Buku.findBySubjudulbuku", query = "SELECT b FROM Buku b WHERE b.subjudulbuku = :subjudulbuku"),
    @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang"),
    @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "Buku.findByTahunterbit", query = "SELECT b FROM Buku b WHERE b.tahunterbit = :tahunterbit"),
    @NamedQuery(name = "Buku.findByHalaman", query = "SELECT b FROM Buku b WHERE b.halaman = :halaman"),
    @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Buku.findByKategori", query = "SELECT b FROM Buku b WHERE b.kategori = :kategori")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodebuku")
    private String kodebuku;
    @Basic(optional = false)
    @Column(name = "judulbuku")
    private String judulbuku;
    @Column(name = "subjudulbuku")
    private String subjudulbuku;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahunterbit")
    private Integer tahunterbit;
    @Column(name = "halaman")
    private Integer halaman;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "kategori")
    private String kategori;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kodebuku")
    private Collection<Peminjamanbuku> peminjamanbukuCollection;

    public Buku() {
    }

    public Buku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public String getSubjudulbuku() {
        return subjudulbuku;
    }

    public void setSubjudulbuku(String subjudulbuku) {
        this.subjudulbuku = subjudulbuku;
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

    public Integer getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(Integer tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public Integer getHalaman() {
        return halaman;
    }

    public void setHalaman(Integer halaman) {
        this.halaman = halaman;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Collection<Peminjamanbuku> getPeminjamanbukuCollection() {
        return peminjamanbukuCollection;
    }

    public void setPeminjamanbukuCollection(Collection<Peminjamanbuku> peminjamanbukuCollection) {
        this.peminjamanbukuCollection = peminjamanbukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodebuku != null ? kodebuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.kodebuku == null && other.kodebuku != null) || (this.kodebuku != null && !this.kodebuku.equals(other.kodebuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistance.Buku[ kodebuku=" + kodebuku + " ]";
    }
    
}
