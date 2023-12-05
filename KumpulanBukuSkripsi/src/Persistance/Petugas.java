/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Petugas.findByUsername", query = "SELECT p FROM Petugas p WHERE p.username = :username"),
    @NamedQuery(name = "Petugas.findByFullname", query = "SELECT p FROM Petugas p WHERE p.fullname = :fullname"),
    @NamedQuery(name = "Petugas.findByPassword", query = "SELECT p FROM Petugas p WHERE p.password = :password")})
public class Petugas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Column(name = "fullname")
    private String fullname;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Petugas() {
    }

    public Petugas(String username) {
        this.username = username;
    }

    public Petugas(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Petugas)) {
            return false;
        }
        Petugas other = (Petugas) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistance.Petugas[ username=" + username + " ]";
    }
    
}
