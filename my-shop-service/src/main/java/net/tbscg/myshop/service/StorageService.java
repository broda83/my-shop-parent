package net.tbscg.myshop.service;

import net.tbscg.myshop.dao.model.Customer;
import net.tbscg.myshop.dao.model.Order;
import net.tbscg.myshop.dao.model.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rbrodowski on 2016-01-21.
 */
public class StorageService implements IStorageService {

    private List<Customer> customers = new LinkedList<>();
    private long nextCustomerID = 1L;   //zwykły 1 to int ale jak dodajesz L to jest to long

    @Override
    public Customer addCustomer(Customer customer) {
        customer.setId(String.valueOf(nextCustomerID));
        nextCustomerID ++;
        customers.add(customer);
        return customer;
    }
    @Override
    public List<Customer> listCustomers() {   //zwrócic liste customerow
        return customers;
    }
    @Override
    //dupa
    public Customer getCustomerByID(String id) {//przeiteruj się i znajdz naszego customera z id
        for (int i = 0; i < customers.size(); i++) {//index to i
            if (customers.get(i).getId().equals(id)){
                return customers.get(i);
            }
        }
        return null;
    }
    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }

    List<Product> products = new LinkedList<>();
    private long nextProductId=1;

    @Override
    public Product addProduct(Product product){
        nextProductId++;
        products.add(product);
        return product;
    }
    @Override
    public List<Product> listProducts(){
       return products;
        }

    @Override
    public Product getProductByID(long id) {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }


    List<Order> orders = new LinkedList<>();


    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> listOrders() {
        return null;
    }

    @Override
    public Order getOrderByCustomer(Customer customer) {
        return null;
    }

    @Override
    public void deleteOrder(Order order) {

    }



    }

