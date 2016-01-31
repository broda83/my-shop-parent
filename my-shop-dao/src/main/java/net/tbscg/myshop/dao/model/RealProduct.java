package net.tbscg.myshop.dao.model;

import java.math.BigDecimal;

/**
 * Created by Mela on 2015-12-08.
 */
public class RealProduct extends Product {//RP będzie reprezentowało kazdy fizyczny produkt który mamy w sklepie

    private int quantity; // Quantity jest po to zeby wiedziec ile mamy na satnie produktów w chwili obecnej


    public RealProduct(String name, BigDecimal price, String description) {
        super(name, price, description);
    }
}
