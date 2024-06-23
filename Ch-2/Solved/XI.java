/*
 * Prog. 11|Write a program in Java to generate the following pattern:
 *         |A 
 *         |BB
 *         |CCC
 *         |DDDD
 *         |EEEEE
 */

public class XI { // create a class
   public static void main(String[] args) { // create a main method
      int i, j; // create two integer variables i and j
      for (i = 1; i <= 5; i++) { // loop 5 times
         for (j = 1; j <= i; j++) { // loop i times
            System.out.print((char) ('A' + i - 1) + " "); // print the character
         }
         System.out.println(); // print a new line
      }
      System.out.println(); // print a new line
   }
}
