/**
 * Created By Büşranur Altun
 * Date :23/02/2023
 * Time :23:08
 * Project Name :javaBootcamp
 */
package Java101;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int sayac=0;

        for (int i = 2; i <= 100; i++) {
            for (int j=1; j<i;j++){
                if(i%j==0){
                    sayac++;

                }


            }
            if(sayac<2){
                System.out.print(i+",");
            }
            sayac=0;


        }
    }
}