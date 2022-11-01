// Write a program that asks the user’s name, and then greets the user by name. 
// Before outputting the user’s name, convert it to upper case letters. 
// For example, if the user’s name is Fred, then the program should respond “Hello, FRED, nice to meet you!”.


import java.util.Scanner;

public class problem_2 {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter your first name: "); // Asking for user input
        String userName = myObj.nextLine();  // Reads user input
        System.out.println("Hello, " + userName.toUpperCase() + ", nice to meet you!");  // Output user input and the .toUpperCase() makes it all CAPS!
  }
}