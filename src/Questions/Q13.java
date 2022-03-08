package Questions;

import java.util.Scanner;

public class Q13 {
    /*

    Write Java Code to verify if the word to be entered is a palindrome.

     Test Data: madam

     Expected Output: true

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write something");
        String str = scan.nextLine();

        String newStr = "";

        for (int i = str.length()-1; i>=0; i--) {
            newStr = newStr + str.charAt(i);
        }

        System.out.println((str.equals(newStr)));
    }
}
