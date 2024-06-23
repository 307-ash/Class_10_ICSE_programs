/*
 *   Prog. 2 |Write a program to enter a letter. Change the case of the input letter and display the new letter and its ASCII code.
 *           |Sample Input:b
 *           |Sample Output:B 
 *           |The ASCII value of B is 66
*/

import java.util.Scanner; // import the Scanner class

public class II { // Class created
    public static void main(String[] args) { // main method begins execution of a Java program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character:"); // prompt user to enter a character
        char ch = in.next().charAt(0); // read a character
        if (ch >= 65 && ch <= 90) { // check if the character is an uppercase letter
            char temp = Character.toLowerCase(ch); // convert to lowercase
            System.out.println("The lowercase of " + ch +" is " + temp + ", Its ASCII value is " + (int)temp); // display the character and its ASCII code
        } else if (ch >= 97 && ch <= 122) { // check if the character is a lowercase letter
            char temp = Character.toUpperCase(ch); // convert to uppercase
            System.out.println("The uppercase of " + ch +" is " + temp + ", Its ASCII value is " + (int)temp); // display the character and its ASCII code
        }
        in.close(); // close Scanner
    }
}
