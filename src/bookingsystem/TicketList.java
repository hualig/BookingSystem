/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                ticketFC.setPriceFC(20000);
                ticketFC.setSeatNumber(Integer.toString((i+1)));
                ticketFC.setSeatType(SeatType.FirstClass);
                ticketList.add(ticketFC);
            } else {
                Ticket ticketEC = new Ticket();
                ticketEC.setPriceEC(5000);
                ticketEC.setSeatNumber(Integer.toString((i+1)));
                ticketEC.setSeatType(SeatType.EconomyClass);
                ticketList.add(ticketEC);
            }
            i++;
        }
    }
    
    public List<Ticket> getList(){
        return ticketList;
    }
    
    public Ticket searchAvailableTicket(SeatType seatType) throws SeatNotFoundException{
        
        for(Ticket next:ticketList) {
            if(next.getSeatType() == seatType && next.getCustomer() == null) return next;
        }
        
        throw new SeatNotFoundException();
    }
    
    
    
}
