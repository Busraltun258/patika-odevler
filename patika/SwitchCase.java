/**
 * Created By Büşranur Altun
 * Date :21/02/2023
 * Time :19:29
 * Project Name :javaBootcamp
 */
package Java101;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Bugun pazartesi");
                System.out.println("Program çalıştı");
                break;
            case 2:
                System.out.println("Bugun salı");
                break;
            case 3:
                System.out.println("Bugun çarşamba");
                break;
            case 4:
                System.out.println("Bugun perşembe");
                break;
            default:
                System.out.println("Program bitti.");

        }
    }
}
