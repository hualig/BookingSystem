/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Customer {
    
    private String name;
    private String iD;
    private double totalPrice;
    private double ticketPrice;
    private double foodPrice;
    private List<Food> myFoodList = new ArrayList<>();
    private Integer seatNumber = 0;

    public Customer(){
        
    }
    
    public Customer(String name, String iD) {
        this.name = name;
        this.iD = iD;
        
    }
    
    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public double getTotalPrice() {
        
        totalPrice = ticketPrice + foodPrice;
        return totalPrice;
    }
    
    public double getTicketPrice(){
        
        return ticketPrice;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public List<Food> getMyFoodList() {
        return myFoodList;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }
    
    public void addToMyFoodList(Food food) {
        
        myFoodList.add(food);
        foodPrice +=food.getPrice();
        
    }
    
    public void assignSeatNumber(Seat seat) {
        
        seatNumber = seat.getNumber();
        ticketPrice = seat.getPrice();
        
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    
    
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", iD=" + iD + ", totalPrice=" + getTotalPrice() + ", ticketPrice=" + getTicketPrice() + ", foodPrice=" + 
                getFoodPrice() + ", myFoodList=" + getMyFoodList() + ", seatNumber=" + getSeatNumber() + '}' + "\n";
    }
    
    
}
