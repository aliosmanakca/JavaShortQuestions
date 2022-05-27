package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q34_advancedCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write a mathematical operation");
        String data = scan.nextLine();

        data = data.replaceAll("[^0-9/*+().\"-]", "");

        System.out.println(data);

        String[] arr = data.split("(?<=[-+*/])|(?=[-+*/])");

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
