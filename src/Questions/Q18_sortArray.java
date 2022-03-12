package Questions;

import java.util.Arrays;


public class Q18_sortArray {
    /*

    Write the Java code that sorts the mixed numbers and words.
    Note: Use the values from the test data.

     Test Data:
     [1232, 1134,2345,1022]
     [Java, Python, PHP, C#, C Programming, C++]

     Expected Output:
     [1022,1134,1232,2345]
     [C Programming, C#, C++, Java, PHP, Python]

     */

    public static void main(String[] args) {
        Object [] numbers = {1232, 1134,2345,1022};
        Object [] words = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        sortArray(numbers);
        sortArray(words);
    }

    private static void sortArray(Object[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
