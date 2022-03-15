package Questions;

import java.util.Scanner;

public class Q23 {
    /*

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"


     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String writing = scan.nextLine();

        String str = "";
        String[] arr = writing.split(" ");

        for (int i = arr.length-1; i >= 0; i--){
            str = str + arr[i] + " ";
        }

        System.out.println(str);



    }
}
