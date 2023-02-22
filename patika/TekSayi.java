/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :00:15
 * Project Name :javaBootcamp
 */
package Java101;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        int sayi, total = 0;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Sayı girin: ");
            sayi = s.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                total += sayi;
            }
            if(sayi%2==1){
                break;
            }

        }
        while (sayi>0);
        System.out.println(total);

    }
}
