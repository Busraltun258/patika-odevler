/**
 * Created By Büşranur Altun
 * Date :22/02/2023
 * Time :00:23
 * Project Name :javaBootcamp
 */
package Java101;

import java.sql.SQLOutput;
import java.util.Scanner;

//kullanıcıdan doğduğu ay ve günü alıp burcunu bulan program
public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;
        System.out.print("Doğdunuz günü girinz:");
        Scanner s = new Scanner(System.in);
        day = s.nextInt();
        System.out.print("Doğdunuz ayı giriniz:");
        month = s.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Oğlak";

                    } else {
                        burc = "Kova";

                    }
                } else {
                    isError = true;
                }

                break;
            case 2:
                if (day >= 1 && day <= 28)
                    if (day < 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31)
                    if (day < 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30)
                    if (day < 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 30)
                    if (day < 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30)
                    if (day < 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 30)
                    if (day < 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Alan";
                    }
                else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 30)
                    if (day < 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30)
                    if (day < 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 30)
                    if (day < 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30)
                    if (day < 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 30)
                    if (day < 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                else {
                    isError = true;
                }
                break;
            default:
                isError = true;

        }
        if (isError == true) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz :" + burc);
        }
    }
}
