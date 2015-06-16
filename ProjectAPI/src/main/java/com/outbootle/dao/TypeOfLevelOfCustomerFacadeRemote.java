/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.TypeOfLevelOfCustomer;
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
public interface TypeOfLevelOfCustomerFacadeRemote {

    void create(TypeOfLevelOfCustomer typeOfLevelOfCustomer);

    void edit(TypeOfLevelOfCustomer typeOfLevelOfCustomer);

    void remove(TypeOfLevelOfCustomer typeOfLevelOfCustomer);

    TypeOfLevelOfCustomer find(Object id);

    List<TypeOfLevelOfCustomer> findAll();

    List<TypeOfLevelOfCustomer> findRange(int[] range);

    int count();
    
}
