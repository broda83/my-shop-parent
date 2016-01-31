package net.tbscg.myshop.service;

import net.tbscg.myshop.dao.model.Customer;
import net.tbscg.myshop.dao.model.Order;
import net.tbscg.myshop.dao.model.Product;

import java.util.List;

/**
 * Created by rbrodowski on 2016-01-21.
 */
public interface IStorageService {



    Customer addCustomer(Customer customer);
    List <Customer> listCustomers();
    Customer getCustomerByID(String id);
    void deleteCustomer(Customer customer);

    Product addProduct(Product product);
    List<Product> listProducts();
    Product getProductByID(long id);
    void deleteProduct(Product product);

    Order addOrder(Order order);
    List<Order> listOrders();
    Order getOrderByCustomer(Customer customer);
    void deleteOrder(Order order);

}
