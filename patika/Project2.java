/**
 * Created By Büşranur Altun
 * Date :20/02/2023
 * Time :17:59
 * Project Name :javaBootcamp
 */
// alınan para değerinin KDV li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın
package Java101;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        float kdvsiz;
        float kdvli;
        float kdvOran = 0.18f;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen para değeri giriniz:");
        kdvsiz = input.nextFloat();
        System.out.println("KDV'siz tutar=" + kdvsiz);
        float kdv = kdvsiz * kdvOran;
        kdvli = kdv + kdvsiz;
        System.out.println("KDV oranı="+kdvOran);
        System.out.println("KDV tutarı=" + kdv);
        System.out.println("KDV'li tutar=" + kdvli);



    }
}
