package Questions;

import java.util.Locale;
import java.util.Scanner;

public class Q12 {
    /*

    Test Data: Java is fun

    Expected Output: JAVA IS FUN

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        String newData = data.toUpperCase();
        System.out.println(newData);
    }
}
