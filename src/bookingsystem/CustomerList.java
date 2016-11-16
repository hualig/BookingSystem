/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class CustomerList {
    
    private TreeMap<Integer, Customer> customerList;
    
    public CustomerList() {
        customerList = new TreeMap<>();
    }
    
    public Map<Integer, Customer> getCustomerList() {
        
        return customerList;
    }    
    
    public void addCustomer(Customer newcustomer) {
        
        customerList.put(newcustomer.getSeatNumber(), newcustomer);
    }
    
    public void delCustomer(int seatNumber) {
        
        customerList.remove(seatNumber);
        
    }
    
    public Customer search(String name) throws CustomerNotFoundException {
        
        for(Customer next: customerList.values()){
            if(next.getName().equalsIgnoreCase(name)) {
                return next;
            }    
        }
        
        throw new CustomerNotFoundException();
        
    }
    
}
