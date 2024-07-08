/*
 * Prog. 5 | Write a program in Java to accept an integer number N such that 0<N<27. Display the corresponding a letter of the alphabet (i.e., the letter at position N).
 *         | HINT: if N = 1 then display A.
 */

import java.util.Scanner; // import the Scanner class

public class V {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in); // create a Scanner object
      System.out.print("Enter a number: "); // prompt user to enter a number
      int N = in.nextInt(); // read a number

      if (N < 1 || N > 26) {
         System.out.println("Invalid input. Please enter a number between 1 and 26.");
      } else {
         char letter = (char) (N + 'A' - 1); // calculate the corresponding letter
         System.out.println("The letter at position " + N + " is: " + letter); // display the letter
      }
      in.close(); // close Scanner
   }
}
