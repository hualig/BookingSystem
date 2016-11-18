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
public class PlaneTest {
    
    public static void main(String[] args){
        
        Plane saab001 = new Saab();
        Plane saab002 = saab001;
       
        
        System.out.println(saab001.getPlaneID());
        System.out.println(saab001.getDestination());
        
        System.out.println(saab001.getSeatList().getList());
        System.out.println(saab002.getSeatList().getList());
        saab001.getSeatList().getList().get(1).changeStatus();
        System.out.println(saab001.getSeatList().getList());
        System.out.println(saab002.getSeatList().getList());
    }
}
