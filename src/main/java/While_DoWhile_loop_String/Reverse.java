package While_DoWhile_loop_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int reverse = 0;
        while (num!=0){
            int rem = num%10;
            num=num/10;
            reverse=reverse*10+rem;
        }
        System.out.println(reverse);
    }
}
