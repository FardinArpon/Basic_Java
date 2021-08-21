
//Find the second largest number from an array by user input using function

package P4_Function_Array;

import java.util.Arrays;
import java.util.Scanner;

public class N2_Second_LargestNum {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 Integer Value: ");
        int largest = 0, second_largest = 0;
        for (i = 0; i < 10; i++) {
            System.out.print("Value No: " + (i + 1) + " =");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Second largest number is: " + findMaximum(arr));
    }

    public static int findMaximum(int[] number) {
        Arrays.sort(number);
        int First_largest = number[number.length - 1];
        int second_largest = number[number.length - 2];
        System.out.println("largest num is: "+ First_largest);
        return second_largest;
    }
}
