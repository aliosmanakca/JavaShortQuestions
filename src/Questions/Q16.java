package Questions;

import java.util.Scanner;

public class Q16 {
    /*

     Write a Java Method to count all vowels in the entered String.

     Test Data: java is fun

     Expected Output: Number of vowels in the string: 4

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        method1(data);

    }

    private static void method1(String data) {
        int number = 0;
        for (int i = 0; i<data.length(); i++) {
            if (String.valueOf(data.charAt(i)).matches("[aeiou]")) {
                number++;
            }
        }
        System.out.println(number);
    }


}
