/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.Purchase;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Olaa
 */
@Component
@Stateless
public class PurchaseFacade extends AbstractFacade<Purchase> implements com.outbootle.dao.PurchaseFacadeRemote {
    @PersistenceContext(unitName = "ProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
      System.out.println("Hahahaha!");
        return em;
    }

    public PurchaseFacade() {
        super(Purchase.class);
    }
    
}
