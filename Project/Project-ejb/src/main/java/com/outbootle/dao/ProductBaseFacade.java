/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.ProductBase;
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
public class ProductBaseFacade extends AbstractFacade<ProductBase> implements com.outbootle.dao.ProductBaseFacadeRemote {
    @PersistenceContext(unitName = "ProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductBaseFacade() {
        super(ProductBase.class);
    }
    
}
