/*
 * Prog. 3 | Write a program in Java to generate all the alternate letters in the range of letters from A to Z.
 */

public class III { // class created
   public static void main(String[] args) { // main method begins execution of a Java program

      for (char ch = 'A'; ch <= 'Z'; ch += 2) { // loop to display alternate letters
         System.out.println(ch); // display alternate letters
      }
   }
}