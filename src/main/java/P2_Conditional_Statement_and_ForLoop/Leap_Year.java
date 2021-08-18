
/*Write a program that takes a year from user and
print whether that year is a leap
 */

package P2_Conditional_Statement_and_ForLoop;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);  //takinng user form input
        System.out.print("Enter any Year:");
        year = scan.nextInt();

//                    <-------conditions----------->

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}



