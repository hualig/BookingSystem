/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

/**
 *
 * @author User
 */
public class Seat {
    double price;
    Integer number;
    SeatType type;
    boolean status = false;

    public double getPrice() {
        return price;
    }

    public Integer getNumber() {
        return number;
    }
    
    public boolean getStatus() {
        return status;
    }

    public SeatType getType() {
        return type;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public void changeStatus() {
        status = !status;
    }

    @Override
    public String toString() {
        return "Seat{" + "price=" + price + ", number=" + number + ", type=" + type + ", status=" + status + '}' + "\n";
    }
    
    
            
    
}
