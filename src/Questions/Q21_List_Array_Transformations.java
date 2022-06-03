package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21_List_Array_Transformations {
    public static void main(String[] args) {

        // List to Array
        List<String> itemList = new ArrayList<>();

        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");

        Object[] arr = itemList.toArray();

        System.out.println(Arrays.toString(arr));



        // Array to List 1. Way
        String[] arr1 = {"a","b","c"};

        List <String> list1 = Arrays.asList(arr1); // It becomes a list whose length cannot be changed. So, we can't use some methods such as add, remove etc.

        list1.set(0, "d"); // The changes made also affect the array.
        arr1[1]="z";       // The changes made also affect the list.

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);


        // Array to List 2. Way
        String[] arr2 = {"x","y","z"};

        List<String> list2 = new ArrayList<>(Arrays.asList(arr2)); // We can use add or remove methods

        list2.set(0, "r"); // In this way, they are not connected. So changes that made in one of them don't affect the other one.
        arr2[1]="k";

        list2.add("abc");

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

    }
}
