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

        System.out.println(data);

        String newData = "";

        if (data.contains("(")){
            String[] arr1 = data.split("(?=[(])|(?<=[)])");

            for (int i =0; i< arr1.length; i++){
                if (arr1[i].contains("(")){
                    arr1[i] = arr1[i].replaceAll("[()]","");
                    String[] arr = arr1[i].split("(?<=[-+*/])|(?=[-+*/])");  // (?<=[...]) means look behind assertion, (?=[...]) means look ahead assertion

                    List<String> liste = new ArrayList<>();
                    for (int j = 0;  j< arr.length;  j++){
                        liste.add(arr[j]);
                    }

                    double result = 0;

                    for (int k = 0;  k< liste.size();  k++) {

                        if (liste.get(k).matches("[*/]")) {
                            switch (liste.get(k)) {
                                case "*":
                                    result = Double.parseDouble(liste.get(k - 1)) * Double.parseDouble(liste.get(k + 1));
                                    liste.remove(k - 1);
                                    liste.remove(k - 1);
                                    liste.remove(k - 1);
                                    liste.add(k - 1, String.valueOf(result));
                                    k = 0;
                                    System.out.println("*" + result);
                                    break;
                                case "/":
                                    result = Double.parseDouble(liste.get(k - 1)) / Double.parseDouble(liste.get(k + 1));
                                    liste.remove(k - 1);
                                    liste.remove(k - 1);
                                    liste.remove(k - 1);
                                    liste.add(k - 1, String.valueOf(result));
                                    k = 0;
                                    System.out.println("/" + result);
                                    break;
                            }
                        }
                    }

                    for (int l = 0;  l< liste.size();  l++) {

                        if (liste.get(l).matches("[+-]")){
                            switch (liste.get(l)){
                                case "+":
                                    result = Double.parseDouble(liste.get(l-1)) + Double.parseDouble(liste.get(l+1));
                                    liste.remove(l-1);
                                    liste.remove(l-1);
                                    liste.remove(l-1);
                                    liste.add(l-1, String.valueOf(result));
                                    l = 0;
                                    System.out.println("+" + result);
                                    break;
                                case  "-":
                                    result = Double.parseDouble(liste.get(l-1)) - Double.parseDouble(liste.get(l+1));
                                    liste.remove(l-1);
                                    liste.remove(l-1);
                                    liste.remove(l-1);
                                    liste.add(l-1, String.valueOf(result));
                                    l = 0;
                                    System.out.println("-" + result);
                                    break;
                            }
                        }
                    }
                    arr1[i]= String.valueOf(result);
                }
            }

            for (int i =0; i< arr1.length; i++){
                newData += arr1[i];
            }
            data = newData;
        }

        String[] arr = data.split("(?<=[-+*/])|(?=[-+*/])");  // (?<=[...]) means look behind assertion, (?=[...]) means look ahead assertion

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
                        System.out.println("*" + result);
                        break;
                    case "/":
                        result = Double.parseDouble(liste.get(i - 1)) / Double.parseDouble(liste.get(i + 1));
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.remove(i - 1);
                        liste.add(i - 1, String.valueOf(result));
                        i = 0;
                        System.out.println("/" + result);
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
                        System.out.println("+" + result);
                        break;
                    case  "-":
                        result = Double.parseDouble(liste.get(i-1)) - Double.parseDouble(liste.get(i+1));
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.remove(i-1);
                        liste.add(i-1, String.valueOf(result));
                        i = 0;
                        System.out.println("-" + result);
                        break;
                }
            }
        }

        System.out.println(result);


    }
}
