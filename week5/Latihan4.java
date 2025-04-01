// Source code is decompiled from a .class file using FernFlower decompiler.
package week5;

import java.util.Scanner;

public class Latihan4 {

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("=== Program Matriks ===");
      System.out.print("Input baris matrix A: ");
      int var2 = var1.nextInt();
      System.out.print("Input kolom matrix A: ");
      int var3 = var1.nextInt();
      int[][] var4 = new int[var2][var3];
      System.out.println("Input matrix A:");

      int var5;
      int var6;
      for(var5 = 0; var5 < var2; ++var5) {
         for(var6 = 0; var6 < var3; ++var6) {
            System.out.print("Masukkan elemen A[" + var5 + "][" + var6 + "]: ");
            var4[var5][var6] = var1.nextInt();
         }
      }

      System.out.print("\n\nInput baris matrix B: ");
      var5 = var1.nextInt();
      System.out.print("Input kolom matrix B: ");
      var6 = var1.nextInt();
      int[][] var7 = new int[var5][var6];
      int[][] var8 = new int[var2][var3];
      System.out.println("Input matrix B:");

      int var9;
      int var10;
      for(var9 = 0; var9 < var5; ++var9) {
         for(var10 = 0; var10 < var6; ++var10) {
            System.out.print("Masukkan elemen B[" + var9 + "][" + var10 + "]: ");
            var7[var9][var10] = var1.nextInt();
         }
      }

      System.out.println("\nMatrix A:");

      for(var9 = 0; var9 < var2; ++var9) {
         for(var10 = 0; var10 < var3; ++var10) {
            System.out.print(var4[var9][var10] + " ");
         }

         System.out.println();
      }

      System.out.println("\nMatrix B:");

      for(var9 = 0; var9 < var5; ++var9) {
         for(var10 = 0; var10 < var6; ++var10) {
            System.out.print(var7[var9][var10] + " ");
         }

         System.out.println();
      }

      label129:
      do {
         System.out.println("\nPilih menu operasi:");
         System.out.println("1. Penjumlahan");
         System.out.println("2. Pengurangan");
         System.out.println("3. Perkalian");
         System.out.println("4. Pembagian");
         System.out.println("5. Keluar");
         System.out.print("Masukkan pilihan: ");
         var9 = var1.nextInt();
         int var11;
         switch (var9) {
            case 1:
               System.out.println("\nHasil Penjumlahan Matrix A + B:");

               for(var10 = 0; var10 < var2; ++var10) {
                  for(var11 = 0; var11 < var3; ++var11) {
                     var8[var10][var11] = var4[var10][var11] + var7[var10][var11];
                     System.out.print(var8[var10][var11] + " ");
                  }

                  System.out.println();
               }
               break;
            case 2:
               System.out.println("\nHasil Pengurangan Matrix A - B:");
               var10 = 0;

               while(true) {
                  if (var10 >= var2) {
                     continue label129;
                  }

                  for(var11 = 0; var11 < var3; ++var11) {
                     var8[var10][var11] = var4[var10][var11] - var7[var10][var11];
                     System.out.print(var8[var10][var11] + " ");
                  }

                  System.out.println();
                  ++var10;
               }
            case 3:
               if (var3 != var5) {
                  System.out.println("\nPerkalian tidak bisa dilakukan karena jumlah kolom A tidak sama dengan jumlah baris B.");
                  break;
               } else {
                  int[][] var14 = new int[var2][var6];
                  System.out.println("\nHasil Perkalian Matrix A * B:");
                  var11 = 0;

                  while(true) {
                     if (var11 >= var2) {
                        continue label129;
                     }

                     for(int var12 = 0; var12 < var6; ++var12) {
                        var14[var11][var12] = 0;

                        for(int var13 = 0; var13 < var3; ++var13) {
                           var14[var11][var12] += var4[var11][var13] * var7[var13][var12];
                        }

                        System.out.print(var14[var11][var12] + " ");
                     }

                     System.out.println();
                     ++var11;
                  }
               }
            case 4:
               System.out.println("\nHasil Pembagian Matrix A / B:");
               var10 = 0;

               while(true) {
                  if (var10 >= var2) {
                     continue label129;
                  }

                  for(var11 = 0; var11 < var3; ++var11) {
                     if (var7[var10][var11] == 0) {
                        System.out.print("NaN ");
                     } else {
                        var8[var10][var11] = var4[var10][var11] / var7[var10][var11];
                        System.out.print(var8[var10][var11] + " ");
                     }
                  }

                  System.out.println();
                  ++var10;
               }
            case 5:
               System.out.println("Terima kasih telah menggunakan program ini!");
               break;
            default:
               System.out.println("Pilihan tidak valid. Silakan coba lagi.");
         }
      } while(var9 != 5);

      if (var2 == var5 && var3 == var6) {
         var1.close();
      } else {
         System.out.println("Penjumlahan tidak bisa dilakukan karena ukuran matriks berbeda.");
         var1.close();
      }
   }
}
