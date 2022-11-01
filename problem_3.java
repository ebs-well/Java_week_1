// Write a program that helps the user count his change. 
// The program should ask how many quarters the user has, then how many dimes, then how many nickels, then how many pennies. 
// Then the program should tell the user how much money he has, expressed in dollars.

import java.util.Scanner;

public class problem_3 {
    public static void main (String[] args){
        // This first section is just setting up my variables
        int quarter;
        int dime;
        int nickel;
        int penny;
        Scanner in;
    
        in = new Scanner(System.in);  
        System.out.print("Enter the number of quarters you have: "); // ask the user for the number of quarters
        quarter = in.nextInt();  
    
        System.out.print("Enter the number of dimes you have: "); // ask the user for the number of dimes
        dime = in.nextInt();
    
        System.out.print("Enter the number of nickels you have: "); // ask the user for the number of nickels
        nickel = in.nextInt();
            
        System.out.print("Enter the number of pennies you have: "); // // ask the user for the number of pennies
        penny = in.nextInt();
    
        double totalCoin = (penny + (nickel * 5) + (dime * 10) + (quarter * 25)) * (.01); // gives us a total number and converts to the right decimel point

        System.out.print("You have a total of $" + String.format("%.2f", totalCoin) + " in change."); // the "%.2f" thankfully fixed any formatting issues based on the answer.
  }
}