/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :23:33
 * Project Name :javaBootcamp
 */
package Java101.metod;

import java.util.Scanner;

public class DesenMetod {
    static void desen(int s) {
        System.out.println(s+" ");
        if (s == 0 || s < 0) {
            return;
        }
        desen(s-5);
        System.out.println(s+" ");

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        desen(n);
    }
}
