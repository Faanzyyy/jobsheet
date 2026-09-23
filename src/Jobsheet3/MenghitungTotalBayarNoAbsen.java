package Jobsheet3;

import java.util.Scanner;
public class MenghitungTotalBayarNoAbsen {
    public static void main(String[] args) {
        Scanner fandi = new Scanner (System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        harga = fandi.nextInt();
        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus dibayarkan = " + jml_bayar);
    }
}
