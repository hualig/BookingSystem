package bookingsystem;

/**
 *
 * @author Mikael Tolfström
 */
public class FoodInit {

    public FoodMenu economyClassMenu;
    public FoodMenu firstClassMenu;

    public Food cola = new Food("Kuba Cola, 33cl", 23.50);
    public Food lemon = new Food("Freeway lemon, 50cl", 34.50);
    public Food ham = new Food("Ham sandwich", 65.90);
    public Food cheese = new Food("Cheese sandwich", 63.90);
    public Food hamburger = new Food("Hamburger", 79.90);
    public Food beer = new Food("Beer, 50cl", 79.90);
    public Food wine = new Food("Wine, red/white", 99.90);

    public Food cocaCola = new Food("Coca cola, 50cl", 49.90);
    public Food sprite = new Food("Sprite, 50cl", 49.90);
    public Food filetMignon = new Food("Filet mignon", 499.90);
    public Food beef = new Food("Kobe beef", 559.90);
    public Food lobster = new Food("Lobster platter", 599.90);
    public Food tactical = new Food("Tactical Nuclear Penguin, 6cl", 479.90);
    public Food domp = new Food("Dom Perignon, glass", 249.90);

    public FoodInit() {
        economyClassMenu = new FoodMenu();
        firstClassMenu = new FoodMenu();
        
        economyClassMenu.addFoodItem(cola);
        economyClassMenu.addFoodItem(lemon);
        economyClassMenu.addFoodItem(ham);
        economyClassMenu.addFoodItem(cheese);
        economyClassMenu.addFoodItem(hamburger);
        economyClassMenu.addFoodItem(beer);
        economyClassMenu.addFoodItem(wine);
    }

    public void runInit() {

        cola.setDescription("Great lasagne!\nMade in Italy!");
        lemon.setDescription("Superb carbonara\nfrom top chefs!");
        ham.setDescription("Savoury meatballs\nfrom sweden.");
        cheese.setDescription("Angus beef with\nsweet barbeque\nsauce.");
        hamburger.setDescription("Hamburger with\ncheese, lettuce,\ntomatoes and\nketchup.");
        beer.setDescription("A proper english\nbreakfast with\nbacon, fried\ntomatoes, toast and\nscrambled\nFairTrade eggs.");
        wine.setDescription("Just like your\nlocal cornershops\nat 3 A.M, on a\nsaturday morning!");

        cocaCola.setDescription("Great lasagne!\nMade in Italy!");
        sprite.setDescription("Superb carbonara\nfrom top chefs!");
        filetMignon.setDescription("Savoury meatballs\nfrom sweden.");
        beef.setDescription("Angus beef with\nsweet barbeque\nsauce.");
        lobster.setDescription("Hamburger with\ncheese, lettuce,\ntomatoes and\nketchup.");
        tactical.setDescription("A proper english\nbreakfast with\nbacon, fried\ntomatoes, toast and\nscrambled\nFairTrade eggs.");
        domp.setDescription("Just like your\nlocal cornershops\nat 3 A.M, on a\nsaturday morning!");

        

        firstClassMenu.addFoodItem(cocaCola);
        firstClassMenu.addFoodItem(sprite);
        firstClassMenu.addFoodItem(filetMignon);
        firstClassMenu.addFoodItem(beef);
        firstClassMenu.addFoodItem(lobster);
        firstClassMenu.addFoodItem(tactical);
        firstClassMenu.addFoodItem(domp);
    }

}
