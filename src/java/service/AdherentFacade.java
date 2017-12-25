/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Adherent;
import bean.Enfant;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author medam
 */
@Stateless
public class AdherentFacade extends AbstractFacade<Adherent> {

    @PersistenceContext(unitName = "UCPEPU")
    private EntityManager em;

    private EnfantFacade enfantFacade = new EnfantFacade();

    public void createAdherent(Adherent adherent, List<Enfant> enfants) {

        create(adherent);
        for (Enfant enfant : enfants) {
            enfant.setAdherent(adherent);
            enfantFacade.create(enfant);
        }

    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdherentFacade() {
        super(Adherent.class);
    }

}
