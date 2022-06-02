package Questions;

import java.util.Scanner;

public class Q20 {
    /*

     Array: [1551,1223,1443,1267,1789,1023,2020]

     Wanted Value:2020
     Expected Output:True

     Wanted Value:2010
     Expected Output: False

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scan.nextInt();

        int [] arr = {1551,1223,1443,1267,1789,1023,2020};
        boolean condition = false;
        int rank = 0;

        for (int i = 0; i < arr.length; i++){
            rank++;
            if (arr[i]==number){
                condition=true;
                break;
            }
        }

        if (condition){
            System.out.println(number + " is the "+ rank + ". element of the array");
        }else {
            System.out.println(number + " is not in the array");
        }




    }


}
