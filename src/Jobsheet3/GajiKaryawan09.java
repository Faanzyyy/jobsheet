package Jobsheet3;

import java.util.Scanner;
public class GajiKaryawan09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        gajiPokok = fandi.nextInt();
        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransp + tunjMkn - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan anda adalah = " + bonus);
        System.out.println("Gaji yang anda terima adalah = " + (int) totGaji);
    }
}
