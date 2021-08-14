
/*Create a math quiz program. Scenario: 2 numbers will generate randomly and
 prompt user to input the summation of 2 numbers. If user inputs the correct summation,
 print "Answer is correct" and user will get 1 point. if user inputs wrong summation,
 then user will get 0 point. Finally after 5 iteration, total score will be shown */

package Loop;

import java.util.Random;
import java.util.Scanner;

public class RandomSum {
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class

        int point = 0, question = 1;
        for (int i = 0; i < 5; i++) {
            int upperbound = 99;

            //generate random values from 0-24
            int int_random1 = rand.nextInt(upperbound);
            int int_random2 = rand.nextInt(upperbound);

//print the summation ans from user

            int sum, output = 0;
            sum = int_random1 + int_random2;
            //System.out.println(sum);

            Scanner scan = new Scanner(System.in);
            System.out.println("Question" + question++);
            System.out.println("What is the sum of " + (int_random1) + " and " + (int_random2) + " ?");
            ;
            output = scan.nextInt();

//Apply if-else condition

            if (output == sum) {
                point++;
                System.out.println("Correct!! \n");
            } else {
                System.out.println("Wrong!! \n");

            }
        }
        System.out.println("Quiz End!\nYour total point is: " + point + " out of 5");
    }
}

