/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :16:09
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Teacher {
    String name;
    String mpno;
    String branch;

    //ctor
    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Tel: " + this.mpno);
        System.out.println("Branş: " + this.branch);
    }
}
