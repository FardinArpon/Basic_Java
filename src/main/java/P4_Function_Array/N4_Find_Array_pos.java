

package P4_Function_Array;

public class N4_Find_Array_pos {
        public static int findIndex ( int arr[], int t)
        {

            // if array is Null
            if (arr == null) {
                return -1;
            }

            // find length of array
            int len = arr.length;
            int i = 0;

            // traverse in the array
            while (i < len) {

                // if the i-th element is t
                // then return the index
                if (arr[i] == t) {
                    return i;
                } else {
                    i = i + 1;
                }
            }
            return -1;
        }

        // Driver Code
        public static void main (String[]args)
        {
            int[] my_array = {10,5,2,3,2,7,7,15,10};

            // find the index of 7
            System.out.println("Index position of 7 is: "
                    + findIndex(my_array, 7));
        }
    }

