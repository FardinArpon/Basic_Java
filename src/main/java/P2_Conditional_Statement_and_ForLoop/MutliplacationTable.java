
/*Take a number as input from the user. Now write a program to show table of the given numbers.
 Output will be shown like this:
 10*1=10
 10*2=20
 10*3=20*/

package P2_Conditional_Statement_and_ForLoop;
import java.util.Scanner;
public class MutliplacationTable {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num=sc.nextInt();//reading a number whose table is to be print

//loop start execution form and execute until the condition i<=10 becomes false
            for(int i=1; i <= 10; i++)
            {
 //prints table of the entered number
                System.out.println(num+ " * " +i+ " = " +num*i);
            }
        }
    }
