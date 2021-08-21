

package P4_Function_Array;

import java.util.Scanner;

public class N4_Find_Array_pos {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to match=");
        int search_value = scanner.nextInt();

        System.out.println("Position: "+findMatching(numbers, search_value));

    }
    public static int findMatching(int[] numbers, int search_value) {
        int i, position=-1;

        for (i=0; i<numbers.length; i++)
        {
            if(numbers[i] == search_value)
            {
                position = i;
                break;
            }
        }
         for (i=0; i<numbers.length; i++)
             System.out.println(numbers[i]);
        return position;
    }
}
