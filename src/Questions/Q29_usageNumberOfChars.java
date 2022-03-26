package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q29_usageNumberOfChars {
    /*

    Test Data : Java is good
    Test Output : j=1 a=2 v=1 i=1 s=1 g=1 o=2 d=1

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0;  i<data.length();  i++){
            int count = 0;
            for (int j = 0;  j<data.length();  j++){
                if (data.charAt(i) == data.charAt(j)){
                    count++;
                }
            }
            map.put(String.valueOf(data.charAt(i)),count);
        }

        System.out.println(map);

    }
}
