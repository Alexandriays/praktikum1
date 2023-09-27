package praktikum03a;

import java.util.Scanner;

public class Praktikum03a {

    public static void main(String[] args) {
        // deklarasi scanner dan variabel
        Scanner scan = new Scanner(System.in);
        double laptop, bukuTulis, kotakPensil, smartphone, total, banyakLaptop, banyakBukuTulis, banyakKotakPensil, banyakSmartphone;
        int indeks =0;

        System.out.println("========Indeks Berat Barang Bawaan Tasku========");

        //input
        System.out.print("Banyak laptop : ");
        banyakLaptop = scan.nextDouble();
        laptop = banyakLaptop * 850.56;

        System.out.print("Banyak Buku Tulis : ");
        banyakBukuTulis = scan.nextDouble();
        bukuTulis = banyakBukuTulis * 250.11;

        System.out.print("Banyak Kotak Pensil : ");
        banyakKotakPensil = scan.nextDouble();
        kotakPensil = banyakKotakPensil * 25.31;

        System.out.print("Banyak Smartphone : ");
        banyakSmartphone = scan.nextDouble();
        smartphone = banyakSmartphone * 200.00;

        total = laptop + bukuTulis + kotakPensil + smartphone;

        if (total >= 0) {
            if (total > 2000) {
                indeks = 5;
            } else if (total < 2000 && total >= 1500) {
                indeks = 4;
            } else if (total < 1500 && total >= 1000) {
                indeks = 3;
            } else if (total < 1000 && total >= 500) {
                indeks = 2;
            } else if (total < 500 && total >= 0) {
                indeks = 1;
            } else {
                indeks = 0;
            }

            System.out.println("================================================");

            System.out.println("Indeks Berat Barang : " + indeks);
            if (indeks==5) {
                System.err.println("Berat barang melebihi ketentuan");
            } else {
                System.out.println("Bawaan barang tidak melebihi ketentuan, amannn...");
            }
        } else {
            System.err.println("ERROR - Tidak diperkenankan bilangan negatif!");
        }

    }

}
