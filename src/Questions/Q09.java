package Questions;

import java.util.Scanner;

public class Q09 {
    /*

    Test Data:
    str1: Java is
    str2: fun

    Expected Output : java is fun

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write first thing");
        String str1 = scan.nextLine();

        System.out.println("write second thing");
        String str2 = scan.nextLine();

        // 1. Way
        String newStr1 = str1 + str2 ;
        System.out.println(newStr1);

        // 2. Way
        String newStr2 = str1.concat(str2);
        System.out.println(newStr2);


    }
}
