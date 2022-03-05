package Questions;

import java.util.Scanner;

public class Q04 {
  /*4
            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();

        for (int i = 1; i<=number; i++) {
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }
}
