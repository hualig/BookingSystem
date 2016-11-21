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
public class Saab extends Flight {



    public Saab() {
        destination = "Barcelona";
        planeID = "1234";
        noFirstClassSeat = 5;
        noEconomyClassSeat = 5;
        ticketList = new TicketList(noFirstClassSeat, noEconomyClassSeat);
                
    }
}
