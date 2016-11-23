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
public class FlightInformation implements Runnable {

    Flight flight;

    public FlightInformation(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void run() {
        while (true) {
            flight.printFlightStatus();
        }
    }

}
