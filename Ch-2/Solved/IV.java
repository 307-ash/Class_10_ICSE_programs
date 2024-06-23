/*
 *  Prog. 4 |Write a program in java to input a set of N characters. Find and display the number of uppercase and lowercase characters. Assuming that none of the characters is a digit or a special character.
*/

import java.util.Scanner; // import the Scanner class

public class IV { // Class created
    public static void main(String[] args){ // main method begins execution of a Java program
        Scanner in = new Scanner(System.in); // create a Scanner object
        int ch[] = new int[10]; // create an array of 10 integers
        System.out.println("Enter 10 Cahracters: "); // prompt user to enter 10 characters
        for(int i = 0; i < 10; i++){ // for loop for 10 times
            ch[i] = in.nextInt(); // store the character in the array
        }
        int upper = 0, lower = 0; // create two variables to store the number of uppercase and lowercase characters
        for(int i = 0; i < 10; i++){ // for loop for 10 times
            if(Character.isUpperCase(ch[i])){ // check if the character is an uppercase letter
                upper++; // count the number of uppercase letters
            }
            else if(Character.isLowerCase(ch[i])){ // check if the character is a lowercase letter
                lower++; // count the number of lowercase letters
            }
        }
        System.out.println("Number of Uppercase Characters: " + upper); // display the number of uppercase and lowercase characters
        System.out.println("Number of Lowercase Characters: " + lower); // display the number of uppercase and lowercase characters
        in.close(); // close Scanner
    }
}
