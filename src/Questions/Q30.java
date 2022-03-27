package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
    /*

     Capitalize the first letters of all words in the entered text.

     Sample
     makeTitle("This is a title")
     This is a Title

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        String [] arr = data.split(" ");
        String [] arrNew = new String[arr.length];
        String temp = "";

        for (int i = 0 ;  i < arr.length;  i++) {
            temp = String.valueOf(arr[i].charAt(0)).toUpperCase().concat(arr[i].substring(1));
            arrNew[i] = temp;
        }

        System.out.println(Arrays.toString(arrNew));

    }
}
