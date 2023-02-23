/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :22:57
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("n sayısı girin :");
        n = s.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
