/**
 * Created By Büşranur Altun
 * Date :27/02/2023
 * Time :09:30
 * Project Name :javaBootcamp
 */
package Java101.MaasHesap;

public class Employee {
    String name;

    int workHours;
    int hireYear;


    double salary;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax() {


        if (this.salary > 1000) {
            return (int) (salary * 0.03);

        }


        return 0;

    }

    int bonus() {
        if (workHours > 40) {
            return (this.workHours - 40) * 30;


        }
        return 0;
    }

    int raiseSalary() {

        if (2021 - this.hireYear < 10) {
            return (int) (this.salary * 0.05);


        }
        if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (int) (this.salary * 0.1);


        }
        {
            return (int) (this.salary * 0.15);

        }
    }

    void toPrint() {
        System.out.println("İsim Soyisim: " + this.name);
        System.out.println("İşe Başlangıç Tarihi: " + this.hireYear);
        System.out.println("Haftalık Çalışma Saati: " + this.workHours);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + (bonus()));
        System.out.println("Maaş Artış Oranı: " + (raiseSalary()));
        System.out.println("Net Maaş: " + (this.salary + bonus() + (this.raiseSalary() - tax()) + " TL"));
    }
}
