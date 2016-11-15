package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
//
//copy-paste into booking UI
//
//
public class Stub_CustomerRegistration { 

    static public List<Customer> customerRecords = new ArrayList<>();
    static boolean registering = true;
    static Scanner sc = new Scanner(System.in);
    static String userInput;
    
    
    
    public static void main(String[] args){
        
        while (registering){
            Customer newCustomer = new Customer();
            System.out.println("Welcome");
            System.out.println("Please enter your name:");
            userInput/*newCustomer.setName*/ = sc.nextLine();
            System.out.println("Please enter your ID-no.:");
            userInput/*newCustomer.setID*/ = sc.nextLine();
            customerRecords.add(newCustomer);
            System.out.println("Thank you. Have a nice day!");
            registering = false;
        }
        
    }
    

    
}
