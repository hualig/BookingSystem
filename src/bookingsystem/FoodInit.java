package bookingsystem;

/**
 *
 * @author Mikael Tolfström
 */
public class FoodInit {

    public FoodMenu economyClassMenu;
    public FoodMenu firstClassMenu;

    public Food lasagne = new Food("Lasagna", 98.75);
    public Food pasta = new Food("Pasta Carbonara", 89.90);
    public Food meatballs = new Food("Spaghetti with meatballs", 102.99);
    public Food bbqHamburger = new Food("BBQ hamburger", 115.90);
    public Food regHamburger = new Food("Hamburger", 79.99);
    public Food english = new Food("English breakfast", 78.90);
    public Food kebab = new Food("Kebab", 49.09);

    public Food firstClassLasagne = new Food("Lasagna", 198.75);
    public Food firstClassPasta = new Food("Pasta Carbonara", 189.90);
    public Food firstClassMeatballs = new Food("Spaghetti with meatballs", 202.99);
    public Food firstClassBbqHamburger = new Food("BBQ hamburger", 215.90);
    public Food firstClassRegHamburger = new Food("Hamburger", 179.99);
    public Food firstClassEnglish = new Food("English breakfast", 178.90);
    public Food firstClassKebab = new Food("Kebab", 149.09);

    public FoodInit() {
        economyClassMenu = new FoodMenu();
        firstClassMenu = new FoodMenu();
        
        economyClassMenu.addFoodItem(lasagne);
        economyClassMenu.addFoodItem(pasta);
        economyClassMenu.addFoodItem(meatballs);
        economyClassMenu.addFoodItem(bbqHamburger);
        economyClassMenu.addFoodItem(regHamburger);
        economyClassMenu.addFoodItem(english);
        economyClassMenu.addFoodItem(kebab);
    }

    public void runInit() {

        lasagne.setDescription("Great lasagne!\nMade in Italy!");
        pasta.setDescription("Superb carbonara\nfrom top chefs!");
        meatballs.setDescription("Savoury meatballs\nfrom sweden.");
        bbqHamburger.setDescription("Angus beef with\nsweet barbeque\nsauce.");
        regHamburger.setDescription("Hamburger with\ncheese, lettuce,\ntomatoes and\nketchup.");
        english.setDescription("A proper english\nbreakfast with\nbacon, fried\ntomatoes, toast and\nscrambled\nFairTrade eggs.");
        kebab.setDescription("Just like your\nlocal cornershops\nat 3 A.M, on a\nsaturday morning!");

        firstClassLasagne.setDescription("Great lasagne!\nMade in Italy!");
        firstClassPasta.setDescription("Superb carbonara\nfrom top chefs!");
        firstClassMeatballs.setDescription("Savoury meatballs\nfrom sweden.");
        firstClassBbqHamburger.setDescription("Angus beef with\nsweet barbeque\nsauce.");
        firstClassRegHamburger.setDescription("Hamburger with\ncheese, lettuce,\ntomatoes and\nketchup.");
        firstClassEnglish.setDescription("A proper english\nbreakfast with\nbacon, fried\ntomatoes, toast and\nscrambled\nFairTrade eggs.");
        firstClassKebab.setDescription("Just like your\nlocal cornershops\nat 3 A.M, on a\nsaturday morning!");

        

        firstClassMenu.addFoodItem(firstClassLasagne);
        firstClassMenu.addFoodItem(firstClassPasta);
        firstClassMenu.addFoodItem(firstClassMeatballs);
        firstClassMenu.addFoodItem(firstClassBbqHamburger);
        firstClassMenu.addFoodItem(firstClassRegHamburger);
        firstClassMenu.addFoodItem(firstClassEnglish);
        firstClassMenu.addFoodItem(firstClassKebab);
    }

}
