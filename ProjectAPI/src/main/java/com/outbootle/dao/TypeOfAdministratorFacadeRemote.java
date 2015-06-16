/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.TypeOfAdministrator;
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
public interface TypeOfAdministratorFacadeRemote {

    void create(TypeOfAdministrator typeOfAdministrator);

    void edit(TypeOfAdministrator typeOfAdministrator);

    void remove(TypeOfAdministrator typeOfAdministrator);

    TypeOfAdministrator find(Object id);

    List<TypeOfAdministrator> findAll();

    List<TypeOfAdministrator> findRange(int[] range);

    int count();
    
}
