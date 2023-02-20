/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :21:06
 * Project Name :javaBootcamp
 */
package Java101;

import java.util.Scanner;

//yarıçapı r merkez açısının ölçüsü a olan dairenin alanı
public class DaireDilimAlan {
    public static void main(String[] args) {
        double pi = 3.14, r, alan,a;
        Scanner s = new Scanner(System.in);
        System.out.print("Yarıçap giriniz:");
        r = s.nextDouble();
        System.out.println(r);
        System.out.print("Merkez açı ölçüsü  giriniz:");
        a = s.nextDouble();
        System.out.println(a);
        alan = (pi * (r * r) * a) / 360.0;
        System.out.println("Daire dilimin alanı="+alan);

    }
}
