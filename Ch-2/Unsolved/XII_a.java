/*
 * Prog. 12| Write a program in Java to display the following patterns:
 *         |  (a) A
 *         |      ab 
 *         |      ABC
 *         |      abcd
 *         |      ABCDE
 */

public class XII_a { //class created
   public static void main(String[] args) { // create a main method 
         for (int i = 1; i <= 5; i++) { // loop for rows
         for (int j = 1; j <= i; j++) { // loop for columns
            if (i % 2 == 0) { // check if row is even
               System.out.print((char) (j + 96)); // print lowercase letter
            } else { // if row is odd
               System.out.print((char) (j + 64)); // print uppercase letter
            }
         }
         System.out.println(); // print new line
      }
   }
}
