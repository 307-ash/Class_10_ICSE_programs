/*
 * Prog. 10|Write a program in Java to generate the following pattern:
 *         |A 
 *         |AB
 *         |ABC
 *         |ABCD
 *         |ABCDE
 */

public class X { //create a new class
   public static void main(String[] args) { //create a main method
      int i, j; //create two integer variables i and j
      for (i = 1; i <= 5; i++) { //loop 5 times
         for (j = 1; j <= i; j++) { //loop i times
            System.out.print((char) ('A' + j - 1) + " "); //print the character
         }
         System.out.println(); //print a new line
      }
   }
}
