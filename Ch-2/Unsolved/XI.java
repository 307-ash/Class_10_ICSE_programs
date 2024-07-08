/*
 * Prog. 11| Using switch case statement, write a menu driven program to perform the following tasks:
 *         | (a) To generate and print the letters from A to Z along with their Unicode.
 *         |  Letters                  Unicode
 *         |  A                        65
 *         |  B                        66
 *         |  .....                    .....
 *         |  .....                    .....
 *         |  Z                        90
 *         | 
 *         | (b) To generate and print the letters from z to a along with their Unicode.
 *         |  Letters                  Unicode
 *         |  z                        122
 *         |  y                        121
 *         |  .....                    .....
 *         |  .....                    .....
 *         |  a                        97
 */

import java.util.Scanner; // import the Scanner class
 
public class XI { //class created
   public static void main(String[] args) { // create a main method
      Scanner in = new Scanner(System.in); // create a Scanner object
      int choice; // declare an integer variable
      System.out.println("Enter 1 to display uppercase letters or Enter 2 to display lowercase letters:"); // prompt user
      choice = in.nextInt(); // read choice
      switch (choice) { // switch statement
         case 1: // case 1
            for (char ch = 'A'; ch <= 'Z'; ch++) { // loop to display uppercase letters
               System.out.println(ch + " " + (int) ch); // print the character and its Unicode
            }
            break; // break the switch statement
         case 2: // case 2
            for (char ch = 'z'; ch >= 'a'; ch--) { // loop to display lowercase letters
               System.out.println(ch + " " + (int) ch); // print the character and its Unicode
            }
            break; // break the switch statement
         default: // default case
            System.out.println("Invalid choice. Please enter 1 or 2."); // display an error message
      }
      in.close(); // close Scanner
   }
}
