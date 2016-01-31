package net.tbscg.myshop.dao.model;

import java.math.BigDecimal;

/**
 * Created by Mela on 2015-12-07.
 */
abstract public class Product{

    private String name;
    private long id;
    private BigDecimal price;
    private String description;

    public Product(String name, BigDecimal price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //gettery i settery zeby mozna było każdą z tych wartości pobrać i ustalić
    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id == product.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
