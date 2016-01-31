package net.tbscg.myshop.dao.model;

/**
 * Created by Mela on 2015-12-08.
 */
public class Customer {

    private String id;
    private String name;
    private String address;

    public Customer(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdress(String adress) {
        this.address = adress;
    }

    @Override
    public String toString() {//return super.toString();
        return "id: " + id + "name: " + name + "adress: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return !(id != null ? !id.equals(customer.id) : customer.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}


