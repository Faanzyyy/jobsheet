package Jobsheet2;

import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak per bulan: ");
        int tunjanganAnak = input.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();
        double persenPensiun = 0.10;

        int totalTunjangan = tunjanganAnak * jumlahAnak;
        double potonganPensiun = persenPensiun * gajiPokok;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji pokok = " + gajiPokok);
        System.out.println("Tunjangan per anak = " + tunjanganAnak);
        System.out.println("Jumlah anak = " + jumlahAnak);
        System.out.println("Total tunjangan = " + totalTunjangan);
        System.out.println("Potongan pensiun 10% = " + potonganPensiun);
        System.out.println("Gaji bersih = " + gajiBersih);
    }
}
