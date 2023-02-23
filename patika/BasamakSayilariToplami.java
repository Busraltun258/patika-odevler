/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :16:20
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

// girilen bir sayının basamak sayılarının toplamını bulan kod
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int sayi,result=0,basValue=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = s.nextInt();
        while(sayi !=0){
            basValue=sayi%10; //basamak bulmak için mod al
            result+=basValue; // basamakları tut
            sayi/=10;         //basamak azaltmak için 10 a böl ve işlemleri tekrarla
        }

        System.out.println(result);


    }
}
