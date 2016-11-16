package bookingsystem;
//
//

import java.util.InputMismatchException;
import java.util.Scanner;

//copy-paste into booking UI
//
//
public class Stub_CustomerMenuPresentation {

     boolean inMenu = true;
     Scanner sc = new Scanner(System.in);
     String userInput;
     String userSelection;
     int counter;
     FoodInit runFoodInit = new FoodInit();
     FoodMenu chosenMenu;
     Customer currentCustomer = FoodMenuTestMain.customer1;

    public Stub_CustomerMenuPresentation() {
        runFoodInit.runInit();
        counter = 0;
    }

    public  void doStuff() {

        while (inMenu) {

            System.out.println("Welcome");
            System.out.println("Please select what menu You would like to purchase from ");
            System.out.println("1)    Economy Class Menu");
            System.out.println("2)    First Class Menu");
            System.out.println("3)    No more please.");

            userInput = sc.nextLine();

            switch (userInput) {

                case "1":

                    try {
                        System.out.println("Please select a food of Your choice to be served during Your flight.");
                        chosenMenu = runFoodInit.economyClassMenu;
                        for (int i = 0; i < chosenMenu.getListSize(); i++) {
                            System.out.println((i + 1) + ": " + chosenMenu.getFoodAtIndex(i));
                        }
                        userInput = sc.nextLine();
                        userSelection = userInput;
                        if (Integer.parseInt(userSelection) <= 0 || Integer.parseInt(userSelection) > chosenMenu.getListSize()) {
                            System.out.println("Bad input. This number is not on the list.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Bad input. Use only numbers.");
                        break;
                    }

                    currentCustomer.addToMyFoodList(chosenMenu.getFoodAtIndex(Integer.parseInt(userSelection) - 1));
                    System.out.println(currentCustomer.getMyFoodList().get(counter));
                    counter++;
                    break;
                case "2":
                    try {
                        System.out.println("Please select a food of Your choice to be served during Your flight.");
                        chosenMenu = runFoodInit.firstClassMenu;
                        for (int i = 0; i < chosenMenu.getListSize(); i++) {
                            System.out.println((i + 1) + ": " + chosenMenu.getFoodAtIndex(i));
                        }
                        userInput = sc.nextLine();
                        userSelection = userInput;
                        if (Integer.parseInt(userSelection) <= 0 || Integer.parseInt(userSelection) > chosenMenu.getListSize()) {
                            System.out.println("Bad input. This number is not on the list.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Bad input. Use only numbers.");
                        break;
                    }
                    currentCustomer.addToMyFoodList(chosenMenu.getFoodAtIndex(Integer.parseInt(userSelection) - 1));
                    System.out.println(currentCustomer.getMyFoodList().get(counter));
                    counter++;

                    break;
                case "3":
                    inMenu = false;
                    break;
                default:
                    System.out.println("Please select an actual choice.");
                    break;
            }

        }
        System.out.println(currentCustomer.getMyFoodList());
        System.out.println(currentCustomer.getTotalPriceOfFood());
        System.out.println("Thank you, come again!");

    }

}
