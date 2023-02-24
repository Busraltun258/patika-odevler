/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :22:58
 * Project Name :javaBootcamp
 */
package Java101.metod;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

//java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
public class AsalSyiBulma {
    static int prime(int number, int i) {
        //asal
        if (i == 1) {
            return 1;
        }
        //asal değil
        else {
            if (number % i == 0) {
                return 0;
            }
        }
        return prime(number, i - 1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        int asal = prime(number, number / 2);
        if (asal == 1) {
            System.out.println(number + " Sayısı asaldır");
        } else {
            System.out.println(number + " Sayısı asal değildir.");
        }
    }
}