package Questions;

import java.util.Scanner;

public class Q26_encryption {
    /*

    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data:"I like java"
    Test Output:"1 l1k3 j4v4"

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        data = data.toLowerCase();

        data = data.replaceAll("s","5")
                .replaceAll("a","4")
                .replaceAll("e","3")
                .replaceAll("i","1")
                .replaceAll("o","0");

        System.out.println(data);
    }
}
