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
public class SeatList {
    
    private List<Seat> seatList;
    
    public SeatList(int noFirstClassSeat, int noEconomyClassSeat) {
        
        seatList = new ArrayList<>(); 
        int i= 0;
        while(i<(noFirstClassSeat+noEconomyClassSeat)){
            if(i < noFirstClassSeat) {
                Seat seatFC = new FirstClassSeat();
                seatFC.setNumber(i+1);
                seatList.add(seatFC);
            } else {
                Seat seatEC = new EconomyClassSeat();
                seatEC.setNumber(i+1);
                seatList.add(seatEC);
            }
            i++;
        }
    }
    
    public List<Seat> getList() {
        return seatList;
    }
    
    public Seat getAvailableSeatFC() throws SeatNotFoundException{
        for (Seat seat : seatList){
            if (seat.getType().equals(SeatType.FirstClass)&&seat.getStatus()==false){
                return seat;
            }
        }
        throw new SeatNotFoundException();
    }
    
    public Seat getAvailableSeatEC() throws SeatNotFoundException{
        for (Seat seat : seatList){
            if (seat.getType().equals(SeatType.EconomyClass)&&seat.getStatus()==false){
                return seat;
            }
        }
        throw new SeatNotFoundException();
    }
    
    public Seat searchSeat(int seatNo)throws SeatNotFoundException{
         for (Seat seat : seatList){
             if (seat.getNumber()== seatNo){
                 return seat;
             }
         }
         throw new SeatNotFoundException();
         
        
    }
}
