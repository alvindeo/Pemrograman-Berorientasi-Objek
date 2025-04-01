package week5;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int [] x; // Cara 1
        // x = new int[3];
        // x[0] = 20 ;x[1] = 10 ; x[2] = 30;
        // System.out.println("Nilai x[0] : " + x[0]);
        // System.out.println("Nilai x[1] : " + x[1]);
        // System.out.println("Nilai x[2] : " + x[2]);

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data : ");
        int angka = input.nextInt();
        int[] x = new int[angka]; // Declare and initialize the array

        //for untuk input data
        for(int i=0; i<angka; i++){
            System.out.println("data ke-" + (i + 1) + ": ");
            x[i] = input.nextInt();
        }
        
        //for untuk menampilkan data
        for(int y=0; y<angka; y++){
            System.out.println("Hasil nilai [" + y + "] : " + x[y]);
        }
    }
}
