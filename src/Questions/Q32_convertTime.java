package Questions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q32_convertTime {
    /*

     timeConvert("21:00") ➞ "09:00 pm"

     timeConvert("05:05") ➞ "05:05 am"

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the hour");
        int hour = scan.nextInt();

        System.out.println("enter the minute");
        int minute = scan.nextInt();


        if (hour>=0 && hour<=23 && minute>=0 && minute<=59){

            LocalTime time = LocalTime.of(hour,minute);
            DateTimeFormatter timeFormatter12 = DateTimeFormatter.ofPattern("hh:mm a");
            System.out.println(timeFormatter12.format(time));

        }else{
            System.out.println("you didn't enter correct numbers");
        }



    }
}
