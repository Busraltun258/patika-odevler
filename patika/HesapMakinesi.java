/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :19:41
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

// koşullu ifadeler kullanılarak hesap makinesi örneği
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2,select,sonuc;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz:");
        n1 = s.nextInt();
        System.out.println("2.sayıyı giriniz:");
        n2=s.nextInt();
        System.out.println(" 1-Toplama\n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiniz:");
        select=s.nextInt();
        switch(select){
            case 1:
                sonuc=n1+n2;
                System.out.println("Toplama sonucu="+sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.println("Çıkarma sonucu="+sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println("Çarpma sonucu="+sonuc);
                break;
            case 4:
                sonuc=n1/n2;
                System.out.println("Bölme sonucu="+sonuc);
                break;

        }




    }
}
