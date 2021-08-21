
/*Write a program to show range of prime numbers from 2 to n using while loop
[n is the number by user input] */

package P3_While_DoWhile_loop_String;
import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Value of 'N' : ");
        int high = scan.nextInt();
        int low = 2;

//        while (low < high
        { boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for nonprime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}

