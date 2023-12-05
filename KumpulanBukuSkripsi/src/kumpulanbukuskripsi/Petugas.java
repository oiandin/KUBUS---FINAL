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
@Table(name = "petugas")
@NamedQueries({
    @NamedQuery(name = "Petugas.findAll", query = "SELECT p FROM Petugas p"),
    @NamedQuery(name = "Petugas.findByIdPetugas", query = "SELECT p FROM Petugas p WHERE p.idPetugas = :idPetugas"),
    @NamedQuery(name = "Petugas.findByUsername", query = "SELECT p FROM Petugas p WHERE p.username = :username"),
    @NamedQuery(name = "Petugas.findByFullname", query = "SELECT p FROM Petugas p WHERE p.fullname = :fullname"),
    @NamedQuery(name = "Petugas.findByPasswordPetugas", query = "SELECT p FROM Petugas p WHERE p.passwordPetugas = :passwordPetugas")})
public class Petugas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_petugas")
    private Integer idPetugas;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "fullname")
    private String fullname;
    @Basic(optional = false)
    @Column(name = "password_petugas")
    private String passwordPetugas;

    public Petugas() {
    }

    public Petugas(Integer idPetugas) {
        this.idPetugas = idPetugas;
    }

    public Petugas(Integer idPetugas, String username, String fullname, String passwordPetugas) {
        this.idPetugas = idPetugas;
        this.username = username;
        this.fullname = fullname;
        this.passwordPetugas = passwordPetugas;
    }

    public Integer getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(Integer idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPasswordPetugas() {
        return passwordPetugas;
    }

    public void setPasswordPetugas(String passwordPetugas) {
        this.passwordPetugas = passwordPetugas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPetugas != null ? idPetugas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Petugas)) {
            return false;
        }
        Petugas other = (Petugas) object;
        if ((this.idPetugas == null && other.idPetugas != null) || (this.idPetugas != null && !this.idPetugas.equals(other.idPetugas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kumpulanbukuskripsi.Petugas[ idPetugas=" + idPetugas + " ]";
    }
    
}
