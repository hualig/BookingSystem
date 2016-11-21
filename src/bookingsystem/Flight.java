/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Flight {

    String destination;
    String planeID;
    TicketList ticketList;
    boolean flightStatus = false;
    int noFirstClassSeat;
    int noEconomyClassSeat;

    public Flight() {

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
    
    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }

    public TicketList getTicketList() {
        return ticketList;
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
