package bookingsystem;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {

    List<Food> list = new ArrayList<>();
    
    public FoodMenu(){
        
    }

    public List<Food> getList() {
        return list;
    }

    public void addFoodItem(Food food) {
        list.add(food);
    }

    public Food getFoodAtIndex(int i) {
        return list.get(i);
    }
    
    public int getListSize(){
        return list.size();
    }
    
    

}
