/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :23:26
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//kullanıcının girdiği hava sıcaklığına göre etkinlik önerici bir program
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner s = new Scanner(System.in);
        System.out.println("Derece cinsinden sıcaklık giriniz.");
        heat = s.nextInt();
        if (heat < 5) {
            System.out.println("Bugun kayak yapabilirsin.");
        }
        else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Bugun sinemaya gidebilirsin.");
            }
            if (heat >= 10) {
                System.out.println("Bugun piknik yapabilirsin.");
            }
        }
        else {
                System.out.println("Bugun yüzmeye gidebilirsin.");
            }



    }
}

