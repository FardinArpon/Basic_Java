package Pj2_ATM_Bank;

import java.util.Scanner;

public class Atm_Booth {
    public static void main(String[] args) {
        int PIN = 1234;
        double balance = 5000;
        Scanner scanner = new Scanner(System.in);
        int coun = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your PIN");
            int pin = scanner.nextInt();
            if (PIN == pin) {
                System.out.println("Balance is " + balance + " Tk");
                break;
            } else {
                System.out.println("Wrong PIN inserted");
            }
            coun++;
        }
        if (coun >= 3) {
            System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
        }


        System.out.println("1. Check balance");
        System.out.println("2. Withdraw balance");
        System.out.println("3. Deposit balance");

        int choice = scanner.nextInt();
        switch (choice) {


//////////////////////////   Balance Section  ///////////////////////////


            case 1:
                int count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter your PIN");
                    int pin = scanner.nextInt();
                    if (PIN == pin) {
                        System.out.println("Balance is " + balance + " Tk");
                        break;
                    } else {
                        System.out.println("Wrong PIN inserted");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;


//////////////////////////   Withdraw Section  ///////////////////////////


            case 2:
                count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter your PIN");
                    int pin = scanner.nextInt();
                    if (PIN == pin) {
                        System.out.println("Input amount that multiply by 500");
                        int amount = scanner.nextInt();
                        if (amount <= balance && amount % 500 == 0) {
                            balance -= amount;
                            System.out.println("Withdraw successful. Your current balance is " + balance + " Tk");
                            break;
                        } else if (amount > balance) {
                            System.out.println("Not enough balance. Please input valid amount");
                        } else {
                            System.out.println("Balance is not multiply by 500. Please try with another amount");
                        }
                    } else if (PIN != pin) {
                        System.out.println("Wrong PIN inserted");
                    } else if (count >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;


//////////////////////////   Deposit Section  ///////////////////////////


            case 3:
                count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter your PIN");
                    int pin = scanner.nextInt();
                    if (PIN == pin) {
                        // This is to deposit
                        float deposit;
                        System.out.println("Please enter the amount you would like to put in: ");
                        deposit = scanner.nextFloat();
                        // update balance
                        balance = deposit + balance;
                        System.out.println("You have deposited " + deposit + " new balance is. " + balance + "\n");
                        break;
                    } else if (PIN != pin) {
                        System.out.println("Wrong PIN inserted");
                    } else if (count >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;

            default:
                System.out.println("Please select option either 1 or 2");

        }
    }

}
