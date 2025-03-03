package penugasan;

public class Praktikum2{
    public static void main(String[] args){
        int lebar, tinggi, jarijari, sisi, alas, luas;
        tinggi = 8;
        jarijari = 7;
        alas = 6;
        float phi = 22.0f / 7.0f;

        System.out.println("=== KELILING LINGKARAN ===");
        //rumus keliling
        float KelilingLingkaran = 2 * phi * jarijari;
        System.out.println("Keliling Lingkaran adalah: " + KelilingLingkaran);

        System.out.println("\n=== LUAS SEGITIGA ===");
        //rumus luas
        float LuasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga adalah: " + LuasSegitiga);
        
        System.out.println("\n=== VOLUME TABUNG ===");
        //rumus volume
        float VolumeTabung = phi * (jarijari * jarijari) * tinggi;
        System.out.println("Volume Tabung adalah: " + VolumeTabung);
    }
}