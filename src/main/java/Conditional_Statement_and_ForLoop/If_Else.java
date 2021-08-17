package Conditional_Statement_and_ForLoop;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please int a num to cheek pos or neg: ");
        int number = scan.nextInt();

        if(number>=0){
            System.out.println("num is positive");
        }
        else if(number<=0){
            System.out.println("num is negative");
        }
    }
}
