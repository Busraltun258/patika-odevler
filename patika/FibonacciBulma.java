/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :23:46
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class FibonacciBulma {
    public static void main(String[] args) {

        int sayi;
        int temp1 = 0, temp2 = 1;
        System.out.print("Fibonacci Serisi için eleman sayısını giriniz : ");
        Scanner s = new Scanner(System.in);
        sayi = s.nextInt();
        System.out.println(temp1+"\n" +temp2);
       for (int i=0; i<sayi; i++){
           int sonuc=temp1+temp2;
           temp1=temp2;
           temp2=sonuc;

            System.out.println(sonuc);

        }

    }
}
