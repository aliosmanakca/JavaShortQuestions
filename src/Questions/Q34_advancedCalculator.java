package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q34_advancedCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write a mathematical operation");  // 3*(4+5)/(6-3)   do not use nested parenthesis
        String data = scan.nextLine();

        data = data.replaceAll("[^0-9/*+().-]", ""); // - symbol must be placed first or last in regex otherwise it will be treated as a range indicator

        System.out.println("entered operation = " + data);

        String newData = "";

        if (data.contains("(")){  // inside of the parentheses are handled and then assigned to a new string
            String[] arr1 = data.split("(?=[(])|(?<=[)])");
            for (int i =0; i< arr1.length; i++){
                if (arr1[i].contains("(")){
                    arr1[i] = arr1[i].replaceAll("[()]","");
                    arr1[i]= String.valueOf(fourOperations(arr1[i]));
                }
            }

            for (int i =0; i< arr1.length; i++){
                newData += arr1[i];
            }
            data = newData;

        }

        System.out.println(fourOperations(data));



    }


    public static double fourOperations(String str) {
        String[] arr = str.split("(?<=[-+*/])|(?=[-+*/])");  // (?<=[...]) means look behind assertion, (?=[...]) means look ahead assertion

        List<String> liste = new ArrayList<>();
        for (int i = 0;  i< arr.length;  i++){
            liste.add(arr[i]);
        }

        double result = 0;

        for (int i = 0;  i< liste.size();  i++) {

            if (liste.get(i).matches("[*/]")) {
                switch (liste.get(i)) {
                    case "*":
                        result = Double.parseDouble(liste.get(i - 1)) * Double.parseDouble(liste.get(i + 1));
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.add(i - 1, String.valueOf(result));
                        i = 0;
                        break;
                    case "/":
                        result = Double.parseDouble(liste.get(i - 1)) / Double.parseDouble(liste.get(i + 1));
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.add(i - 1, String.valueOf(result));
                        i = 0;
                        break;
                }
            }
        }

        for (int i = 0;  i< liste.size();  i++) {

            if (liste.get(i).matches("[+-]")){
                switch (liste.get(i)){
                    case "+":
                        result = Double.parseDouble(liste.get(i-1)) + Double.parseDouble(liste.get(i+1));
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.add(i-1, String.valueOf(result));
                        i = 0;
                        break;
                    case  "-":
                        result = Double.parseDouble(liste.get(i-1)) - Double.parseDouble(liste.get(i+1));
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.add(i-1, String.valueOf(result));
                        i = 0;
                        break;
                }
            }
        }

        return result;
    }



}
