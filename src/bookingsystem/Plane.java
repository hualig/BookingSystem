/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.HashMap;

public abstract class Plane {

    private String destination;
    private String planeID;
    private HashMap<SeatNo, Customer> seatMap;
    private int numberOfSeats;
    private boolean flightStatus;
    private int availableNoFirstClassSeat;
    private int availableNoEconomyClassSeat;

    public Plane(String destination, String planeID, HashMap<SeatNo, Customer> customerMap, int numberOfSets) {
        this.destination = destination;
        this.planeID = planeID;
        this.seatMap = seatMap;
        this.numberOfSeats = numberOfSeats;
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

    public HashMap<SeatNo, Customer> getSeatMap() {
        return seatMap;
    }

    public int getAvailableNoFirstClassSeat() {
        return availableNoFirstClassSeat;
    }

    public int getAvailableNoEconomyClassSeat() {
        return availableNoEconomyClassSeat;
    }

    public int getTotalNoAvailableSeat() {
        return availableNoFirstClassSeat + availableNoEconomyClassSeat;

    }
}
