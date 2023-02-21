/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :23:48
 * Project Name :javaBootcamp
 */
package Java101;
//girilen 3 sayıyı koşullu ifadeler ile sıralama

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner s = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz:");
        s1 = s.nextInt();
        System.out.print("2.sayıyı giriniz:");
        s2 = s.nextInt();
        System.out.print("3.sayıyı giriniz:");
        s3 = s.nextInt();
        if (s1 < s2 && s1 < s3) {
            if (s2 < s3) {
                System.out.println("s1<s2<s3");
            } else {
                System.out.println("s1<s3<s2");
            }
        } else if (s2 < s1 && s2 < s3) {
            if (s1 < s3) {
                System.out.println("s2<s1<s3");
            } else {
                System.out.println("s2<s3<s1");
            }
        } else{
            if (s1<s2) {

                System.out.println("s3<s1<s2");
            } else {
                System.out.println("s3<s2<s1");
            }

        }
    }
}

