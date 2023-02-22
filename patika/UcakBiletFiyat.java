/**
 * Created By Büşranur Altun
 * Date :22/02/2023
 * Time :16:31
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class UcakBiletFiyat {
    public static void main(String[] args) {
        int yas, yolculukTip;
        double km, kmParse = 0.10, total, yasIndirim = 0, indirim = 0, ciftyon, indirim2;
        Scanner s = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km = s.nextDouble();
        System.out.print("Yaşınızı giriniz:");
        yas = s.nextInt();
        System.out.print("Yolculuk tipini seçiniz:\n 1-Tek yön\n 2-Çift yön\n ");
        yolculukTip = s.nextInt();
        total = km * kmParse;


        if (km > 0 && yas > 0) {
            if (yolculukTip == 1 || yolculukTip == 2) {

                if (yas < 12) {
                    if (yolculukTip == 2) {
                        indirim = (indirim * 50) / 100;
                        yasIndirim = total - indirim;
                        indirim2 = (yasIndirim * 20) / 100;
                        ciftyon = (yasIndirim - indirim2) * 2;
                        System.out.println("Toplam tutar=" + ciftyon);

                    } else {
                        indirim = (total * 50) / 100;
                        yasIndirim = total - indirim;
                        System.out.println("Toplam fiyat: " + yasIndirim);
                    }

                }
                else if (yas >= 12 && yas <= 24) {
                    if (yolculukTip == 2) {
                        indirim = (total * 10) / 100;
                        yasIndirim = total - indirim; //135
                        indirim2 = (yasIndirim * 20) / 100;
                        ciftyon = (yasIndirim - indirim2) * 2;
                        System.out.println("Toplam Tutar=" + ciftyon);

                    } else {
                        indirim = (total * 10) / 100;
                        yasIndirim = total - indirim;
                        System.out.println("Toplam fiyat: " + yasIndirim);
                    }

                }
                else if (yas > 65) {
                    if (yolculukTip == 2) {
                        indirim = (total * 30) / 100;
                        yasIndirim = total - indirim;
                        indirim2 = (yasIndirim * 20) / 100;
                        ciftyon = (yasIndirim - indirim2) * 2;
                        System.out.println("Toplam fiyat=" + ciftyon);


                    } else {
                        indirim = (total * 30) / 100;
                        yasIndirim = total - indirim;
                        System.out.println("Toplam fiyat: " + yasIndirim);
                    }


                }
                else{
                    System.out.println("Toplam tutar= "+total);
                }


            }
            else {
                System.out.println("Hatalı veri girdiniz");
            }

        } else {
            System.out.println("Hatalı veri girdiniz");

        }

    }
}
