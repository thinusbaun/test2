package com.outbootle.model;

import com.outbootle.model.ProductBase;
import com.outbootle.model.PurchaseItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, PurchaseItem> idPurchaseItem;
    public static volatile SingularAttribute<Product, ProductBase> idProductBase;

}