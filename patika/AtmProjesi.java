/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :19:57
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, select;
        Scanner s = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullaıcı adınız:");
            userName = s.nextLine();
            System.out.print("Şifreniz:");
            password = s.nextLine();
            if (userName.equals("busra") && password.equals("123")) {
                System.out.println("Merhaba Kodluyoruz bankasına hoş geldiniz");
                do {

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = s.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price = s.nextInt();
                            balance += price;
                            System.out.println("Paranız yatırıldı. Güncel bakiye:" + balance);
                            break;
                        case 2:
                            System.out.println("Ne kadar para çekmek istersiniz ? : ");
                            price = s.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz: ");
                            } else {
                                balance -= price;
                                System.out.println("Paranız çekildi. güncel bakiye: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapıldı");
                            break;

                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break; //döngü bitirme

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile iletişime geçin");
                } else {
                    System.out.println("kalan hak: " + right);
                }
            }
        }

    }
}
