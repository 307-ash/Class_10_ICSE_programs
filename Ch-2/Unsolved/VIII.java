/*
 * Prog. 8 | Write a menu driven program to generate the uppercase letters from Z to A and lowercase letters from a to z as per the user's choice.
 *         | Enter 1 to display uppercase letters from Z to A and Enter 2 to display lowercase letters from a to z.
 */

import java.util.Scanner; // import the Scanner class

public class VIII { // class created
   public static void main(String[] args) { // main method begins execution of a Java program
      Scanner in = new Scanner(System.in); // create a Scanner object
      int choice; // declare an integer variable
      System.out.print("Enter 1 to display uppercase letters or Enter 2 to display lowercase letters: "); // prompt user
                                                                                                          // to enter
                                                                                                          // choice
      choice = in.nextInt(); // read choice
      if (choice == 1) {
         for (char ch = 'Z'; ch >= 'A'; ch--) { // loop to display uppercase letters
            System.out.println(ch + " "); // display uppercase letters
         }
      } else if (choice == 2) {
         for (char ch = 'a'; ch <= 'z'; ch++) { // loop to display lowercase letters
            System.out.println(ch + " "); // display lowercase letters
         }
      } else {
         System.out.println("Invalid choice."); // display invalid choice
         System.exit(0); // terminate the program
      }
      in.close(); // close Scanner
   }
}
