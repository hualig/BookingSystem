/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class Saab extends Plane {

    private String destination = "Barcelona";
    private String planeID = "1234";
    private int numberOfSeats = 10;
    private int noFirstClassSeat = 5;
    private int noEconomyClassSeat = 5;

    public Saab() {
        super();
        destination = "Barcelona";
        planeID = "1234";
        numberOfSeats = 10;
        noFirstClassSeat = 5;
        noEconomyClassSeat = 5;
    }
}
