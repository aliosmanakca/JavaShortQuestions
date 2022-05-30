package Questions;

import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {

        String data = "2*(3+4)-5+(2+3)" ;

        String[] arr = data.split("[-+*/]");
        String[] arr1 = data.split("(?<=[-+*/])|(?=[-+*/])");
        String[] arr2 = data.split("(?<=[-+*/])");
        String[] arr3 = data.split("(?=[-+*/])");

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));







    }
}
