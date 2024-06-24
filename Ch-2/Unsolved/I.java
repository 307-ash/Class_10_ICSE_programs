/*
 * Prog. 1 | Write a program in Java to input a character. Find and display the next 10th character in the ASCII table.
 */

import java.util.Scanner; // import the Scanner class

public class I { // class created
   public static void main(String[] args) { // main method begins execution of a Java program
      Scanner in = new Scanner(System.in); // create a Scanner object
      char ch; // declare a character variable
      System.out.print("Enter a character: "); // prompt user to enter a character
      ch = in.nextLine().charAt(0); // read a character
      ch += 1; // increment the character by 1
      if (ch > 'z' || ch > 'Z') {
         ch = (char) (ch - 26); // if the character exceeds z or Z then subtract 26
      }
      for (int i = 0; i < 10; i++) { // loop to display next 10 characters
         System.out.println((char) (ch + i) + " "); // display the next 10 characters
      }
      in.close(); // close Scanner
   }
}