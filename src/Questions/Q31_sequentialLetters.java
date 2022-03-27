package Questions;

import java.util.Scanner;

public class Q31_sequentialLetters {
    /*

     lostLetters("abdefg")
     Output : c

     lostLetters("mnopqs")
     Output : r

     lostLetters("abcdefgh")
     Output : Sequential Letters

     In the first example: /// b is not followed by c
     in the second example: /// p is not followed by r

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write something");
        String data = scan.nextLine();

        boolean condition = true;

        for (int i = 0;  i < data.length()-1; i++){
                if ((int)data.charAt(i)+1 != (int)data.charAt(i+1)){
                    System.out.println("missing letter is: " + (char)((int)data.charAt(i)+1));
                    condition = false;
                    break;
                }
            }

        if (condition){
            System.out.println("Sequential Letters");
        }



    }
}
