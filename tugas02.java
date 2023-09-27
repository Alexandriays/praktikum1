package praktikum3b;

import java.util.Scanner;
public class Praktikum3b {

    public static void main(String[] args) {
        // deklarasi scanner dan variabel
        Scanner scan = new Scanner(System.in);
        int banyakPembelian, bonusBarang = 0, cashback, tambahanBarang;
        
        System.out.println("======== Selamat Datang di Toko Charlie ========");
        
        //input
        System.out.print("Banyak Pembelian Barang : ");
        banyakPembelian = scan.nextInt();
        tambahanBarang = banyakPembelian/3; 
        
        System.out.println("================================================");
        
        
        //perhitungan
        if (banyakPembelian > 0 )  {
            if(banyakPembelian % 7 ==0)
            {
            cashback = banyakPembelian / 7 *5500; 
            }
                cashback = banyakPembelian / 7 *5500; 
                System.out.println("Cashback : Rp" + cashback);
                System.out.println("Tambahan Barang : " + tambahanBarang);
                System.out.println("Jumlah Barang : " + (banyakPembelian + tambahanBarang));
            } else {
                //System.out.println("Cashback : -");
                System.err.println("ERROR - Inputan harus lebih dari 0");
            } 
               
        }
        
    }
