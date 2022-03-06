package Questions;

import java.util.Scanner;

public class Q08_Reverse {
    /*

    Test Data : java
    Test Output : avaj

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write something");
        String writing = scan.next();


        // 1. Way
        String newWriting1 = "";

        for (int i = writing.length()-1; i>=0; i--) {
            newWriting1 = newWriting1 + writing.charAt(i);
        }
        System.out.println(newWriting1);


        // 2. Way
        String newWriting2 = "";
        String[] arr = writing.split("");

        for (int i = arr.length-1; i>=0; i--) {
            newWriting2 = newWriting2 + arr[i];
        }
        System.out.println(newWriting1);


        // 3. Way
        StringBuffer newWriting3 = new StringBuffer(writing);
        // StringBuffer class is used to create a mutable string object. String objects are immutable.

        newWriting3.reverse();
        System.out.println(newWriting3);



    }
}
