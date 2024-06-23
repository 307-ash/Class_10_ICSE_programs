/*
 *  Prog. 5 |Write a program in Java to input two integer numbers. Join them together to form a single number.
 *          |Sample Input
 *          |First number is 134
 *          |Second number is 96
 *          |Sample Output
 *          |Number after joining 13496
*/

import java.util.Scanner; // import the Scanner class

public class V {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter First Number: "); // prompt user to enter first number
        int num1 = in.nextInt(); // read first number
        System.out.print("Enter Second Number: "); // prompt user to enter second number
        int num2 = in.nextInt(); // read second number
        String num = String.valueOf(num1) + String.valueOf(num2); // convert the variables to string and join them together
        System.out.println("Number after joining: " + num); // display the number after joining
        in.close(); // close Scanner
    }
}
