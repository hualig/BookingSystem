package bookingsystem;
//
//

import java.util.Scanner;

//copy-paste into booking UI
//
//
public class Stub_CustomerMenuPresentation {
    
    static boolean inMenu = true;
    static Scanner sc = new Scanner(System.in);
    static int userInput;
    static int userSelection;
    static FoodInit goGoGo = new FoodInit();
    static FoodMenu chosenMenu;
    
    public Stub_CustomerMenuPresentation(){
        goGoGo.runInit();
    }
    
    public static void doStuff(){
        while(inMenu){
            System.out.println("Welcome");
            System.out.println("Please select what menu You would like to purchase from ");
            System.out.println("1)    Economy Class Menu");
            System.out.println("2)    First Class Menu");
            userInput = sc.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Please select a food of Your choice to be served during Your flight.");
                    chosenMenu = goGoGo.economyClassMenu;
                    for (int i = 0; i < goGoGo.economyClassMenu.getListSize(); i++) {
                        System.out.println((i+1) + ": " + goGoGo.economyClassMenu.getFoodAtIndex(i));
                    }
                    userInput = sc.nextInt();
                    userSelection = userInput;
                    inMenu = false;
                    break;
                case 2:
                    System.out.println("Please select a food of Your choice to be served during Your flight.");
                    chosenMenu = goGoGo.firstClassMenu;
                    inMenu = false;
                    break;
                default:
                    System.out.println("Please select an actual choice.");
                    break;
            }
            System.out.println("You chose item number " + userSelection + ": The " + chosenMenu.getFoodAtIndex(userSelection));
            
        }
    }
    
    
}
