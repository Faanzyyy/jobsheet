package JobSheet4;
import java.util.Scanner;
public class Tugas2Pemilihan09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner (System.in);

        int jumlahSks;
        System.out.print("Masukkan Jumlah SKS: ");
        jumlahSks = fandi.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas.");
        } else {
            System.out.println("KRS Valid.");
        }
    }
}
