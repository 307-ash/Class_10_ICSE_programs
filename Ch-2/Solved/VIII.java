/*
 * Prog. 8 |Write a program in Java to print the letters from A to Z along with their numeric values from 1 to 26 respectively.
 */

public class VIII {
   public static void main(String[] args) {
      int i; // create an integer variable
      for (i = 1; i <= 26; i++) { // loop 26 times
         System.out.println((char) ('A' + i - 1) + " " + i); // print the character and its numeric value
      }
      System.out.println(); // print a new line
   }
   
}
