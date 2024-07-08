/*
 * Prog. 10| Write a menu driven program to display
 *         | (a) first five uppercase letters
 *         | (b) last five lowercase letters as per the user's choice. Enter 1 to display uppercase letters and enter 2 to display lowercase letters.
 */

import java.util.Scanner; // import the Scanner class

public class X { //class created
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // create a Scanner object
      System.out.println("Enter 1 to display uppercase letters and enter 2 to display lowercase letters: ");
      int choice = sc.nextInt(); // read the user's choice
      if (choice == 1) {
         System.out.println("First five uppercase letters are: ");
         for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.print(ch + " ");
         }
         System.out.println();
      } else if (choice == 2) {
         System.out.println("Last five lowercase letters are: ");
         for (char ch = 'u'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
         }
         System.out.println();
      } else {
         System.out.println("Invalid choice."); 
      }
      sc.close(); // close the Scanner object
   }
}
