/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :22:53
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//kullanıcının not durumuna göre sınıfı geçme durumunu hesapla.
public class DersGeçmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        float ort, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
        }
        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
        }
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
        }
        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
        }
        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
        }
        ort = toplam / 5;
        if (ort >= 55) {
            System.out.println("Tebrikler geçtiniz." + ort);
        } else {
            System.out.println("Üzgünüm kaldınız." + ort);

        }


    }
}
