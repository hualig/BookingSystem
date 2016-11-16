package bookingsystem;

public class FoodInit {

     FoodMenu economyClassMenu;
     FoodMenu firstClassMenu;

    static Food lasagne;
    static Food pasta = new Food("Pasta Carbonara", 89.90);
    static Food meatballs = new Food("Spaghetti with meatballs", 102.99);
    static Food bbqHamburger = new Food("BBQ hamburger", 115.90);
    static Food regHamburger = new Food("Hamburger", 79.99);
    static Food english = new Food("English breakfast", 78.90);
    static Food kebab = new Food("Kebab"   , 49.09);

    static Food firstClassLasagne = new Food("Lasagna", 198.75);
    static Food firstClassPasta = new Food("Pasta Carbonara", 189.90);
    static Food firstClassMeatballs = new Food("Spaghetti with meatballs", 202.99);
    static Food firstClassBbqHamburger = new Food("BBQ hamburger", 215.90);
    static Food firstClassRegHamburger = new Food("Hamburger", 179.99);
    static Food firstClassEnglish = new Food("English breakfast", 178.90);
    static Food firstClassKebab = new Food("Kebab", 149.09);

    public FoodInit() {
        economyClassMenu = new FoodMenu();
        firstClassMenu = new FoodMenu();
        lasagne = new Food("Lasagna", 98.75);
        
    }

    public  void runInit() {
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
