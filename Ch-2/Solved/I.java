/*
*   Prog. 1 |Write a program to accept a character and check the case (upper\lower) otherwise, check whether it is a digit or a character.
*           |Sample Input  :Enter a character
*           |               H
*           |Sample Output
*/

import java.util.Scanner; // import the Scanner class

public class I { // Class created
    public static void main(String[] args) { // main method begins execution of a Java program
        Scanner in = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter a Character:"); //
        char ch = in.next().charAt(0); // read a character
        if (Character.isLetter(ch)) {
            System.out.print("It is a character and it is ");
            if (Character.isUpperCase(ch)) {
                System.out.println("uppercase.");
            } else {
                System.out.println("lowercase.");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        }
        in.close(); // close Scanner
    }
}