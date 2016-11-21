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
    private SeatType seatType;
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

    public void setPriceFC(double price) {
        this.price = price;
    }
    
    public void setPriceEC(double price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
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
        return "seatNumber=" + seatNumber + ", seatType=" + seatType + ", price=" 
                + price + "SEK, customer=" + customer + ", total price=" 
                + getTotalPrice() + "SEK \n";
    }
    
    
}
