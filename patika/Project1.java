/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :17:35
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//mat,fizik,kimya,türkçe,tarih,müzik derslerinin sınav puanlarını kullanıcııdan alan ve ortalamasını hesaplayıp ekrana bastıran program
public class Project1 {
    public static void main(String[] args) {

        float mat, fiz, kim, trk, trh, mzk, ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen matematik notunu giriniz: ");
        mat = input.nextFloat();
        System.out.print("Lütfen fizik notunu giriniz: ");
        fiz = input.nextFloat();
        System.out.print("Lütfen kimya notunu giriniz: ");
        kim = input.nextFloat();
        System.out.print("Lütfen türkçe notunu giriniz: ");
        trk = input.nextFloat();
        System.out.print("Lütfen tarih notunu giriniz: ");
        trh = input.nextFloat();
        System.out.print("Lütfen müzik notunu giriniz: ");
        mzk = input.nextFloat();
        ort = (mat + fiz + kim + trk + trh + mzk) / 6.0f;
        System.out.println("Ortalama:" + ort);
        String s = ort >= 60 ? "Geçti" : "Kaldı";
        System.out.println(s);
    }

}
