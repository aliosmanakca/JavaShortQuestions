package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        /*
        Input:
        3
        ali osman akca
        ali osman akca mehmet
        ali osman akca mehmet zeynep

        Output:
        ali osman akca
        ali akca osman mehmet
        ali mehmet akca osman zeynep
         */
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        scan.nextLine();
        List<String> list = new ArrayList<>();
        String str = "";

        for (int i=0; i<number; i++){
            str=scan.nextLine();
            list.add(str);
        }

        for (int i=0; i<number; i++){
            String listTemp="";

            String arr[] = list.get(i).split(" ");
            String newArr[] = new String[arr.length];

            newArr[0]=arr[0];
            newArr[arr.length-1]=arr[arr.length-1];

            for (int j=1; j<arr.length-1; j++){
                newArr[j]=arr[(arr.length-1)-j];
            }

            for (int k=0; k<newArr.length; k++){
                listTemp += newArr[k] + " ";
            }
            list.set(i,listTemp);
        }

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
