package JobSheet4;
import java.util.Scanner;
public class PemilihanIf09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = fandi.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS Dan Minta Tanda Tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}
