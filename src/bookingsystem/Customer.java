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
    private double totalPriceOfFood;
    private List<Food> myFoodList = new ArrayList<>();
    private int seatNumber = 0;

    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public double getTotalPrice() {
        
        
        return totalPrice;
    }

    public double getTotalPriceOfFood() {
        return totalPriceOfFood;
    }

    public List<Food> getMyFoodList() {
        return myFoodList;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    
    public void addToMyFoodList(Food food) {
        
        myFoodList.add(food);
        
    }
    
    public void assignSeatNumber(int seatNumber) {
        
        this.seatNumber = seatNumber;
        
    }
}
