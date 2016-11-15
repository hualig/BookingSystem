package airplane;

public class AirplaneFoodTestMain {
    
    
    
    

    public static void main(String[] args) {
        
        Food lasagne = new Food("Lasagna", 98.75);
        Food pasta = new Food("Pasta Carbonara", 89.90);
        Food meatballs = new Food("Spaghetti with meatballs", 102.99);
        Food bbqHamburger = new Food("BBQ hamburger", 115.90);
        Food regHamburger = new Food("Hamburger", 79.99);
        Food english = new Food("English breakfast", 78.90);
        Food kebab = new Food("Kebab", 49.09);
        
        Food richLasagne = new Food("Lasagna", 198.75);
        Food richPasta = new Food("Pasta Carbonara", 189.90);
        Food richMeatballs = new Food("Spaghetti with meatballs", 202.99);
        Food richBbqHamburger = new Food("BBQ hamburger", 215.90);
        Food richRegHamburger = new Food("Hamburger", 179.99);
        Food richEnglish = new Food("English breakfast", 178.90);
        Food richKebab = new Food("Kebab", 149.09);
        
        FoodEconomyClassMenu economy = new FoodEconomyClassMenu();
        FoodFirstClassMenu first = new FoodFirstClassMenu();
        
        economy.addFoodItem(lasagne);
        economy.addFoodItem(pasta);
        economy.addFoodItem(meatballs);
        economy.addFoodItem(bbqHamburger);
        economy.addFoodItem(regHamburger);
        economy.addFoodItem(english);
        economy.addFoodItem(kebab);
        
        first.addFoodItem(lasagne);
        first.addFoodItem(pasta);
        first.addFoodItem(meatballs);
        first.addFoodItem(bbqHamburger);
        first.addFoodItem(regHamburger);
        first.addFoodItem(english);
        first.addFoodItem(kebab);
        
        
        
        
        
        
        
        
        
    }
    
}
