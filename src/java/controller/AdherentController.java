/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Adherent;
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
    
    
    /**
     * Creates a new instance of AdherentController
     */
    public AdherentController() {
    }
    
}
