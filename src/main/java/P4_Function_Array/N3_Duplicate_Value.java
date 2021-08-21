
//Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
//Output: 2, 7, 10package P4_Function_Array;

import java.util.Arrays;
import java.util.Scanner;

public class N3_Duplicate_Value {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        System.out.println(user);
        int arr[] = new int[user];
        int darr[] = new int[user];
        int dindex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    darr[dindex] = arr[i];
                    dindex++;
                }
            }
        }
        System.out.println(Arrays.toString(darr));
    }
}

