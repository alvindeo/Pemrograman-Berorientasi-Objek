package week5;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total siswa: ");
        int totalSiswa = input.nextInt();
        
        System.out.print("Masukkan total daftar nilai: ");
        int totalMatkul = input.nextInt();
        int[][] x = new int[totalSiswa][totalMatkul]; // Declare and initialize the array

        
        for(int i = 0; i < totalSiswa; i++){ // Looping siswa
            for(int j = 0; j < totalMatkul; j++){
                System.out.print("Masukkan nilai siswa ke-" + (i + 1) +", ");
                System.out.print("masukan nilai ke-" + (j + 1) + ": ");

                x[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < totalSiswa; i++){
            System.out.println("Nilai siswa ke-" + (i + 1) + ": ");
                for(int j = 0; j < totalMatkul; j++){
                    System.out.println("Nilai ke- " + (j+1) + " : " + x[i][j]);
                }
                System.out.println("");
        }
        
    }
}
