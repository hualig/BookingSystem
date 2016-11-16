package bookingsystem;

public class Food {

    String name;
    Double price;
    
    public Food(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", price: " + price + "SEK";
    }
    
    

}
