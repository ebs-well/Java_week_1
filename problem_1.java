// Write a program that simulates rolling a pair of dice. You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. 
// The number you pick represents the number on the die after it is rolled. 
// You can assign this value to a variable to represent one of the dice that are being rolled. 
// Do this twice and add the results together to get the total roll. 
// Your program should report the number showing on each die as well as the total roll.

public class problem_1 {
    public static void main (String[] args){
        int dice1 = (int)(Math.random()*6) + 1; // sets up first dice
        int dice2 = (int)(Math.random()*6) + 1; // sets up second dice
        int sum = dice1 + dice2; // adds dice together
        System.out.print("You rolled a "+ dice1 + " and a " + dice2 + " for a total of " + sum);
    }
}
