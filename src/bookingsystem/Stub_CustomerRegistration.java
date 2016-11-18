package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Mikael Tolfström
 */
//
//
//copy-paste into booking UI
//
//
public class Stub_CustomerRegistration { 
    
    //This will probably be initialized in some public location so that
    //it can be accessed throughout the application
    static public List<Customer> customerRecords = new ArrayList<>();
    
    
    static Customer newCustomer = new Customer();
    static boolean registering = true;
    static Scanner sc = new Scanner(System.in);
    static String userInput;
    
    
    
    public static void main(String[] args){
        
        while (registering){
            Customer newCustomer = new Customer();
            System.out.println("Welcome");
            
            //setName and setID needs to be implemented
            //
            System.out.println("Please enter your name:");
            //newCustomer.setName(sc.nextLine());
            System.out.println("Please enter your ID-no.:");
            //newCustomer.setID(sc.nextLine());
            
            customerRecords.add(newCustomer);
            System.out.println("Thank you. Have a nice day!");
            registering = false;
        }
        
    }
    

    
}
