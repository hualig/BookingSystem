/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    public void setIsFlight() {

        if (getTotalNoAvailableSeat() == 0) {
            flightStatus = true;
            notify();
        } else {
            flightStatus = false;
        }

    }

    public void printFlightStatus() {

        synchronized (this) {
            System.out.println(getPlaneID() + " is waiting ...");

            while (getTotalNoAvailableSeat() != 0) {
                try {
                    System.out.println("wait for booking");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(getPlaneID() + " is take off");
            System.out.println(getPlaneID() + " is flight ...");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(getPlaneID() + " is landing");
            System.out.println(getPlaneID() + " is refuel");
        }

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

    public int getTotalNoAvailableSeat() {

        return ticketList.getList().stream().filter(s -> s.getCustomer() == null).collect(Collectors.toList()).size();
    }

    public double getIncome() {

        List<Double> incomeList = new ArrayList<>();
        for (Ticket next : ticketList.getList()) {
            if (next.getCustomer() != null) {
                incomeList.add(next.getTotalPrice());
            }
        }
        return incomeList.stream().reduce(0d, (a, b) -> a + b);
    }

}
