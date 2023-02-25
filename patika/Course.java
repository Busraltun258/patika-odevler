/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :16:17
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Course {
    Teacher teacher;    //bir sınıfın niteliğini referans aldık.t1 e ulaşmış oluruz.
    String name;
    String code;
    String prefix;
    int note;
    int sozluNot;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        //this.teacher = teacher;
        int note = 0; //varsayılan not
        int sozluNot = 0;


    }

    void addTeacher(Teacher teacher) {

        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }

    }

    void printTeacher() {
        this.teacher.print(); //teacherın printini çalıştırdık.
    }


}
