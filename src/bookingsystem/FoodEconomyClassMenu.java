package bookingsystem;

import java.util.ArrayList;
import java.util.List;

public class FoodEconomyClassMenu extends FoodMenu {

    List<Food> foodList;

    public FoodEconomyClassMenu() {
        foodList = new ArrayList<>();
    }

    @Override
    public void addFoodItem(Food food) {
        foodList.add(food);
    }

    @Override
    public int getListSize() {
        return foodList.size();
    }

    @Override
    public Food getFoodAtIndex(int i) {
        return foodList.get(i);
    }

    @Override
    public List<Food> getList() {
        return foodList;
    }

}
