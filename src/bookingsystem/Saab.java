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
public class Saab extends Plane{
    
    public Saab(String destination, String planeID, HashMap<SeatNo, Customer> customerMap, int numberOfSets) {
        super(destination, planeID, customerMap, numberOfSets);
    }
    
}
