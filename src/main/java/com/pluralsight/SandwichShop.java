package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //Instantiating Scanner

        //Declaring & Initializing Variables
        String userInput;
        String sandwichSize;
        int userAge;
        float discount = 0;
        float sandwichPrice = 0;
        float totalCost = 0;
        boolean isLoaded = false;

        System.out.print("""
                Pick a size of the sandwich
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """);
        sandwichSize = myScanner.nextLine();

        //Assigning the sandwich price based on selection
        if(sandwichSize.equals("1")){
            sandwichPrice = 5.45f;
        } else if(sandwichSize.equals("2")){
            sandwichPrice = 9.85f;
        } else{ //Exiting the program if the user doesn't input one of the options in correct format.
            System.out.print("Invalid Input!");
            System.exit(1);
        }

        System.out.println("Would you like your sandwich loaded? (yes/no)");
        userInput = myScanner.nextLine();
        if(userInput.equalsIgnoreCase("yes")){
            isLoaded = true;
            //add if true then add 1 for reg & 1.75 for large
        } else if(userInput.equalsIgnoreCase("no")){
            isLoaded = false;
        } else {
            System.out.print("Invalid Input");
            System.exit(1);
        }

        if(isLoaded && sandwichSize.equals("1")){
            sandwichPrice += 1;
        } else if(isLoaded && sandwichSize.equals("2")){
            sandwichPrice += 1.75f;
        }

        System.out.print("How old are you?: ");
        userInput = myScanner.nextLine();
        userAge = Integer.parseInt(userInput); //parsing the string into an integer

        if(userAge <= 17){
            discount = 0.1f * sandwichPrice;
        } else if(userAge >= 65){
            discount = 0.2f * sandwichPrice;
        }

        totalCost = (sandwichPrice - discount);
        System.out.println("Your total cost of the Sandwich is: $" + String.format("%.2f", totalCost)); //formatted total cost float so it only prints 2 decimal points and not 7



    }
}
