/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :16:08
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Obs {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali", "TRH", "233");
        //t1.print();
        Teacher t2 = new Teacher("Grham Bell", "FZK", "000");
        Teacher t3 = new Teacher("kül yutmaz", "BIO", "112");
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);
        Students s1=new Students("Mert","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,100,50,50,60,70);
        s1.isPass();
    }
}
