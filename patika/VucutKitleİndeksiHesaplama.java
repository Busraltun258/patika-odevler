/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :21:31
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//kullanıcıdan boy ve kilo değerlerini alarak vki hesaplama
public class VucutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        double kg, length, vki;
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre) giriniz:");
        length = s.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        kg = s.nextDouble();
        vki = kg / (length* length);
        System.out.println("Vücut Kitle İndeksiniz:" + vki);

    }
}

