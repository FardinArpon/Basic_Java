package P1_Basic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int minRange, maxRange;
        System.out.print("Enter The minmum range: ");
        minRange=sc.nextInt();
        System.out.print("Enter The maximum range: ");
        maxRange=sc.nextInt();

        int value = rand.nextInt(maxRange - minRange) + minRange;

        System.out.println("The random value is: " + value);
    }
}

