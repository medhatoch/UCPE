/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Enfant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author medam
 */
@Stateless
public class EnfantFacade extends AbstractFacade<Enfant> {

    @PersistenceContext(unitName = "UCPEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnfantFacade() {
        super(Enfant.class);
    }
    
}
