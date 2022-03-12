package Questions;

import java.util.Scanner;

public class Q17_leapYear {
    /*

     Write a Java Method to check if a user entered year is a leap year.
     The year must be evenly divisible by 4. If the year can also be evenly divided by 100, it is not a
     leap year unless the year is also evenly divisible by 400. Then it is a leap year.
     This means that the year 2000 was a leap year, although 1900 was not. 2020, 2024 and 2028 are all leap years.

     Test Data: 2017
     Expected Output: false

     Test Data: 2016
     Expected Output: true

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a year");
        int year = scan.nextInt();


        if (year%4==0){

            if (year%100==0 && year%400!=0) {
                System.out.println(false);
            }else {
                System.out.println(true);
            }

        } else {
            System.out.println(false);
        }



    }
}
