/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :13:45
 * Project Name :javaBootcamp
 */
package Java101;


import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        int total = 1, total2 = 1, total3 = 1, kombinasyon;
        Scanner s = new Scanner(System.in);
        System.out.print("1.Sayı girin:");
        int sayi1 = s.nextInt();
        System.out.print("12.Sayı girin:");
        int sayi2 = s.nextInt();

        for (int i = 1; i <= sayi1; i++) {
            total *= i;
        }

        for (int j = 1; j <= sayi2; j++) {
            total2 *= j;
        }
        for (int k = 1; k <= (sayi1 - sayi2); k++) {
            total3 *= k;
        }

        kombinasyon = total / (total2 * (total3));
        System.out.println("Kombinasyo: " + kombinasyon);
    }

}
