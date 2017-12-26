/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author medam
 */
@Entity
public class Adherent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String prenom;
    private String nom;
    private String email;
    private int tel;
    private String prenomAutreParent;
    private String nomAutreParent;
    private String emailAutreParent;
    private String telAutreParent;
    
    @OneToMany
    private List<Enfant> enfants;

    public List<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Enfant> enfants) {
        this.enfants = enfants;
    }
    
    
    
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPrenomAutreParent() {
        return prenomAutreParent;
    }

    public void setPrenomAutreParent(String prenomAutreParent) {
        this.prenomAutreParent = prenomAutreParent;
    }

    public String getNomAutreParent() {
        return nomAutreParent;
    }

    public void setNomAutreParent(String nomAutreParent) {
        this.nomAutreParent = nomAutreParent;
    }

    public String getEmailAutreParent() {
        return emailAutreParent;
    }

    public void setEmailAutreParent(String emailAutreParent) {
        this.emailAutreParent = emailAutreParent;
    }

    public String getTelAutreParent() {
        return telAutreParent;
    }

    public void setTelAutreParent(String telAutreParent) {
        this.telAutreParent = telAutreParent;
    }

 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adherent)) {
            return false;
        }
        Adherent other = (Adherent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Adherent[ id=" + id + " ]";
    }
    
}
