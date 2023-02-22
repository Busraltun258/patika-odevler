/**
 * Created By Büşranur Altun
 * Date :22/02/2023
 * Time :18:13
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class CinZodyagıBurcu {
    public static void main(String[] args) {
        int birthYear, cinZodyag;
        String burc;
        Scanner s = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = s.nextInt();
        cinZodyag = (birthYear % 12);
        switch (cinZodyag) {

            case 0:
                burc = "Maymun";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 1:
                burc = "Horoz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 2:
                burc = "Köpek";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 3:
                burc = "Domuz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 4:
                burc = "Fare";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 5:
                burc = "Öküz";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 6:
                burc = "Kaplan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 7:
                burc = "Tavşan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 8:
                burc = "Ejderha";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 9:
                burc = "Yılan";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 10:
                burc = "At";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;
            case 11:
                burc = "Koyun";
                System.out.println("Çin Zodyağı Burcunuz: " + burc);
                break;


            default:
                System.out.print("Hatalı giriş yaptınız: 0 ve 11 arası bir değer girin: ");

        }


    }
}

