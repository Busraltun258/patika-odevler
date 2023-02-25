/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :21:53
 * Project Name :javaBootcamp
 */
package Java101.siniflar.BoksMac;

import java.util.Objects;

//boks maçını simüle eden program
public class Main {
    public static void main(String[] args) {
        Fighters f1 = new Fighters("A", 10, 120, 100,30);
        Fighters f2 = new Fighters("B", 20, 85, 85,50);
        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
