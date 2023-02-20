/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :21:41
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran kod
public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, total;
        Scanner s = new Scanner(System.in);
        System.out.print("Armut kaç kilo:");
        double kgarmut = s.nextDouble();

        System.out.print("Elma kaç kilo:");
        double kgelma = s.nextDouble();

        System.out.print("Domates kaç kilo:");
        double kgdomates = s.nextDouble();

        System.out.print("Muz kaç kilo:");
        double kgmuz = s.nextDouble();

        System.out.print("Patlıcan kaç kilo:");
        double kgpatlican = s.nextDouble();
        total=((armut*kgarmut)+(elma*kgelma)+(domates*kgdomates)+(muz*kgmuz)+(patlican*kgpatlican));
        System.out.println("Toplam Tutar="+total);



    }
}
