/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :21:56
 * Project Name :javaBootcamp
 */
package Java101.metod;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int usAlma(int t, int u) {

        if( u == 0){
            return 1;
        } else if (u == 1) {
            return t;
        }
        return t* usAlma(t, (u-1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Taban sayısı:");
        int taban = s.nextInt();
        System.out.print("Us sayısının girin:");
        int us = s.nextInt();
        System.out.println(usAlma(taban, us));
    }

}
