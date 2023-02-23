/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :14:09
 * Project Name :javaBootcamp
 */
package Java101;
//kkullanıcının girdiği sayılar ile üst bulma programı

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UsluSayiBulma {
    public static void main(String[] args) {
        double taban, us,result=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Taban olacak sayıyı girin:");
        taban = s.nextInt();
        System.out.print("Üs olacak sayıyı girin:");
        us = s.nextInt();
        //result=Math.pow(taban,us);
        for (int i=1; i<=us;i++){
            result=result*taban;
            System.out.println(result);
        }
        System.out.println(result);

    }

}
