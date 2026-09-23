package Jobsheet2;

import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
     System.out.println("Masukkan lebar tanah: ");
     int lebarTanah = input.nextInt();
     System.out.println("Masukkan panjang tanah: ");
     int panjangTanah = input.nextInt();
     System.out.println("Masukkan diameter kolam: ");
     int diameterKolam = input.nextInt();
     System.out.println("Masukkan sisi taman: ");
     int sisiTaman = input.nextInt();

     int luasTanah = panjangTanah * lebarTanah;
     int jariJari = diameterKolam / 2;
     double luasKolam = 3.14 * jariJari * jariJari;
     int luasTaman = sisiTaman * sisiTaman;
     double luasYangTidakDigunakan = luasTanah - luasKolam - luasTaman;

     System.out.println("Luas tanah = " + luasTanah);
     System.out.println("Luas kolam = " + luasKolam);
     System.out.println("Luas taman = " + luasTaman);
     System.out.println("Luas yang tidak digunakan = " + luasYangTidakDigunakan);
    }
}
