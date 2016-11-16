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
public class FoodMenuTestMain {

    static Customer customer1 = new Customer();
    
    
//    static FoodMenu foodmenu = new FoodMenu();
//    static Food food1 = new Food("Lasagne", 79.99);

    static Stub_CustomerMenuPresentation run = new Stub_CustomerMenuPresentation();
    FoodInit runFoodInit = new FoodInit();

    public static void main(String[] args) {
//        foodmenu.addFoodItem(food1);
//        Food foundFood = foodmenu.findFoodByName("Lasagne");
//        System.out.println(foundFood);

        run.doStuff();
    }

}
