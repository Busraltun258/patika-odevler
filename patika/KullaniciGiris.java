/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :20:05
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//koşullu ifadeler ile kullanıcı adı ve şifre kontrol eden programı yazınız.
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int select;
        Scanner s = new Scanner(System.in);
        System.out.print("Kulalnıcı adınızı giriniz:");
        userName= s.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = s.nextLine();
        if (userName.equals("kutu") && password.equals("kutu")) {
            System.out.println("Başarılı giriş yaptınız");
        }
        else {
            System.out.println("Şifre veya kullanıcı adı yanlış !");
            System.out.println("Şifre sıfırlansın mı");
            System.out.println(" 1-Evet \n 2-Hayır");
            System.out.println("Seçiniz");
            select = s.nextInt();
            switch (select) {
                case 1:
                    Scanner s1 = new Scanner(System.in);
                    System.out.print(" Yeni Şifrenizi giriniz:");
                    newPassword = s1.nextLine();
                    if(newPassword.equals("kutu")){
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifreniz oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlanamadı");
                    break;
                default:
                    System.out.println("1 veya 2 giriniz.");
            }

        }


    }
}
