/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :20:21
 * Project Name :javaBootcamp
 */
package Java101.metod;

import java.util.Scanner;

//metotlar kullanılarak kullanıcının seçtiği işlemleri yapan gelişmiş hesap makinesi
public class GelisimiHesapMakinesi {
    static int toplama(int sayi1, int sayi2) {
        int result = sayi1 + sayi2;
        System.out.println("Toplama sonucu: " + result);
        return result;
    }

    static int cikarma(int sayi1, int sayi2) {
        int result = sayi1 - sayi2;
        System.out.println("Çıkarma sonucu: " + result);
        return result;

    }

    static int carpma(int sayi1, int sayi2) {
        int result = sayi1 * sayi2;
        System.out.println("Çarpma sonucu: " + result);
        return result;
    }

    static int bolme(int sayi1, int sayi2) {
        if(sayi2==0){
            System.out.println("2.sayı 0 olamaz.");
            return 0;
        }
        int result = sayi1 / sayi2;
        System.out.println("Bölme sonucu: " + result);
        return result;

    }

    static int usAl(int sayi1, int sayi2) {
        int result = 1;
        for (int i = 1; i <= sayi2; i++) {
            result *= sayi1;

        }
        System.out.println("Faktoriyel sonucu " + result);
        return result;
    }

    static int faktoriyel(int sayi1) {
        int result = 1;
      for (int i=1; i<=sayi1; i++){
          result*=i;
      }
        System.out.println("Faktoriyel sonucu: "+result);
        return result;


    }


    static void alanCevre(int kisa, int uzun) {
        int alan,cevre;
        cevre=(2*kisa)+(2*uzun);
        alan=kisa*uzun;
        System.out.println("Dikdörtegnin çevresi: "+cevre);
        System.out.println("Dikdörtegin alanı: "+alan);


    }

    static int modAlma(int sayi1, int sayi2) {
        int result=sayi1%sayi2;
        System.out.println("Mod:"+result);
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int select;


        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üslü Sayı İşlem\n"
                + "6-Faktoriyel Hesaplama\n"
                + "7-Dikdörtgen Alan ve Çevre hesabı\n"
                + "8-mod alma\n"
                + "0-Çıkış";
        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select = s.nextInt();
            if (select == 0) {
                break;
            } else {
                System.out.print("Birinci sayı:");
                int a = s.nextInt();
                System.out.print("ikinci sayı:");
                int b = s.nextInt();

                switch (select) {
                    case 1:
                        toplama(a, b);
                        break;
                    case 2:
                        cikarma(a, b);
                        break;
                    case 3:
                        carpma(a, b);
                        break;
                    case 4:
                        bolme(a, b);
                        break;
                    case 5:
                        usAl(a, b);
                        break;
                    case 6:
                        faktoriyel(a);
                        break;
                    case 7:
                        alanCevre(a,b);
                        break;
                    case 8:
                        modAlma(a,b);
                        break;
                    case 0:
                        System.out.println("Çıkış yapıldı\n Güle Güle");
                        break;
                    default:
                        System.out.println("Hatalı seçim !\n 1-9 arası rakam seçiniz:");

                }


            }

        }
    }
}
