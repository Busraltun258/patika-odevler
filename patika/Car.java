/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :13:12
 * Project Name :javaBootcamp
 */
package Java101.siniflar;

public class Car {
    //niteikler değişkenler ile tanımlanır
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model,int speed,String color){
        this.model=model; //sınıftaki modele dışaardan gelen modeli eşitledik
        this.speed=speed;
        this.color=color;
        this.type="sedan";
        this.speedLimit=180;
        System.out.println("Parametreli kurucu model çalıştı");

    }
    Car(){
        System.out.println("Parametresiz kurucu model çalıştı");
    }


    //davranışlar metotlar ile tanımlanır
    void increaseSpeed(int increment) {
        if (this.speed < speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }

    }

    void printSpeed() {
        System.out.println("Hız: " + this.speed +" Renk: "+this.color +" Model :"+this.model);
    }
    void printInfo(){
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.speed);

    }
}
