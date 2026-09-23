package Jobsheet3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner fandi = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        panjang = fandi.nextInt();
        lebar = fandi.nextInt();

        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah: " + luas);
    }
}


