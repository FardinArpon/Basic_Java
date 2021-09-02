import java.util.Scanner;

public class Pj3_Bikash {
    public static void main(String[] args) {

        int PIN = 1234;
        double balance = 5000;
        Scanner scanner = new Scanner(System.in);
        int coun = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("......Welcome to Our Bank...... \n     Please Enter Your PIN");
            int pin = scanner.nextInt();
            if (PIN == pin) {
//                System.out.println("Balance is " + balance + " Tk");

                System.out.println("1. Check balance");
                System.out.println("2. Withdraw balance");
                System.out.println("3. Deposit balance");
             break;
            } else {
                System.out.println("Wrong PIN inserted");
            }
            coun++;
        }
        if (coun >= 3) {
            System.out.println("You have entered wrong PIN 3 times. \nCard has blocked!!");
            return;
        }


        int choice = scanner.nextInt();
        switch (choice) {


//////////////////////////   Balance Section  ///////////////////////////

            case 1:

                System.out.println("Balance is " + balance + " Tk");
                break;

//////////////////////////   Withdraw Section  ///////////////////////////

            case 2:

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


//////////////////////////   Deposit Section  ///////////////////////////


            case 3:
                // This is to deposit

                int deposit;
                System.out.println("Please enter the amount you would like to put in: ");
                deposit = scanner.nextInt();
                // update balance
                balance = deposit + balance;
                System.out.println("You have deposited " + deposit + " new balance is. " + balance + "\n");
                break;


            default:
                System.out.println("Please select option either 1 , 2, 3");

        }
    }

}

