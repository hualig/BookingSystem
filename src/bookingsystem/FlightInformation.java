/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class FlightInformation implements Runnable {

    Flight flight;
    JTextArea jTextArea;

    public FlightInformation(Flight flight, JTextArea jTextArea) {
        this.flight = flight;
        this.jTextArea = jTextArea;
    }

    @Override
    public void run() {
        while (true) {
            flight.printFlightStatus(jTextArea);
        }
    }

}
