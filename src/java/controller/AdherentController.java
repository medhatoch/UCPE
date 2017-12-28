/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Adherent;
import bean.Enfant;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import service.AdherentFacade;
import service.EnfantFacade;

/**
 *
 * @author medam
 */
@Named(value = "adherentController")
@SessionScoped
public class AdherentController implements Serializable {

    
    
    private Adherent selected;
    private Enfant enfant;
    @EJB
    private AdherentFacade ejbFacade;
    @EJB
    private EnfantFacade enfantFacade;
    
    
    
    private String text = "0" ;
    
    private int numEnf = Integer.parseInt(text);
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    
     
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
    public String createAdherent(){
        ejbFacade.create(selected);
        return "/adherent/Confirmation";
    }
    
    public void createEnf(){
        enfant.setAdherent(selected);
        Enfant e=new Enfant();
        e.setAdherent(enfant.getAdherent());
        e.setDateDeNaissance(enfant.getDateDeNaissance());
        e.setNom(enfant.getNom());
        e.setPrenom(enfant.getPrenom());
        e.setClasse(e.getClasse());
        enfantFacade.create(e);
        enfant=new Enfant();
    }
    
    public int getNumEnf() {
        return numEnf;
    }

    public void setNumEnf(int numEnf) {
        this.numEnf = numEnf;
    }
    
    

    public Adherent getSelected() {
        if(selected == null){
            selected = new Adherent();
        }
        return selected;
    }

    public void setSelected(Adherent selected) {
        this.selected = selected;
    }

    public AdherentFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(AdherentFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public Enfant getEnfant() {
        if(enfant == null){
            enfant = new Enfant();
        }
        return enfant;
    }

    public void setEnfant(Enfant enfant) {
        this.enfant = enfant;
    }

    public EnfantFacade getEnfantFacade() {
        return enfantFacade;
    }

    public void setEnfantFacade(EnfantFacade enfantFacade) {
        this.enfantFacade = enfantFacade;
    }
    
    
    
    
    /**
     * Creates a new instance of AdherentController
     */
    public AdherentController() {
    }
    
}
