package Jobsheet3;
import java.util.Scanner;

public class TugasJobsheet1 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        double x,y;
        int z;
        double sisa_utang, total_bunga, total_bayar, cicilan_per_bulan;

        System.out.println("Masukkan harga laptop = ");
        x = fandi.nextDouble();
        System.out.println("Masukkan uang muka = ");
        y = fandi.nextDouble();
        System.out.println("Masukkan lama cicilan = ");
        z = fandi.nextInt();

        sisa_utang = x - y;
        total_bunga = sisa_utang * 0.02 * z;
        total_bayar = sisa_utang + total_bunga;
        cicilan_per_bulan = total_bayar / z;

        System.out.println("Jumlah cicilan yang harus dibayar = " + cicilan_per_bulan);
    }
}
