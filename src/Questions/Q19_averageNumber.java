package Questions;

import java.util.Scanner;

public class Q19_averageNumber {
    /*

     Write the Java Code that calculates the average of the numbers in the array.

     Array = [20, 30, 25, 35, -16, 60, -100 ]

     Expected Output: Average of Array Numbers: 7.0

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int numbers = scan.nextInt();

        //List<Object> list = new ArrayList<>();
        int [] list = new int[numbers];
        int no = 0;
        int i = 0;


        do {
            System.out.println("enter " + (i+1) + ". number");
            no = scan.nextInt();
            list[i]=no;

            i++;
        } while ( i<numbers);

        System.out.println("Average of Array Numbers: " + varArgsCollect(numbers,list));

    }


    private static double varArgsCollect(int numbers, int... i) {  // varargs can accept Array, not List.
        double total = 0;

        for (int each : i) {
            total += each;
        }

        double average = total/numbers;

        return average;
    }



}
