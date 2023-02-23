/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :22:47
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class MukkemelSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı girin:");

        int sayi = s.nextInt();
        int temp = sayi, total = 0;
        for (int i = 1; i < temp; i++) {
            if (temp % i == 0) {
                total += i;
            }
        }
        if (sayi== total) {
                System.out.println(sayi + " mükemmel sayıdır");
         }
        else {
                System.out.println(sayi + " mükemmel sayı değildir");

            }

        }
    }


