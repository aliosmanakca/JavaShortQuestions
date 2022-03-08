package Questions;

import java.util.Scanner;

public class Q14 {
    /*

    Test Data:Java is fun

     Expected Output:

     Character at position 0: J
     Character at position 5: i

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write something");
        String str = scan.nextLine();

        System.out.println("enter a number");
        int number = scan.nextInt();

        System.out.println("Character at position "+ number + " : "+ str.charAt(number) );
    }
}
