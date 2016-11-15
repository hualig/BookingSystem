package bookingsystem;

public class FoodInit {

    FoodEconomyClassMenu economyClassMenu;
    FoodFirstClassMenu firstClassMenu;

    Food lasagne;
    Food pasta = new Food("Pasta Carbonara", 89.90);
    Food meatballs = new Food("Spaghetti with meatballs", 102.99);
    Food bbqHamburger = new Food("BBQ hamburger", 115.90);
    Food regHamburger = new Food("Hamburger", 79.99);
    Food english = new Food("English breakfast", 78.90);
    Food kebab = new Food("Kebab", 49.09);

    Food firstClassLasagne = new Food("Lasagna", 198.75);
    Food firstClassPasta = new Food("Pasta Carbonara", 189.90);
    Food firstClassMeatballs = new Food("Spaghetti with meatballs", 202.99);
    Food firstClassBbqHamburger = new Food("BBQ hamburger", 215.90);
    Food firstClassRegHamburger = new Food("Hamburger", 179.99);
    Food firstClassEnglish = new Food("English breakfast", 178.90);
    Food firstClassKebab = new Food("Kebab", 149.09);

    public FoodInit() {
        economyClassMenu = new FoodEconomyClassMenu();
        firstClassMenu = new FoodFirstClassMenu();
        lasagne = new Food("Lasagna", 98.75);
        
    }

    public void runInit() {
        economyClassMenu.addFoodItem(lasagne);
        economyClassMenu.addFoodItem(pasta);
        economyClassMenu.addFoodItem(meatballs);
        economyClassMenu.addFoodItem(bbqHamburger);
        economyClassMenu.addFoodItem(regHamburger);
        economyClassMenu.addFoodItem(english);
        economyClassMenu.addFoodItem(kebab);

        firstClassMenu.addFoodItem(firstClassLasagne);
        firstClassMenu.addFoodItem(firstClassPasta);
        firstClassMenu.addFoodItem(firstClassMeatballs);
        firstClassMenu.addFoodItem(firstClassBbqHamburger);
        firstClassMenu.addFoodItem(firstClassRegHamburger);
        firstClassMenu.addFoodItem(firstClassEnglish);
        firstClassMenu.addFoodItem(firstClassKebab);
    }

}
