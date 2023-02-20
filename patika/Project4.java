/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :20:16
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//üçgenin alanını hesaplama
public class Project4 {
    public static void main(String[] args) {
        double a,b,c,cevre,alan,u;

        Scanner s=new Scanner(System.in);
        System.out.println("1.kenar uzunluğunu giriniz:");
        a=s.nextInt();
        System.out.println("2.kenar uzunluğunu giriniz:");
        b=s.nextInt();
        System.out.println("3.kenar uzunluğunu giriniz:");
        c=s.nextInt();
        u=(a+b+c)/2;
        cevre=2*u;
        System.out.println("Üçgenin çevresi="+cevre);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı="+alan);

    }
}
