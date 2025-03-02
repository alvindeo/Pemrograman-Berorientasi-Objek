package penugasan;
// @author Alvin Deo Ardiansyah

public class Menghitung{
    public static void main (String[] args) {
        //variabel yang dibutuhkan
        int panjang, lebar, tinggi, jarijari, sisi, alas, luas;
        panjang = 10;
        lebar = 5;
        tinggi = 8;
        jarijari = 7;
        sisi = 4;
        alas = 6;
        float phi =22/7;

       System.out.println("\n=== RUMUS PERSEGI ===");
        //rumus luas
        int LuasPersegi = sisi * sisi;
        System.out.println("Luas Persegi adalah: " + LuasPersegi);

        //rumus keliling
        int KelilingPersegi = 4 * sisi;
        System.out.println("Keliling Persegi adalah: " + KelilingPersegi);

        System.out.println("\n=== RUMUS SEGITIGA ===");
        //rumus luas
        float LuasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga adalah: " + LuasSegitiga);

        //rumus keliling
        float KelilingSegitiga = alas + sisi + sisi;
        System.out.println("Keliling Segitiga adalah: " + KelilingSegitiga);

        System.out.println("\n=== RUMUS LINGKARAN ===");
        //rumus luas
        float LuasLingkaran = phi * (jarijari * jarijari);
        System.out.println("Luas Lingkaran adalah: " + LuasLingkaran);

        //rumus keliling
        float KelilingLingkaran = 2 * phi * jarijari;
        System.out.println("Keliling Lingkaran adalah: " + KelilingLingkaran);

        System.out.println("\n=== RUMUS KUBUS ===");
        //rumus Luas
        int LuasKubus = 6 * (panjang * panjang);
        System.out.println("Luas Kubus adalah: " + LuasKubus);

        //rumus keliling
        int KelilingKubus = 12 * panjang;
        System.out.println("Keliling Kubus adalah: " + KelilingKubus);
    }
}
