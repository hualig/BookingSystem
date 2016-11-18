/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SeatListTest {
    
    public static void main(String[] args){
        
        SeatList seatList = new SeatList(5, 5);
        
        try {
            //System.out.print(seatList.getList());
            System.out.println(seatList.getAvailableSeatFC());
        } catch (SeatNotFoundException ex) {
            System.out.println("Seat not available");
        }
        try {
            System.out.print(seatList.getAvailableSeatEC());
        } catch (SeatNotFoundException ex) {
            System.out.println("Seat not available");
        }
        
        try {
            System.out.println(seatList.searchSeat(10));
        } catch (SeatNotFoundException ex) {
            System.out.println("Seat not found");
        }
    }
    
}
