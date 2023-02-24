/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :18:26
 * Project Name :javaBootcamp
 */
package Java101.metod;
//palindrom sayısı ili tarfatan da okunuşu aynı olan sayı 101
public class PalindromSayiBulma {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10; //son sayıyı verir.
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10; //24 kaldı
        }
        if (number==reverseNumber){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(101));

    }
}
