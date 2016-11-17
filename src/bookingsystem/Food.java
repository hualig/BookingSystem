package bookingsystem;

import java.util.Objects;

public class Food implements Comparable<Food>{

    String name;
    Double price;
    String description;
    
    public Food(String name, Double price){
        this.name = name;
        this.price = price;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ",  " + price + "SEK";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Food o) {
        int comp = this.name.compareTo(o.getName());
        if (comp == 0) {
            return this.price.compareTo(o.getPrice());
        } else {
            return comp;
        }
    }
    
    

}
