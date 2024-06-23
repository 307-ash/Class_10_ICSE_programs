/*
 * Prog. 9 |Write a program in Java to display the uppercase letters along with its equivalent lowercase letters side by side in two different columns.
 */

public class IX {
   public static void main(String[] args) {
      int i; // create an integer variable
      for (i = 1; i <= 26; i++) { // loop 26 times
         System.out.println((char) ('A' + i - 1) + " " + (char) ('a' + i - 1)); // print the character and its lowercase equivalent
      }
   }
}
