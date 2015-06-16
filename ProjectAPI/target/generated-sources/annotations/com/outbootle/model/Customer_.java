package com.outbootle.model;

import com.outbootle.model.Purchase;
import com.outbootle.model.TypeOfAdministrator;
import com.outbootle.model.TypeOfCustomer;
import com.outbootle.model.TypeOfLevelOfCustomer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile ListAttribute<Customer, Purchase> purchaseList;
    public static volatile SingularAttribute<Customer, TypeOfCustomer> idTypeOfCustomer;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, TypeOfLevelOfCustomer> idTypeOfLevelOfCustomer;
    public static volatile SingularAttribute<Customer, String> surname;
    public static volatile SingularAttribute<Customer, String> login;
    public static volatile SingularAttribute<Customer, TypeOfAdministrator> idTypeOfAdministrator;
    public static volatile SingularAttribute<Customer, String> password;

}