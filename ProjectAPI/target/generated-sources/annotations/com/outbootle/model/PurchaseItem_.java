package com.outbootle.model;

import com.outbootle.model.Product;
import com.outbootle.model.PurchaseItem;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-10T18:13:34")
@StaticMetamodel(PurchaseItem.class)
public class PurchaseItem_ { 

    public static volatile SingularAttribute<PurchaseItem, Integer> id;
    public static volatile ListAttribute<PurchaseItem, PurchaseItem> purchaseItemList;
    public static volatile ListAttribute<PurchaseItem, Product> productList;
    public static volatile SingularAttribute<PurchaseItem, PurchaseItem> idPurchase;
    public static volatile SingularAttribute<PurchaseItem, BigInteger> quantity;

}