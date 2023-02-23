/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :21:22
 * Project Name :javaBootcamp
 */
package Java101;
//girilen iki sayının ebob ve ekokunu bulma
// 18 1 2 3 6 18
//24 1 2 3 4 6 8 12 24
//mantıken ebob en fazla en küçük sayı dğerince olur bu yüzden en küçük sayıya kadar i yi arttırırız.

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n1 sayısını girin: ");
        int n1 = s.nextInt();
        System.out.print("n2 sayısını girin: ");
        int n2 = s.nextInt();
        int min = 0, ebob = 1, ekok = 1;
        if (n1 < n2) {
            min = n1;
        } else if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("EBOB " + ebob);
                break;

            }

        }
//        for (int j = 1; j < (n1 * n2); j++) {
//            if (j % n1 == 0 && j % n2 == 0) {
//                System.out.println("EKOK " + j);
//                break;
//            }
//
//        }
        System.out.println((n1 * n2) / ebob);

    }
}
