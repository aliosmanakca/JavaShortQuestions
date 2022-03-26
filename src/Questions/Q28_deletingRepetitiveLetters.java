package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q28_deletingRepetitiveLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        // 1.Way
        String data1 = data;

        for (int i = 0;  i < data1.length();  i++){
            if (data1.indexOf(data1.charAt(i)) != data1.lastIndexOf(data1.charAt(i))){
                data1 = data1.replaceAll(String.valueOf(data1.charAt(i)), "");
            }
        }

        System.out.println(data1);


        // 2. Way
        List<String> repetitiveLetters = new ArrayList<>();

        List<String> allLetters = new ArrayList<>(); // I didn't use Arrays.asList because it returns a fixed size list
        for (int i = 0;  i < data.length();  i++){
            allLetters.add(String.valueOf(data.charAt(i)));
        }

        for (int i = 0;  i < allLetters.size();  i++) {
            if (allLetters.lastIndexOf(allLetters.get(i)) != allLetters.indexOf(allLetters.get(i))) {
                if (!repetitiveLetters.contains(allLetters.get(i))){
                    repetitiveLetters.add(allLetters.get(i));
                }
            }
        }

        System.out.println(repetitiveLetters);
        allLetters.removeAll(repetitiveLetters);
        System.out.println(allLetters);


    }
}
