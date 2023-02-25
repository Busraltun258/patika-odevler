/**
 * Created By Büşranur Altun
 * Date :25/02/2023
 * Time :21:56
 * Project Name :javaBootcamp
 */
package Java101.siniflar.BoksMac;

//maç sınıfım
// oyuncular tanımlanır sonra maça başlanır
public class Match {
    Fighters f1;
    Fighters f2;
    int minWeight;
    int maxWeight;

    Match(Fighters f1, Fighters f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        // dövüşçüleri ağırlıkları uyuyor mu bakılamlı
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                //ilk f1 vuracak f2 ye
                System.out.println("Yeni Round");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                System.out.println(this.f2.name + " Sağlık :" + this.f2.health);

            }


        } else {
            System.out.println("Sporcuların sikletleri uymuyo");
        }

    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Kazanan: " + this.f2.name);
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("Kazana: " + this.f1.name);
            return true;

        }
        return false; //hala dövüşmeye devam


    }

}
