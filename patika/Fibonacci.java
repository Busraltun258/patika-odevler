/**
 * Created By Büşranur Altun
 * Date :24/02/2023
 * Time :19:24
 * Project Name :javaBootcamp
 */
package Java101.metod;



//recursive metodlar ile fibonacci bulma
public class Fibonacci {
    static int fibonacci(int sayi) {
        if (sayi==1 || sayi==2){
            return 1;    //durdurma koşulu
        }
        return fibonacci(sayi-1)+fibonacci(sayi-2);
    }
        public static void main (String[]args){
            System.out.println(fibonacci(5));
        }

}