package bookingsystem;
/**
 *
 * @author Mikael Tolfström
 */
public class FoodInit {

    FoodMenu economyClassMenu;
    FoodMenu firstClassMenu;

    static Food lasagne = new Food("Lasagna", 98.75);
    static Food pasta = new Food("Pasta Carbonara", 89.90);
    static Food meatballs = new Food("Spaghetti with meatballs", 102.99);
    static Food bbqHamburger = new Food("BBQ hamburger", 115.90);
    static Food regHamburger = new Food("Hamburger", 79.99);
    static Food english = new Food("English breakfast", 78.90);
    static Food kebab = new Food("Kebab", 49.09);

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

    }

    public void runInit() {
        
        lasagne.setDescription("Great lasagne! Made in Italy!");
        pasta.setDescription("Superb carbonara from top chefs!");
        meatballs.setDescription("Savoury meatballs from sweden.");
        bbqHamburger.setDescription("Angus beef with sweet barbeque sauce.");
        regHamburger.setDescription("Hamburger with cheese, lettuce, tomatoes and ketchup.");
        english.setDescription("A proper english breakfast with bacon, fried tomatoes, toast and scrambled FairTrade eggs.");
        kebab.setDescription("Just like your local cornershops at 3 A.M, a saturday morning!");
        
        firstClassLasagne.setDescription("Great lasagne! Made in Italy!");
        firstClassPasta.setDescription("Superb carbonara from top chefs!");
        firstClassMeatballs.setDescription("Savoury meatballs from sweden.");
        firstClassBbqHamburger.setDescription("Angus beef with sweet barbeque sauce.");
        firstClassRegHamburger.setDescription("Hamburger with cheese, lettuce, tomatoes and ketchup.");
        firstClassEnglish.setDescription("A proper english breakfast with bacon, fried tomatoes, toast and scrambled FairTrade eggs.");
        firstClassKebab.setDescription("Just like your local cornershops at 3 A.M, a saturday morning!");
        
        
        
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
