package Questions;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of random integers, and a given integer S, determine if it is possible to select two
numbers from this list, so their sum equals to S.
Constraints:
 0 <= size of a given array <= 100000
 Each value in a given array is between -2^31 and 2^31 – 1
 */

public class Q37 {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8};  // you can change these numbers

        int number = 10;  // you can change this number

        List<List> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            List<Integer> tempList = new ArrayList<>();
            for (int j=0; j<arr.length; j++){
                if (arr[i]+arr[j]==number && !(arr[i]==arr[j])){
                    tempList.add(arr[i]);
                    tempList.add(arr[j]);
                    boolean condition = true;
                    for (int k=0; k<list.size(); k++){
                        if (list.get(k).containsAll(tempList)){
                            condition=false;
                        }
                    }
                    if (condition){
                        list.add(tempList);
                    }
                }
            }
        }

        System.out.println(list);


    }
}
