package P1_Basic;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter the number of b: ");
        double b = scan.nextDouble();

        double c = a+b;
        int x = 2;

        System.out.println(Math.pow(c,x));

    }
}
