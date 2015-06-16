/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.TypeOfCustomer;
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
public class TypeOfCustomerFacade extends AbstractFacade<TypeOfCustomer> implements com.outbootle.dao.TypeOfCustomerFacadeRemote {
    @PersistenceContext(unitName = "ProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeOfCustomerFacade() {
        super(TypeOfCustomer.class);
    }
    
}
