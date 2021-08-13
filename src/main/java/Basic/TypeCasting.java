package Basic;

import java.util.Scanner;

public class TypeCasting {

        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the  number: ");
            double num = scan.nextDouble(); // Get the double value

            // convert into int
            int value = (int)num;

            // print the int value
            System.out.println(value);
        }

}
