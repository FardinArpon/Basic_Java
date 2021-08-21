
//Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
//Output: 2, 7, 10package P4_Function_Array;

import java.util.Arrays;
import java.util.Scanner;

public class N3_Duplicate_Value {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        Arrays.sort(numbers);
        int i, j, counter=0;

        for (i=0; i<numbers.length; i++)
        {
            for (j=i+1; j<numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                    System.out.print(numbers[i]+" ");
            }
        }
    }
}