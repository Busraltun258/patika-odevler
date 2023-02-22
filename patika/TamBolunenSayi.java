/**
 * Created By Büşranur Altun
 * Date :22/02/2023
 * Time :23:44
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class TamBolunenSayi {
    public static void main(String[] args) {
        int sayi, total = 0, ort, sayac = 0;
        System.out.print("Sayi girin: ");
        Scanner s = new Scanner(System.in);
        sayi = s.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                total = total + i;
            }

        }
        ort = total / sayac;
        System.out.println("Ortalama: " + ort);


    }
}
