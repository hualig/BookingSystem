package bookingsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainUI {

    //static CustomerList customerList = new CustomerList();
    static Customer customer = new Customer();
    static FoodInit foodInit = new FoodInit();
    static AirplaneRunner runPlane = new AirplaneRunner();
    static boolean running = true;
    static Scanner scanner = new Scanner(System.in);
    static String userInput;
    //Add more initializers

    public mainUI() {

        foodInit.runInit();
        //run more initializers
    }

    public static void main(String[] args) {
        do {
            runPlane.main(new String[5]);
            runMainApplication();

        } while (running);
        System.out.println("running = false");

    }

    static void runMainApplication() {
        System.out.println(" ============================ ");
        System.out.println("|          Hello,            |");
        System.out.println("|        welcome to          |");
        System.out.println("|        the online          |");
        System.out.println("|      booking agent.        |");
        System.out.println("|                            |");
        System.out.println("|       please make          |");
        System.out.println("|       your choice          |");
        System.out.println("|                            |");
        System.out.println("|                            |");
        System.out.println(" ============================ ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("1.  Start registration");
        System.out.println("2.  Cancel and exit");
        try {
            userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    runRegisterCustomer(true);
                    break;

                case "2":
                    running = false;
                    break;
                default:
                    System.out.println("Bad input, try again.");

            }
        } catch (InputMismatchException ime) {
            System.out.println("Bad input, try again.");
        }
    }

    static void runRegisterCustomer(boolean bool) {
        boolean registering = bool;
        while (registering) {
            System.out.println("Please input your name.");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                case "EXIT":
                    registering = false;
                    break;
                default:
                    customer.setName(userInput);
                    System.out.println("Your name is " + customer.getName());
                    System.out.println("Please input your ID#.");
                    userInput = scanner.nextLine().toUpperCase();
                    switch (userInput) {
                        case "EXIT":
                            registering = false;
                            break;
                        default:
                            customer.setiD(userInput);
                            System.out.println("Hello");

                            runSelectPlane(true);

                            break;
                    }
                    break;
            }

        }
        runMainApplication();

    }

    static void runSelectPlane(boolean bool) {
        System.out.println("runSelectPlane");
        boolean selectingPlane = bool;
        while (selectingPlane) {
            System.out.println("Show list of planes");
            System.out.println("Plane 1");
            System.out.println("Plane 2 (Unavailable)");
            System.out.println("Plane 3");
            System.out.println("Please select a plane or select 'Exit' or 'Back'");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                case "BACK":
                    runRegisterCustomer(true);
                    break;
                case "EXIT":
                    selectingPlane = false;
                    break;
                default:
                    System.out.println("You've selected plane no: " + userInput);
                    runSelectClass();
                    selectingPlane = false;
                    break;
            }
        }
        runRegisterCustomer(false); //This takes you back to runCustomer with bool = false, which should take you straight back to main menu.

    }

    static void runSelectClass() {
        System.out.println("runSelectClass");
        try {
            System.out.println("Sleeping");
            Thread.sleep(5000);
        } catch (Exception e) {
        }

    }

    static void runAssignSeat() {

    }

    static void runSelectFood() {

    }

    static void runShowTicket() {

    }

    static void runConfirmation() {

    }
}
