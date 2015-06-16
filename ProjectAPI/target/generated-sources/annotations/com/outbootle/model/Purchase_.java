package com.outbootle.model;

import com.outbootle.model.Customer;
import com.outbootle.model.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, Integer> id;
    public static volatile SingularAttribute<Purchase, Status> idStatus;
    public static volatile SingularAttribute<Purchase, Customer> idCustomer;
    public static volatile SingularAttribute<Purchase, Date> realisationDate;

}