package week5;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("  MASUKAN BILANGAN:  ");
        int angka = input.nextInt();

        System.out.println("Anda memasukkan bilangan: " + angka);

        //Menghitung Faktorial
        int faktorial = 1; //agar hasil faktorial tidak 0 dan dimulai dari 1

        for (int i = 1; i <= angka; i++) {
            if (i == 1) {
                faktorial = i; //nilai faktorial akan bertambah sampai i <= angka
            } else {
                System.out.println(faktorial + " x " + i + " = " + (faktorial * i));
                faktorial *= i;
            }
        }

        input.close();
    }
}
