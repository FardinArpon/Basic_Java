
/*Write a program to show range of prime numbers from 2 to n using while loop
 [n is the number by user input]
 */

package P3_While_DoWhile_loop_String;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {

            int number, digit, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            while(number > 0)
            {
//finds the last digit of the given number
                digit = number % 10;
//adds last digit to the variable sum
                sum = sum + digit;
//removes the last digit from the number
                number = number / 10;
            }
//prints the result
            System.out.println("Sum of Digits: " +sum);
        }
    }


