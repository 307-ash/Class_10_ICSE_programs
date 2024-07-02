/*
 * Prog. 4 | Write a program to input a set of 20 letters. Convert each letter into upper case. Find and dispaly the number of vowels and number of consonants present in the set of given letters.
 */

 import java.util.Scanner; // import the Scanner class

 public class IV { // class created
   public static void main(String[] args) { // main method begins execution of a Java program
      Scanner in = new Scanner(System.in); // create a Scanner object
      char ch[] = new char[20]; // create a character array
      int vowels = 0, consonants = 0; // create two variables to store the number of vowels and consonants
      System.out.print("Enter 20 letters one by one: "); // prompt user to enter 20 letters
      for (int i = 0; i < ch.length; i++) { // loop to read 20 letters
         ch[i] = in.nextLine().charAt(0); // read a character
         ch[i] = Character.toUpperCase(ch[i]); // convert the character into upper case
         if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') { // check if the character is a vowel
            vowels++; // count the number of vowels
         } else if (ch[i] >= 'A' && ch[i] <= 'Z') { // check if the character is a consonant
            consonants++; // count the number of consonants
         }
      }
      System.out.println("Number of vowels: " + vowels); // display the number of vowels
      System.out.println("Number of consonants: " + consonants); // display the number of consonants
      in.close(); // close Scanner
   }
}