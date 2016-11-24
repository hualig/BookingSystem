package bookingsystem;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainUI {

    static FoodInit foodInit = new FoodInit();
    static AirplaneRunner runPlane = new AirplaneRunner();
    //Instantiate more initializers

    //static CustomerList customerList = new CustomerList();
    static Customer customer = new Customer();
    static Saab flight = new Saab();
    static Ticket ticket = new Ticket(0.0, "1");
    static TicketList ticketList = new TicketList();
    static FoodMenu chosenMenu = new FoodMenu();

    static boolean running = true;
    static Scanner scanner = new Scanner(System.in);
    static String userInput;
    static int counter = 0;
    static Section typeChosen;

    public mainUI() {

        foodInit.runInit();
        //run more initializers
    }

    public static void main(String[] args) {
        do {
            runPlane.main(new String[5]);
            runMainApplication();

        } while (running);
        System.out.println("running = false. Main menu is exited. Only Airplanerunner remains open");

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
                    System.out.println(running);
                    break;
                default:
                    System.out.println("Bad input, try again.");
                    break;

            }
        } catch (InputMismatchException ime) {
            System.out.println("MismatchException");
        }
    }

    static void runRegisterCustomer(boolean bool) {
        boolean registering = bool;
        while (registering) {
            System.out.println("Please input your name. You can also choose to 'Exit'");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                case "EXIT":
                    registering = false;
                    break;
                default:
                    customer.setName(userInput);
                    System.out.println("Your name is " + customer.getName());
                    System.out.println("Please input your ID#. You can also choose to 'Exit'");
                    userInput = scanner.nextLine().toUpperCase();
                    switch (userInput) {
                        case "EXIT":
                            registering = false;
                            break;
                        default:
                            customer.setiD(userInput);
                            System.out.println("Your ID is: " + customer.getiD());
                            registering = false;
                            runSelectPlane(true);
                            break;
                    }
                    break;
            }
        }
    }

    static void runSelectPlane(boolean bool) {
        System.out.println("runSelectPlane");
        boolean selectingPlane = bool;
        while (selectingPlane) {
            System.out.println("Show list of flights");
            System.out.println("1. Flight 1 : "/* + flight.getDestination()*/);
            System.out.println("2. Flight 2 (Unavailable)");
            System.out.println("3. Flight 3 (Unavailable)");
            System.out.println("'Back', back to previous menu");
            System.out.println("'Exit', exit to main menu.");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                case "BACK":
                    selectingPlane = false;
                    runRegisterCustomer(true);
                    break;
                case "EXIT":
                    selectingPlane = false;
                    break;
                case "1":
                    System.out.println("You have selected Flight #1");
                    flight.getTicketList().getList().add(ticket);
                    runSelectClass(true);
                    selectingPlane = false;
                    break;
                default:
                    System.out.println("You need to select a valid flight");
                    break;
            }
        }
    }

    static void runSelectClass(boolean bool) {
        System.out.println("runSelectClass");
        boolean selectingClass = bool;
        while (selectingClass) {
            System.out.println("Please select Class, 'Back' or 'Exit'");
            System.out.println("1. First Class");
            System.out.println("2. Economy Class");
            System.out.println("'Back', back to previous menu");
            System.out.println("'Exit', exit to main menu.");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                case "BACK":
                    runSelectPlane(true);
                    selectingClass = false;
                    break;
                case "EXIT":
                    selectingClass = false;
                    break;
                case "1":

                    typeChosen = Section.FirstClass;
                    ticket.setPrice(20000.0);
//                        flight.setAvailableNoFirstClassSeat(=-1);
                    selectingClass = false;
                    runAssignSeat(true);
                    break;

                case "2":

                    typeChosen = Section.EconomyClass;
                    ticket.setPrice(5000.0);
//                        flight.setAvailableNoEconomyClassSeat(=-1);
                    selectingClass = false;
                    runAssignSeat(true);
                    break;

                default:
            }

            try {
                ticket = flight.getTicketList().searchAvailableTicket(typeChosen);
            } catch (SeatNotFoundException ex) {
                System.out.println("There are no more tickets in this class. Please make another choice.");
            }
        }

    }

    static void runAssignSeat(boolean bool) {
        System.out.println("runAssignSeat");
        flight.getTicketList().getList().get(counter).setSeatNumber(Integer.toString(counter + 1));

        System.out.println("Ticket.setSeatNumber(" + counter + 1 + ")");
        runSelectFood(true);
    }

    static void runSelectFood(boolean bool) {
        FoodMenu firstClassMenu = new FoodMenu();

        Food lasagne = new Food("Lasagna", 98.75);

        firstClassMenu.addFoodItem(lasagne);

        String userSelection;
        boolean selectingFood = bool;
        while (selectingFood) {

            System.out.println("Welcome");
            System.out.println("Please select what menu You would like to purchase from ");
            System.out.println("1. First Class Menu");
            System.out.println("2. Economy Class Menu");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            userInput = scanner.nextLine();
            switch (userInput) {

                case "1":

                    try {
                        System.out.println("Please select a food of Your choice to be served during Your flight.");
                        chosenMenu = foodInit.economyClassMenu;
                        Collections.sort(chosenMenu.getList());
                        for (int i = 0; i < chosenMenu.getListSize(); i++) {
                            System.out.println((i + 1) + ": " + chosenMenu.getFoodAtIndex(i));
                        }
                        userInput = scanner.nextLine();
                        userSelection = userInput;
                        if (Integer.parseInt(userSelection) <= 0 || Integer.parseInt(userSelection) > chosenMenu.getListSize()) {
                            System.out.println("Bad input. This number is not on the list.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Bad input. Use only numbers.");
                        break;
                    }

                    customer.addToMyFoodList(chosenMenu.getFoodAtIndex(Integer.parseInt(userSelection) - 1));

                    selectingFood = false;
                    runShowTicket(true);
                    break;
                case "2":
                    try {
                        System.out.println("Please select a food of Your choice to be served during Your flight.");
                        chosenMenu = foodInit.firstClassMenu;
                        Collections.sort(chosenMenu.getList());
                        for (int i = 0; i < chosenMenu.getListSize(); i++) {
                            System.out.println((i + 1) + ": " + chosenMenu.getFoodAtIndex(i));
                        }
                        userInput = scanner.nextLine();
                        userSelection = userInput;
                        if (Integer.parseInt(userSelection) <= 0 || Integer.parseInt(userSelection) > chosenMenu.getListSize()) {
                            System.out.println("Bad input. This number is not on the list.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Bad input. Use only numbers.");
                        break;
                    }
                    customer.addToMyFoodList(chosenMenu.getFoodAtIndex(Integer.parseInt(userSelection) - 1));
                    selectingFood = false;
                    runShowTicket(true);
                    break;
                case "3":
                    selectingFood = false;
                    runSelectClass(true);
                    break;
                case "4":
                    selectingFood = false;
                    break;
                default:
                    System.out.println("Please select an actual choice.");
                    break;
            }
        }
    }

    static void runShowTicket(boolean bool) {
        System.out.println("TBI.runShowTicket.TBI\n");
        System.out.printf("%-20s", "Name:");
        System.out.println(customer.getName());
        System.out.printf("%-20s", "ID:");
        System.out.println(customer.getiD());
        System.out.printf("%-20s", "Seat number:");
        System.out.println(ticket.getSeatNumber());
        System.out.printf("%-20s", "Price:");
        System.out.println(ticket.getPrice() + " SEK" );
        System.out.printf("%-20s", "Total food price:");
        System.out.println(customer.getFoodPrice() + " SEK");
        System.out.printf("%-20s", "Total:");
        System.out.println((ticket.getTotalPrice() + customer.getFoodPrice()) + " SEK \n");
        
        runConfirmation(true);

    }

    static void runConfirmation(boolean bool) {
        boolean confirm = bool;
        ticket.setCustomer(customer);
        while (confirm) {
        System.out.println("Please confirm");
        System.out.println("1 - Start to pay");
        System.out.println("2 - Exit");
            userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                
                case "2":
                    confirm = false;
                    break;
                case "1":
                    ticket.setCustomer(customer);

                    
                    confirm = false;
                    
                    break;

               

                default:
                    System.out.println("Invalid input");
            }
        
        }  
        
        

    }
}
