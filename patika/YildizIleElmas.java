/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :18:12
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class YildizIleElmas {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("n sayısı girin :");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n - 1; i >= 1; i--) { //5 ten başlar
            for (int k = n - i; k >= 1; k--) { //i 1 şu an 1 boşluk
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
