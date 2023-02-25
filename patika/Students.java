/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :16:09
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Students {
    Course c1;
    Course c2;
    Course c3;
    String name;

    String stuNo;
    String classes;
    double avarage;
    Boolean isPass;

    Students(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }

    // derslerin notlarını alıyoruz
    void addBulkExamNote(int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3) {
        if ((note1 >= 0 && note1 <= 100) && (sozluNote1 >= 0 && sozluNote1 <= 100)) {
            this.c1.note = note1;
            this.c1.sozluNot = sozluNote1;
        }
        if ((note2 >= 0 && note2 <= 100) && (sozluNote2 >= 0 && sozluNote2 <= 100)) {
            this.c2.note = note2;
            this.c2.sozluNot = sozluNote2;
        }
        if ((note3 >= 0 && note3 <= 100) &&(sozluNote3 >= 0 && sozluNote3 <= 100)){
            this.c3.note = note3;
            this.c3.sozluNot=sozluNote3;
        }

    }

    void printNote() {
        System.out.println(this.c1.name + " sınav Notu\t: " + this.c1.note);
        System.out.println(this.c1.name + " sözlü Notu\t: " + this.c1.sozluNot);
        System.out.println(this.c2.name + " sınav Notu\t: " + this.c2.note);
        System.out.println(this.c2.name + " sözlü Notu\t: " + this.c2.sozluNot);
        System.out.println(this.c3.name + " sınav Notu\t: " + this.c3.note);
        System.out.println(this.c3.name + " sözlüNotu\t: " + this.c3.sozluNot);
        System.out.println("Ortalamanız: " + this.avarage);
    }

    void isPass() {
        this.avarage = ((((this.c1.note)*0.8)+ ((this.c1.sozluNot)*0.2)+((this.c2.note)*0.8) +(this.c2.note)*0.8)+((this.c2.sozluNot)*0.8)+(this.c3.note)*0.8+(this.c3.sozluNot)*0.2) / 3.0;
        if (this.avarage > 55) {
            System.out.println("sınıfı geçtiniz:");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız");
            this.isPass = false;

        }
        printNote();
    }

}
