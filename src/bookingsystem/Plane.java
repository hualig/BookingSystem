/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Plane {

    private String destination;
    private String planeID;
    private SeatList  seatList;
    //private CustomerList seatMap;
    private boolean flightStatus;
    private int noFirstClassSeat;
    private int noEconomyClassSeat;

    public Plane() {
        
        
       
    }

    public boolean isFlight() {
        return flightStatus;
    }

    public void setFlight(boolean flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getDestination() {
        return destination;
    }

    public String getPlaneID() {
        return planeID;
    }

    

    public int getAvailableNoFirstClassSeat() {
        return noFirstClassSeat;
    }

    public int getAvailableNoEconomyClassSeat() {
        return noEconomyClassSeat;
    }

    public int getTotalNoAvailableSeat() {
        return noFirstClassSeat + noEconomyClassSeat;

    }
}
