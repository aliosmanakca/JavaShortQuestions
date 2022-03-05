package Questions;

import java.util.Scanner;

public class Q05 {
    /*

           *
          ***
         *****
        *******
       *********
      ***********
     *************
      ***********
       *********
        *******
         *****
          ***
           *

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter an odd number");
        int no = scan.nextInt();
        int number = 0;

        if (no%2!=0){
            number=no;
        }else {
            do {
                System.out.println("enter an odd number");
                 no = scan.nextInt();
            }while (no%2==0);
            number=no;
        }

        for (int i = 1; i<=number; i++) {

            for (int space = number-i;  space>0;  space--) {
                System.out.print(" ");
            }

            for (int j = 1;   j<=(2*i)-1;  j++){
                System.out.print("*");
            }

            System.out.println("");

        }


        for (int i = number-1; i>=1; i--) {

            for (int space = 0;  space<number-i;  space++) {
                System.out.print(" ");
            }

            for (int j = (2*i)-1; j>=1; j--){
                System.out.print("*");
            }

            System.out.println("");

        }



    }
}
