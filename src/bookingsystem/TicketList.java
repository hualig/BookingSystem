/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TicketList {
    
    private List<Ticket> ticketList;
    
    
    public TicketList(){
        
    }
    
    public TicketList(int noFirstClassSeat, int noEconomyClassSeat){
        ticketList = new ArrayList<>(); 
        int i= 0;
        while(i<(noFirstClassSeat+noEconomyClassSeat)){
            if(i < noFirstClassSeat) {
                Ticket ticketFC = new Ticket();
                ticketFC.setPrice(20000);
                ticketFC.setSeatNumber(Integer.toString((i+1)));
                ticketFC.setSection(Section.FirstClass);
                ticketList.add(ticketFC);
            } else {
                Ticket ticketEC = new Ticket();
                ticketEC.setPrice(5000);
                ticketEC.setSeatNumber(Integer.toString((i+1)));
                ticketEC.setSection(Section.EconomyClass);
                ticketList.add(ticketEC);
            }
            i++;
        }
    }
    
    public List<Ticket> getList(){
        return ticketList;
    }
    
    public Ticket searchAvailableTicket(Section section) throws SeatNotFoundException{
        
        for(Ticket next:ticketList) {
            if(next.getSection() == section && next.getCustomer() == null) return next;
        }
        
        throw new SeatNotFoundException();
    }
    
    
    
}
