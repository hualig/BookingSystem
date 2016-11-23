package bookingsystem;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mikael Tolfström
 */
public class FoodMenu {

    
    List<Food> list = new ArrayList<>();
    double foodPrice;

    public List<Food> getList() {
        return list;
    }

    public void addFoodItem(Food food) {
        list.add(food);
    }

    public Food getFoodAtIndex(int i) {
        return list.get(i);
    }

    public int getListSize() {
        return list.size();
    }

    public double calculateTotalPrice() {
        for (Food next : list) {
            foodPrice += next.price;
        }
        return foodPrice;
    }
    
   

    public Food findFoodByName(String name) {
        
        Food foodToLookFor = new Food(name, 0.0);
        int i = list.indexOf(foodToLookFor);
        
        if (i<0){
            //System.out.println("No food found");
            
        }
        return list.get(i);
        
    }

}
