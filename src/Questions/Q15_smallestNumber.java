package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q15_smallestNumber {
    /*

     Write a Java METHOD to find the smallest number among the three numbers.

     Test data: 12,24,34

     Expected Output: 12

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number");
        int no1 = scan.nextInt();

        System.out.println("enter second number");
        int no2 = scan.nextInt();

        System.out.println("enter third number");
        int no3 = scan.nextInt();

        int[] array = {no1,no2,no3};

        smallestNumberFirstWay(array);
        smallestNumberSecondWay(array);
        smallestNumberThirdWay(array);
    }



    public static void smallestNumberFirstWay(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }


    private static void smallestNumberSecondWay(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j] && arr[j] <= smallest) {
                    smallest = arr[j];
                }
            }
        }

        System.out.println(smallest);
    }


    private static void smallestNumberThirdWay(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }



}
