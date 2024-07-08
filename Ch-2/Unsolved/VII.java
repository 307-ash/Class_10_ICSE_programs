/*
 * Prog. 7 | Write a program to input a set of any 10 integer numbers. Find the sum and products of the numbers. Join the sum and product to form a single number. Display the concatenated number.
 *         | HINT: let the sum = 245 and product = 1346 then the number after joining sum and product will be 2451346
 */

import java.util.Scanner; //import Scanner class

public class VII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create Scanner object
        int sum = 0; //initialize sum to 0
        int product = 1; //initialize product to 1
        System.out.println("Enter 10 integers:"); //prompt user to enter 10 integers
        for (int i = 0; i < 10; i++) { //loop 10 times
            int num = sc.nextInt(); //read integer from user
            sum += num; //add integer to sum
            product *= num; //multiply integer to product
        }
        sc.close(); //close Scanner object
        String sumStr = Integer.toString(sum); //convert sum to string
        String productStr = Integer.toString(product); //convert product to string
        String concatenatedNumber = sumStr + productStr; //concatenate sum and product strings
        int finalNumber = Integer.parseInt(concatenatedNumber); //convert concatenated string to integer
        System.out.println("The concatenated number is: " + finalNumber); //display concatenated number
    }
}

