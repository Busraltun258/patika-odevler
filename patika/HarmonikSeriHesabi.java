/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :17:08
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

// java ile girilen sayının harmonik serisini bulan program
public class HarmonikSeriHesabi {
    public static void main(String[] args) {
        int sayi;
        double result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz: ");
        sayi = s.nextInt();
        for (int i = 1; i <= sayi; i++) {
            result += (1.0/i);

        }
        System.out.println("Harmonik serisi = " + result);
    }
}
