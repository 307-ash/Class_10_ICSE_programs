/*
 * Prog. 9 | Write a program to input a letter. Find its ASCII code. Reverse the ASCII code and display the equivalent character.
 *         | Sample Input: Y
 *         | Sample Output: ASCII Code = 89
 *         | Reverse the code = 98
 *         | Equivalent character: b
 */

 import java.util.Scanner; //imported Scanner class

public class IX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //created Scanner object
        System.out.print("Enter a letter: "); //prompted user to enter a letter
        char letter = sc.next().charAt(0); //stored the input letter in a char variable

        int asciiCode = (int) letter; //converted the letter to its ASCII code
        System.out.println("ASCII Code = " + asciiCode); //printed the ASCII code

        int reversedCode = Integer.parseInt(new StringBuilder(String.valueOf(asciiCode)).reverse().toString()); //reversed the ASCII code
        System.out.println("Reverse the code = " + reversedCode); //printed the reversed ASCII code

        char reversedCharacter = (char) reversedCode; //converted the reversed ASCII code to its equivalent character
        System.out.println("Equivalent character: " + reversedCharacter); //printed the equivalent character

        sc.close(); //closed the Scanner object
    }
}
