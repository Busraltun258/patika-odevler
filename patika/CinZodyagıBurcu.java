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
                
                break;
            case 1:
                burc = "Horoz";
              
                break;
            case 2:
                burc = "Köpek";
              
                break;
            case 3:
                burc = "Domuz";
                
                break;
            case 4:
                burc = "Fare";
                
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);


        }


    }


