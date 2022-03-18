package Questions;

import java.util.Scanner;

public class Q25_isPrime {
    /*

    Write a Java Method that returns true when a number is prime and false otherwise.

    isPrime(31):true

    isPrime(18):false

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scan.nextInt();

        isPrime(number);
    }

    private static void isPrime(int number) {
        if (number==2 || number==3 || number==5 || number==7) {
            System.out.println(true);
        }else if (number%2!=0 && number%3!=0 && number%5!=0 && number%7!=0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }



}
