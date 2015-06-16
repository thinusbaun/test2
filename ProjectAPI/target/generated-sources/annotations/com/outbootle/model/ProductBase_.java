package com.outbootle.model;

import com.outbootle.model.Product;
import com.outbootle.model.Type;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(ProductBase.class)
public class ProductBase_ { 

    public static volatile SingularAttribute<ProductBase, Integer> id;
    public static volatile SingularAttribute<ProductBase, Type> idType;
    public static volatile SingularAttribute<ProductBase, Double> price;
    public static volatile ListAttribute<ProductBase, Product> productList;
    public static volatile SingularAttribute<ProductBase, String> name;

}