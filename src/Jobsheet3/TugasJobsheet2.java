package Jobsheet3;
import java.util.Scanner;

public class TugasJobsheet2 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        int x;
        double biaya_jilid = 5000, biaya_cetak = 500, total_biaya;

        System.out.println("Masukkan jumlah cetakan dokumen = ");
        x = fandi.nextInt();

        biaya_cetak = x * biaya_cetak;
        total_biaya = biaya_jilid + biaya_cetak;

        System.out.println("Total biaya cetak dan jilid adalah = " + total_biaya);
    }
}
