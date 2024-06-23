/*
 *  Prog. 6 |Write a program in Java to input a letter. If it is a uppercase letter then encode it by 5th letter, otherwise encode it with 3rd previous letter in the ASCII table.
 */

import java.util.Scanner; // import the Scanner class

public class VI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter a Character:"); // prompt user to enter a character
        char ch = in.next().charAt(0); // read a character
        char encoded = ch; // create a variable to store the encoded character
        if (Character.isUpperCase(ch)) {
            encoded = (char) (ch + 5); // if the character is a uppercase letter then encode it by 5th letter
            if (encoded > 'Z') { // checking if the encoded character excedes Z
                encoded = (char) (encoded - 26); // subtracting 26
            }
        } else if (Character.isLowerCase(ch)) {
            encoded = (char) (ch - 3); // if the character is an lowercase letter then encode it by 3rd previous letter
            if (encoded > 'a') { // checking if the encoded character excedes a
                encoded = (char) (encoded + 26); // adding by 26
            }
        }
        System.out.println("Encoded Character: " + encoded); // display the encoded character
        in.close(); // close Scanner
    }
}
