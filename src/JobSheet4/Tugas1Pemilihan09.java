package JobSheet4;
import java.util.Scanner;
public class Tugas1Pemilihan09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = fandi.nextBoolean();
        String pesan = uktLunas? 
        "Pembayaran UKT Terverifikasi \nSilahkan Cetak KRS Dan Minta Tanda Tangan DPA" : 
        "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);

    }
}
