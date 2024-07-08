/*
 * Prog. 6 | Write a program to input two characters from the keyboard. Find the difference (d) between their ASCII codes. Display the following messages: 
 *         | if d = 0      : both the characters are same.
 *         | if d < 0      : first character is smaller.
 *         | if d > 0      : second character is smaller.
 *         | Sample Input  :D
 *         |                P
 *         | Sample Output :d = (68 - 80) = -12
 *         |                First character is smalller
 */

public class VI {
   public static void main(String[] args) {
      char ch1 = 'D';
      char ch2 = 'P';
      
      int d = ch1 - ch2;
      
      System.out.println("d = " + d);
      
      if (d == 0) {
         System.out.println("Both the characters are same.");
      } else if (d < 0) {
         System.out.println("First character is smaller.");
      } else {
         System.out.println("Second character is smaller.");
      }
   }
}