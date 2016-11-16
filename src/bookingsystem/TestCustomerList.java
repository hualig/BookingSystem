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
public class TestCustomerList {
    public static void main(String[] args){
        
        SeatList seatList = new SeatList(5, 5);
        System.out.println(seatList.getList());
        
        CustomerList cl = new CustomerList();
        Customer customer1 = new Customer("Test1", "111111");
        Customer customer2 = new Customer("Est2", "222222");
        Customer customer3 = new Customer("Hest3", "333333");
        
        System.out.println(customer1);
        
        Food fd1 = new Food("Fish", 23.34);
        Food fd2 = new Food("Fish2", 43.34);
        Food fd3 = new Food("Fish5", 123.34);
        
        for(Seat next:seatList.getList()){
            if(!(next.status)) {
                customer1.assignSeatNumber(next);
                next.changeStatus();
                break;
            }
            
        }
        
        for(Seat next:seatList.getList()){
            if(!(next.status)) {
                customer2.assignSeatNumber(next);
                next.changeStatus();
                break;
            }
        }
        
        for(Seat next:seatList.getList()){
            if(!(next.status)) {
                customer3.assignSeatNumber(next);
                next.changeStatus();
                break;
            }
        }
        
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        
        customer1.addToMyFoodList(fd1);
        customer1.addToMyFoodList(fd2);
        
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
  
        cl.addCustomer(customer1);
        cl.addCustomer(customer2);
        cl.addCustomer(customer3);
     
        
     
        System.out.println(cl.getCustomerList());
        
        cl.delCustomer(customer1.getSeatNumber());
        seatList.getList().get(customer1.getSeatNumber()-1).changeStatus();
       
        
        System.out.println(cl.getCustomerList());
        System.out.println(seatList.getList());
        
        
    }
}
