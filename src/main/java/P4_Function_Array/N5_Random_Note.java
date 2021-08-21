
/*Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and
each time generate 3 notes randomly and show their summation.
Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk*/

package P4_Function_Array;

import java.util.HashMap;

public class N5_Random_Note {
    public static void main(String[] args) {
        HashMap<Integer, Integer> note = new HashMap<Integer, Integer>();

        note.put(1,2);
        note.put(2,5);
        note.put(3,10);
        note.put(4,20);
        note.put(5,50);
        note.put(6,100);
        note.put(7,200);
        note.put(8,500);
        note.put(9,1000);

//        Declared the range
        int Minmum = 1;
        int Maximum = 9;

        int number1 = (int) (Math.random() * (Maximum - Minmum)) + Minmum;
        int number2 = (int) (Math.random() * (Maximum - Minmum)) + Minmum;
        int number3 = (int) (Math.random() * (Maximum - Minmum)) + Minmum;
//        System.out.println("Sum is:");
        int sum = note.get(number1) + note.get(number2) + note.get(number3);

//    Random Summation of 3 notes
        System.out.println(note.get(number1)+" Tk, "+note.get(number2)+" Tk, "
                +note.get(number3)+" Tk. Total="+sum+" Tk");

   }
}


