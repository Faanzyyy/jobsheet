package JobSheet4;
import java.util.Scanner;

public class TugasAntrean09 {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);
        int kode;

        System.out.print("Masukkan Loket: ");
        kode = fandi.nextInt();

        switch(kode) {
            case 1:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Kode Tidak Tersedia");
                break;
        }
    }
}
