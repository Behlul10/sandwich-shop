package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        String sandwichSize;
        int userAge;
        float discount = 0;
        float sandwichPrice = 0;
        float totalCost;

        System.out.print("""
                Pick a size of the sandwhich 
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """);
        sandwichSize = myScanner.nextLine();
        if(sandwichSize.equals("1")){
            sandwichPrice = 5.45f;
        } else if(sandwichSize.equals("2")){
            sandwichPrice = 9.85f;
        } else{
            System.out.print("Invalid Input!");
            System.exit(0);
        }

        System.out.print("How old are you?: ");
        userInput = myScanner.nextLine();
        userAge = Integer.parseInt(userInput);

        if(userAge <= 17){
            discount = 0.1f * sandwichPrice;
        } else if(userAge >= 65){
            discount = 0.2f * sandwichPrice;
        }

        totalCost = (sandwichPrice - discount);
        System.out.println("Your total cost of the Sandwich is: $" + totalCost);



    }
}
