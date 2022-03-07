package Questions;

import java.util.Scanner;

public class Q11_DeletingLastChar {
    /*

    Test Data: good

    Expected Output: goo

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        StringBuffer str4 = new StringBuffer(data);

        // 1. Way
        str1 = data.substring(0, data.length()-1);
        System.out.println(str1);

        // 2. Way
        str2 = data.replaceAll(".$","");
        System.out.println(str2);

        // 3. Way
        String[] arr = data.split("");
        for (int i = 0; i<= arr.length-2; i++) {
            str3 = str3 + arr[i];
        }
        System.out.println(str3);

        // 4. Way
        str4.deleteCharAt(data.length()-1);
        System.out.println(str4);
    }

}
