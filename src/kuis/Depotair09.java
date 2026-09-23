package kuis;
import java.util.Scanner;

public class Depotair09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahGalon;
        int kapasitasGalon = 19;
        int jumlahAir;
        char satuanAir = 'L';
        int sisaAir ;
        int jamKerja = 8;
        double hargaGalon = 19500;
        double pendapatan;
        double rataRataPerJam;

        
        System.out.println("Jumlah Air yang diproduksi hari itu: ");
        jumlahAir = sc.nextInt();

        jumlahGalon = jumlahAir / kapasitasGalon;
        sisaAir = jumlahAir % jumlahGalon * jamKerja;
        pendapatan = jumlahGalon * hargaGalon;
        rataRataPerJam = pendapatan / jamKerja;

        System.out.println("Jumlah Galon adalah: " +jumlahGalon);
        System.out.println("Sisa Airnya adalah:  " + sisaAir + satuanAir);
        System.out.println("Pendapatan sehari adalah:Rp. " + pendapatan);
        System.out.println("Rata Rata Pendapatan per jam Adalah: Rp. " + rataRataPerJam);

        //Output =
        //Jumlah Air yang diproduksi hari itu: 
        //1000
        //Jumlah Galon adalah: 52
        //Sisa Airnya adalah:  96L  
        //Pendapatan sehari adalah: 1014000.0
        //Rata Rata Pendapatan per jam Adalah: 126750.0
        }    
}
