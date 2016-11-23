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
import javax.swing.JTextArea;

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

        synchronized (this) {
            if (getTotalNoAvailableSeat() == 0) {
                flightStatus = true;
                notifyAll();
            } else {
                flightStatus = false;
            }
        }

    }

    public void printFlightStatus(JTextArea jTextArea) {

        synchronized (this) {
            jTextArea.append(getPlaneID() + ": waiting ... \n");

            while (getTotalNoAvailableSeat() != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            jTextArea.append(getPlaneID() + ": take off\n");
            jTextArea.append(getPlaneID() + ": flight ...\n");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            jTextArea.append(getPlaneID() + ": landing\n");
            resetFlight();
            setIsFlight();
            jTextArea.append(getPlaneID() + ": refuel\n");
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
    
    public void resetFlight(){
        for(Ticket next:ticketList.getList()) {
            next.delCustomer();
        }
    }

}
