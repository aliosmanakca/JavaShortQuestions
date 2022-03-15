package Questions;

import java.util.Arrays;

public class Q22_secondBiggestNumber {
    /*

     Write the Java Code that finds the 2nd largest number in the Array list.

     Array: [1232,2345,5467,678,3454,2312,3451]

     */
    public static void main(String[] args) {

        int [] arr = {1232,2345,5467,678,3454,2312,3451};

        // 1. Way
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

        // 2. Way
        int biggest = 0;
        int secondBiggest = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]>biggest){
                secondBiggest = biggest;
                biggest = arr[i];
            }
        }

        System.out.println(secondBiggest);



    }
}
