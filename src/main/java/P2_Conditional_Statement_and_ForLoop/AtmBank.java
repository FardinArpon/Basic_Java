
/*Write a program to check balance and withdraw money from ATM booth using switch case and if else
 (1. Check balance 2. Withdraw Money)*/

package P2_Conditional_Statement_and_ForLoop;

import java.util.Scanner;
public class AtmBank {

    public static Scanner in;
    public static int balance = 10000;

    public static void main(String[] args) {
        System.out.println("Welcome to our Atm_Bank, you can withdraw and balance");
        in = new Scanner(System.in);
        transaction();
    }

    public static void transaction(){
        int choice;
        System.out.println("1. Withdraw ");
        System.out.println("2. Balance");
        System.out.println ("---Please select an option: " );//input your choice
        choice = in.nextInt();

// Apply switch case and if- else condition

        switch (choice){
            case 1:
                int amount;
                System.out.println("Please enter an amount you would like to withdraw \n" +
                        " Note: the amount must be multiple of 500");
                amount = in.nextInt();
                if ((amount > balance || amount == 0)  ){
                    System.out.println("You have a insufficient with your funds\n\n");

                }
                else if ((amount % 500 != 0)){
                    System.out.println("You have a press worng amonunt \n please enter valid amount \n");

                }

                else{
                    // They have some money
                    // update balance
                    balance = balance - amount;
                    System.out.println("You have withdrawn tk: " + amount + "\n And your current new balance is now tk: " + balance + "\n");

                }
                break;

            case 2:
                // to balance
                System.out.println("Your balance is tk " + balance + "\n");
                break;
        }
    }

}
