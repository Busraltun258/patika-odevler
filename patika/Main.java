/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :14:44
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Main {
    //Car sınıfından nesneleri üretelim
    public static void main(String[] args) {
        Car bmw= new Car("bmw",10,"blue");
        bmw.printInfo();

        Car audi=new Car();
        audi.model="Audi";
        bmw.speed=20;
    }
}
