package net.tbscg.myshop.dao.model;

import java.util.Date;

/**
 * Created by Mela on 2015-12-08.
 */
public class Order { // jest to to co sprzedalismy do tej pory - czyli chcemy wiedziec co, komu,kiedy sprzedalismy

    private Product product; //jaki produkt mamy
    private Customer customer; //komu sprzedajemy
    private Integer quantity; // i ile
    private Date date; // i data - kiedy to sie fsktycznie wydarzyło

    public Order(Product product, Customer customer, Integer quantity, Date date){
        this.product=product;
        this.customer=customer;
        this.quantity=quantity;
        this.date=date;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (product != null ? !product.equals(order.product) : order.product != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        return !(date != null ? !date.equals(order.date) : order.date != null);
    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
