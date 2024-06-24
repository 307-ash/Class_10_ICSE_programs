/*
 * Prog. 2 | Write a program in Java to input character. Display next 5 characters.
 */

 import java.util.Scanner; // import the Scanner class

 public class II { // class created
    public static void main(String[] args) { // main method begins execution of a Java program
      Scanner in = new Scanner(System.in); // create a Scanner object
      char ch; // declare a character variable
      System.out.print("Enter a character: "); // prompt user to enter character
      ch = in.nextLine().charAt(0); // read a character
      ch += 1; // increment the character by 1
      if (ch >= 'z' || ch >= 'Z') { // check if the character is a letter
         ch = (char) (ch - 26); // decrement the character by 26
      }
      for (int i = 0; i < 5; i++) { // loop to display next 5 characters
         System.out.println((char) (ch + i) + " "); // display next 5 characters
      }
      in.close(); // close Scanner
   }
}
