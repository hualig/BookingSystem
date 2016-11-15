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
    int number;
    SeatType type;

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public SeatType getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }
            
    
}
