/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

/**
 *
 * @author User
 */
public class Ticket {
    
    private double price;
    private String seatNumber;
    private Section section;
    private Customer customer;
    
    public Ticket(){
        
    }    

    public Ticket(double price, String seatNumber){
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void delCustomer() {
        this.customer = null;
    }
    
    public double getTotalPrice(){
        if(customer == null) {
            return price;
        } else {
        return price + customer.getFoodPrice();
        }
    }

    @Override
    public String toString() {
        return "seatNumber=" + seatNumber + ", section=" + section + ", price=" 
                + price + "SEK, customer=" + customer + ", total price=" 
                + getTotalPrice() + "SEK \n";
    }
    
    
}
