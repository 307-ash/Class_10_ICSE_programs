/*
 * Prog. 7 |Write a program in Java to generate 10 characters between A and J randomly.
 */

import java.util.Random; // import the Random class

public class VII { // create a new class
   public static void main(String[] args) { // create a main method
      Random rand = new Random(); // create a new Random object
      for(int i = 0; i < 10; i++) { // loop 10 times
         char ch = (char)(rand.nextInt(10) + 'A'); // generate a random character between A and J
         System.out.print(ch + " "); // print the character
      }
      System.out.println(); // print a new line
   }
}
