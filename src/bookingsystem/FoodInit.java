package bookingsystem;

/**
 *
 * @author Mikael Tolfström
 */
public class FoodInit {

    public FoodMenu economyClassMenu;
    public FoodMenu firstClassMenu;

    public Food cola = new Food("Kuba Cola", 23.50);
    public Food lemon = new Food("Freeway lemon", 34.50);
    public Food ham = new Food("Ham sandwich", 65.90);
    public Food cheese = new Food("Cheese sandwich", 63.90);
    public Food hamburger = new Food("Hamburger", 79.90);
    public Food beer = new Food("Beer", 79.90);
    public Food wine = new Food("Wine", 99.90);

    public Food cocaCola = new Food("Coca cola", 49.90);
    public Food sprite = new Food("Sprite", 49.90);
    public Food filetMignon = new Food("Filet mignon", 499.90);
    public Food beef = new Food("Kobe beef", 559.90);
    public Food lobster = new Food("Lobster platter", 599.90);
    public Food tactical = new Food("Tactical Nuclear Penguin", 479.90);
    public Food domp = new Food("Dom Perignon", 249.90);

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
        
        firstClassMenu.addFoodItem(cocaCola);
        firstClassMenu.addFoodItem(sprite);
        firstClassMenu.addFoodItem(filetMignon);
        firstClassMenu.addFoodItem(beef);
        firstClassMenu.addFoodItem(lobster);
        firstClassMenu.addFoodItem(tactical);
        firstClassMenu.addFoodItem(domp);
    }

    public void runInit() {

        cola.setDescription("33cl can");
        lemon.setDescription("33cl can");
        ham.setDescription("Ham, cheese and lettuce");
        cheese.setDescription("Cheese and\nlettuce");
        hamburger.setDescription("Hamburger with\ncheese, lettuce,\ntomatoes and\nketchup.");
        beer.setDescription("50cl bottle\n4,5%");
        wine.setDescription("Red or white wine\nin a glass");

        cocaCola.setDescription("33cl glass bottle");
        sprite.setDescription("50cl PET bottle");
        filetMignon.setDescription("Prepared by\nour top chefs!");
        beef.setDescription("Kobe beef with\nsavoury cognac\nsauce.");
        lobster.setDescription("Fresh lobster\ncaught one hour\nbefore take-off.");
        tactical.setDescription("A small glass\nof Brewdog beer\n6cl of 39% heaven. ");
        domp.setDescription("Glass, 11cl");

        

        
    }

}
