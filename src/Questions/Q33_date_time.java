package Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q33_date_time {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        //LocalDate date = LocalDate.of(1974, 4, 3);
        System.out.println(date);

        LocalTime time = LocalTime.now();
        //LocalTime time = LocalTime.of(12, 35, 23);
        System.out.println(time);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        // properties
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());




        // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Date formatter
        LocalDate date1=LocalDate.of(2020, 5, 15);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");//    15/5/20
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");//  15/05/20
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");// 15/May/20
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/M/yyyy");// 15/5/2020

        System.out.println(dtf.format(date1));
        System.out.println(dtf1.format(date1));
        System.out.println(dtf2.format(date1));
        System.out.println(dtf3.format(date1));


        // Time formatter
        LocalTime time1 = LocalTime.of(19,45);

        DateTimeFormatter timeFormatter24 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(timeFormatter24.format(time1));

        DateTimeFormatter timeFormatter12 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(timeFormatter12.format(time1));
    }
}
