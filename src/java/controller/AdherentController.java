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
import java.util.ArrayList;
import java.util.List;
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
    @EJB
    private AdherentFacade ejbFacade;
    @EJB
    private EnfantFacade enfantFacade;
    
    private List<Enfant> enfants = new ArrayList<>();
    
     private String text = "0" ;
 
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
        selected.setNumEnfant(Integer.parseInt(text));
        ejbFacade.create(selected);
        return "/adherent/Confirmation";
    }
    
    public String createA(){
        ejbFacade.createAdherent(selected, enfants);
        return null;
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
    
    
    /**
     * Creates a new instance of AdherentController
     */
    public AdherentController() {
    }
    
}
