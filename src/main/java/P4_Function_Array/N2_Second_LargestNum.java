
//Find the second largest number from an array by user input using function

package P4_Function_Array;

import java.util.Scanner;

public class N2_Second_LargestNum {
    public static void main(String[] args) {

        int[] arr = {5,3,7,8,2,68,4,19};
        int largest = 0, second_largest = 0;
        for (int i = 0; i < arr.length; i++) {
            //this condition will keep evaluating unless i is less than the length of array or largest number is not found
            if (arr[i] > largest) //if(arr[i] > 0)
            {
                second_largest = largest; //second_largest = 0
                largest = arr[i]; //assigning the largest element of array to 'largest' variable
            } else if (arr[i] > second_largest && arr[i] != largest)//if above condition is false, this will be evaluated in order to find the second largest number
            {

                second_largest = arr[i];
            }
        }
        System.out.println("Largest:" + largest + "\nSecond largest:" + second_largest);
    }
}

