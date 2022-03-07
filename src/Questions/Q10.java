package Questions;

import java.util.Scanner;

public class Q10 {
    /*

    Test Data: Java is easy

    Wanted String: is
    Expected Output: True

    Wanted String: and
    Expected Output: False

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        System.out.println("write something that the test data contains");
        String str = scan.nextLine();

        System.out.println(data.contains(str));
    }
}
