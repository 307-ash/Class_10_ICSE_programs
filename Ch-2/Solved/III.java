/*
 *   Prog. 3 |Write a program in Java to accept a set of any 10 characters. Calculate and print the sum of ASCII codes of the characters.
*/

import java.util.Scanner; // import the Scanner class

public class III {
    public static void main(String[] args){ // main method begins execution of a Java program
        Scanner in = new Scanner(System.in); // create a Scanner object
        int ch[] = new int[10]; // create an array of 10 integers
        System.out.println("Enter 10 Cahracters: "); // prompt user to enter 10 characters
        for(int i = 0; i < 10; i++){ // for loop for 10 times
            ch[i] = in.nextInt(); // store the character in the array
        }
        int sum = 0; // create a variable to store the sum
        for(int i = 0; i < 10; i++){ // for loop for 10 times
            sum += ch[i]; // calculate the sum
        }
        System.out.println("Sum of ASCII Codes: " + sum); // display the sum
        in.close(); // close Scanner
    }
}
