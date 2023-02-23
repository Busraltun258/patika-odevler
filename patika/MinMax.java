/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :22:24
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int sayi,n,min=0,max=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayi=s.nextInt();
        for (int i=1; i<=sayi;i++){
            System.out.print(i+".sayıyı giriniz: ");
            n=s.nextInt();
            if (i==1){
                max=n;
                min=n;
            }
            else if(n>max){
                max=n;
            }
            else if(n<min){
                min=n;
            }



        }
        System.out.println("En büyük sayı:" +max);
        System.out.println("En küçük sayı:" +min);



    }
}
