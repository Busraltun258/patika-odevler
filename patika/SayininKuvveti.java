/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :00:43
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

///girilen sayıya kadad 2 kuvvetlerini bulma
public class SayininKuvveti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (int i=0; i<=number;i++){
            double sayi=Math.pow(4,i);
            double sayi2=Math.pow(5,i);
            System.out.println("4'ün katları: \n"+sayi);
            System.out.println("5'in katları: \n"+sayi2);
        }


    }
}
