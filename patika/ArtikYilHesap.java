/**
 * Created By Büşranur Altun
 * Date :22/02/2023
 * Time :18:41
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//kullanıcının girdiği yılın artık olup olmadığını bulma
public class ArtikYilHesap {
    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = s.nextInt();
        if (year % 4 == 0) {
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" Artık yıldır");
                }
                else{
                    System.out.println(year + " Artık yıl değildir");
                }
            }
        else{
                System.out.println(year+ " Artık yıldır");
            }


        }

        else {
            System.out.println(year + " Artık yıl değildir");
        }

    }
}
