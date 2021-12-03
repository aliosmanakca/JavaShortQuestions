package Questions;

import java.util.Scanner;

public class Q01 {
    /*1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi girin");

        int sayi = scan.nextInt();
        int toplam = 0;

        do {
          toplam = toplam + sayi%10;
          sayi = sayi/10;
        }while (sayi!=0);

        System.out.println(toplam);


    }
}
