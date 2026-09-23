package Jobsheet2;

public class ContohVariabel09 {
    public static void main(String[] args) {
            
        String hobySaya = "Bermain Petak Umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(hobySaya);
        System.out.println("Apakah Pandai = " + isPandai);
        System.out.println("Jenis Kelamin Saya Adalah = " + jenisKelamin);
        System.out.println("Umur Saya sekarang adalah = " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
