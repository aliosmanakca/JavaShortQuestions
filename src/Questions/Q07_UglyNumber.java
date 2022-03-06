package Questions;

import java.util.Scanner;

public class Q07_UglyNumber {
    /*

     Write a Java program to check whether an entered number is ugly number.
     In the number system, ugly numbers are only positive numbers with prime factors of 2, 3, or 5.
     The top 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. As a rule, 1 incl.

     Test Data : 13
     Expected output : not ugly number

     Test Data : 25
     Expected Output : ugly number

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();

        if (number%2!=0 && number%3!=0 && number%5!=0) {
            System.out.println("not ugly number");
        }else {
            System.out.println("ugly number");
        }

    }
}
