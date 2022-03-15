package Questions;

import java.util.Arrays;

public class Q24 {
    /*

    Test Data: arrayOfMultiples(7, 5)

    Output: [7,14,21,28,35]

     */
    public static void main(String[] args) {

        arrayOfMultiples(7, 5);
    }

    private static void arrayOfMultiples(int number, int repeat) {
        int [] arr = new int[repeat];

        for (int i = 1; i <= repeat; i++){
            arr[i-1] = i*number;
        }

        System.out.println(Arrays.toString(arr));
    }



}
