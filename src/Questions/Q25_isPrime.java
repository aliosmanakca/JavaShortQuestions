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

        isPrimeWay2(number);
    }


    private static void isPrime(int number) {
        if (number < 2){
            System.out.println(false);
        }
        else if (number==2 || number==3 || number==5 || number==7) {
            System.out.println(true);
        }else if (number%2!=0 && number%3!=0 && number%5!=0 && number%7!=0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }


    private static void isPrimeWay2(int number) {
        boolean condition = true;

        if (number < 2){
            condition = false;
        }

        if (number > 2){
            for (int i=2; i<number; i++){
                if ((number%i)==0){
                    condition = false;
                }
            }
        }

        System.out.println(condition);

    }



}
