package Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q06_matchesMethod {

    /*

    6-Ask the user to enter a letter. Print on the screen whether the entered letter is a vowel or a consonant letter.
     If the value entered is not a letter or has more than one character, it will show an error message.
     (The test is sensitive to the case of the entered letter.)

     Vowels: a,e,i,o,u

     Test Data:
     a

     Expected Output:
     The letter a is a vowel.

     Test Data:
     D

     Expected Output:
     The letter D is a consonant letter.

     Test Data:
     abc or %

     Expected Output:
     You entered a wrong character!

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter only one letter");
        String letter = scan.next();

        List<String> vowels = Arrays.asList("a","e","i","o","u");


        if (letter.length()==1 && letter.matches("[a-zA-Z ]")) { // this means it contains only alphabet and space. If we add ^ symbol after the first bracket it means everything except alphabet and space

            if (vowels.contains(letter)){
                System.out.println("The letter " + letter + " is a vowel.");
            }else {
                System.out.println("The letter " + letter + " is a consonant letter.");
            }

        }else {
            System.out.println("You entered a wrong character!");
        }


    }
}
