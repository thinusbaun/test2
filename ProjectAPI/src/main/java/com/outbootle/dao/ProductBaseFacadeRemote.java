/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.ProductBase;
import java.util.List;
import javax.ejb.Remote;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Olaa
 */
@Component
@Transactional
@Remote
public interface ProductBaseFacadeRemote {

    void create(ProductBase productBase);

    void edit(ProductBase productBase);

    void remove(ProductBase productBase);

    ProductBase find(Object id);

    List<ProductBase> findAll();

    List<ProductBase> findRange(int[] range);

    int count();
    
}
