
/*Write a program to make a digital tasbih where the program counts
 each time user press enter until press 0
 */

package P3_While_DoWhile_loop_String;

import java.util.Scanner;

public class Digital_Tasbih {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("   Press Enter! ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            sum += 1;
            System.out.println(sum);
        }

    }
}

