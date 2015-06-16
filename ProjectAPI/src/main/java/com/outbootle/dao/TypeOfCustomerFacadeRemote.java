/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.TypeOfCustomer;
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
public interface TypeOfCustomerFacadeRemote {

    void create(TypeOfCustomer typeOfCustomer);

    void edit(TypeOfCustomer typeOfCustomer);

    void remove(TypeOfCustomer typeOfCustomer);

    TypeOfCustomer find(Object id);

    List<TypeOfCustomer> findAll();

    List<TypeOfCustomer> findRange(int[] range);

    int count();
    
}
