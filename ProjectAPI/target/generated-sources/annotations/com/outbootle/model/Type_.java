package com.outbootle.model;

import com.outbootle.model.ProductBase;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(Type.class)
public class Type_ { 

    public static volatile SingularAttribute<Type, Integer> id;
    public static volatile SingularAttribute<Type, String> name;
    public static volatile ListAttribute<Type, ProductBase> productBaseList;

}