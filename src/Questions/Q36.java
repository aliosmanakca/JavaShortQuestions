package Questions;

import java.util.*;

/*
    You are working on implementing a module for statistical analysis. You are given a list of numbers,
where every i-th number represents a number of unique visitors for your website for i-th minute. Due
to some hardware issues it might happen that a number of visitors for a certain minute cannot be
determined, and thus a number representing that minute will be null. A non-empty continuous period
of time for which a number of visitors for each minute was determined is called a Monitoring Window.
A Monitoring Window which is not contained in any other Monitoring Window is called an Interesting
Monitoring Window (IMW). You need to design and implement a utility class(es) providing the following
functionality.
The maxSum function should return a sub-list of a given list corresponding to an IMW with a maximum
number of visitors determined. If there is more than one such IMW that exists, this function should
return the longest one.
The minAvg function should return a sub-list of a given list corresponding to an IMW with a lowest
average number of visitors. If there is more than one such IMW that exists, this function should return
the earliest one.
If it’s not possible to find a required sub-list, both functions should return an empty list.
Example:
 maxSum(1, 5, null, 1, 2, 2, null, 3) → [1, 5]
 minAvg(1, 5, null, 1, 2, 2, null, 3) → [1, 2, 2]
There are 10 Monitoring Windows: [1], [5], [1, 5], [1], [2], [2], [1, 2], [2, 2], [1, 2, 2], [3],
but there are only 3 IMVs: [1, 5], [1, 2, 2], [3].
     */

public class Q36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input data separating them with , \nlike this: 1,5, null, 1, 2, 2, null, 3");
        String data = scan.nextLine();

        data = data.replaceAll(" ","");
        String arr[] = data.split("null");

        List<List> list = new ArrayList<>();

        for (int i=0; i< arr.length; i++){
            String str = arr[i];
            if (String.valueOf(str.charAt(0)).equals(",")){
                str = str.replaceFirst(",","");
            }
            if (String.valueOf(str.charAt(str.length() - 1)).equals(",")){
                str = str.substring(0,str.length()-1);
            }

            String[] temp = str.split(",");
            List<String> list2 = new ArrayList<String>(Arrays.asList(temp));

            for (int m=0; m<list2.size();){
                for (int j=m; j<list2.size(); j++){
                    List<Integer> tempList = new ArrayList<>();
                    for (int k=0; k<=j; k++){
                        tempList.add(Integer.valueOf(list2.get(k)));
                    }
                    list.add(tempList);
                }
                list2.remove(0);
            }

        }

        List<List> imwList = new ArrayList<>();
        for (List each: list) {
            imwList.add(each);
        }

        for (int i=0; i<list.size(); i++){
            for (int j=0; j<list.size(); j++){
                if ( (!list.get(i).equals(list.get(j)))  && list.get(i).containsAll(list.get(j)) ){
                    if (list.get(i).size()>list.get(j).size())
                        imwList.remove(list.get(j));
                }
            }
        }


        maxSum(imwList);
        minAvg(imwList);

    }


    public static void maxSum(List<List> list) {
        List<List> tempList = new ArrayList<>();
        tempList.add(Collections.singletonList(0));

        int maxTotal = 0;
        int biggest = 0;

        for (int i=0; i<list.size(); i++){
            int total = 0;
            for (int j=0; j<list.get(i).size(); j++){
                total += Integer.parseInt(String.valueOf(list.get(i).get(j)));
                if (Integer.parseInt(String.valueOf(list.get(i).get(j))) > biggest){
                    biggest = Integer.parseInt(String.valueOf(list.get(i).get(j)));
                }
            }

            if (total>maxTotal){
                maxTotal = total;
                tempList.set(0,list.get(i));
            }
            if (total==maxTotal){
                if (list.get(i).contains(biggest)){
                    tempList.set(0,list.get(i));
                }
            }

        }
        System.out.println(tempList.get(0));

    }



    public static void minAvg(List<List> list) {
        List<List> tempList = new ArrayList<>();
        tempList.add(Collections.singletonList(0));

        double minAvg = 10;

        for (int i=0; i<list.size(); i++){
            int total = 0;
            for (int j=0; j<list.get(i).size(); j++){
                total += Integer.parseInt(String.valueOf(list.get(i).get(j)));
            }
            if (  total/(list.get(i).size()) < minAvg ){
                minAvg = total/(list.get(i).size());
                tempList.set(0,list.get(i));
            }

        }
        System.out.println(tempList.get(0));

    }




}
