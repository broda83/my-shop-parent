package net.tbscg.myshop;

import net.tbscg.myshop.dao.model.Customer;
import net.tbscg.myshop.service.StorageService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mela on 2016-01-30.
 */
public class StorageServiceTest {
    //jezlei tworzymy test jednostkowy to musimy spełnic pewne kryteria:
    // - taki test musi byc powtarzalny, inne klasy nie mogą wpływac na testowalną klasę
    // - musimy określić przewidywalny stan naszego obiektu przed rozpoczęciem testów
    // czyli jezeli mamy test który dodaje customera to po zakonczeniu musi go usunąc
    // zeby ten customer nie wpłynął na resztę testów

    private StorageService testedObject;

    @Before
    public void setup(){ // dzieki metodzie before mamy gwarancje ze obiekt przed uruchomieniem kazdej metody jest taki sam
        this.testedObject = new StorageService();
    }

    @Test
    public void testAdd() throws Exception{
        Customer customer1 = new Customer("customer1", "address1");
        testedObject.addCustomer(customer1);
        //nasza lista jest pusta wiec przez tą metodę dodajemy customera do listy
        // pierwszy warunek to sprawdzamy czy customer sie dodał
        // drugi warunek: czy customer który się w liscie znajduje to jest ten który dodaliśmy
        // trzeci warunek: nadawalismy id customerowi, wiec trzeba sprawdzic czy to id sie nadało
        assertEquals(1, testedObject.listCustomers().size()); //a wiec spodziewamy się ze bedzie jeden element w naszej lisice
        //a pozniej musimy mu podac ile faktycznie tych elementow jest

        assertEquals(customer1.getName(), testedObject.listCustomers().get(0).getName());
        System.out.println(customer1.getName());
        System.out.println(testedObject.listCustomers().get(0).getName());

        assertEquals("1", testedObject.listCustomers().get(0).getId());
        System.out.println("1");
        System.out.println(testedObject.listCustomers().get(0).getId());

    }

    @Test
    public void testList(){
       Customer customer1 = new Customer("customer1", "address1");
        testedObject.listCustomers().add(customer1);
        assertEquals(1,testedObject.listCustomers().size());
        /*System.out.println(1);
        System.out.println(testedObject.listCustomers().size());*/
    }

    @Test
    public void testGetCustomerByID(){
        Customer customer1 = new Customer("customer1", "address1");
        testedObject.addCustomer(customer1);
        testedObject.getCustomerByID("1");
        assertEquals("1", testedObject.listCustomers().get(0).getId());
    }

    @Test
    public void testDeleteCustomer(){
        Customer customer1 = new Customer("customer1", "address1");
        testedObject.addCustomer(customer1);
        testedObject.deleteCustomer(customer1);
        assertEquals(0,testedObject.listCustomers().size());


    }



}
