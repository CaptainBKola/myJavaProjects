package BankProject;

import java.util.ArrayList;
import java.util.List;

public class BankDB {
    private ArrayList<Customer> customers;


    public void save(Customer customer){
        customers.add(customer);
    }

    public void delete(Customer customer){
        customers.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
