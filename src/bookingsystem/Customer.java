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
    private double foodPrice;
    private List<Food> myFoodList = new ArrayList<>();

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
    
    public double getFoodPrice() {
        return foodPrice;
    }

    public List<Food> getMyFoodList() {
        return myFoodList;
    }
    
    public void addToMyFoodList(Food food) {
        
        myFoodList.add(food);
        foodPrice +=food.getPrice();
        
    }
    
    public void removeFromMyFoodList(Food food){
        myFoodList.remove(food);
        foodPrice -=food.getPrice();
    }
    
    public void clearMyFoodList(){
        for (int i = myFoodList.size()-1; i > -1 ; i--) {
            myFoodList.remove(i);
        }
        foodPrice = 0.0;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    
    
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", iD=" + iD + ", foodPrice=" + 
                getFoodPrice() + ", myFoodList=" + getMyFoodList() + '}' + "\n";
    }
    
    
}
