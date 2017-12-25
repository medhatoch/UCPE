/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Enfant;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import service.EnfantFacade;

/**
 *
 * @author medam
 */
@Named(value = "enfantController")
@SessionScoped
public class EnfantController implements Serializable {
    
    
    
    private Enfant selected;
    @EJB
    private EnfantFacade ejbFacade;
    
    private List<Enfant> enfants = new ArrayList<>();

    public Enfant getSelected() {
        return selected;
    }

    public void setSelected(Enfant selected) {
        this.selected = selected;
    }

    public EnfantFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(EnfantFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public List<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Enfant> enfants) {
        this.enfants = enfants;
    }
    
    

    /**
     * Creates a new instance of EnfantController
     */
    public EnfantController() {
    }
    
}
