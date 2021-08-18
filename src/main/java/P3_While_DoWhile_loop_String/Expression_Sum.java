
/*1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
Find total price and total quantity using regular expression.
 */

package P3_While_DoWhile_loop_String;

public class Expression_Sum {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" +", " ");
        String s = str.replaceAll("\\D", " ");
//        System.out.println(s);
        String[] arr=(s.split(" "));

        double p1=Double.parseDouble(arr[0]);
        double p2=Double.parseDouble(arr[1]);
        double p3=Double.parseDouble(arr[2]);
        double p4=Double.parseDouble(arr[3]);
        double p5=Double.parseDouble(arr[4]);
        double p6=Double.parseDouble(arr[5]);

        double Quantity = p1+p3+p5;
        double Cost=p2+p4+p6;

        System.out.println("total quanty is: "+Quantity);
        System.out.println("Total cost is TK: "+Cost);
    }
}
