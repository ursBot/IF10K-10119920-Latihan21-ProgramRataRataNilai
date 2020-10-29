/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class RataRataNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int mahasiswa, nilai, i;
        float rata, jumlah;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = input.nextInt();
        jumlah = 0;
        i = 1;
        
        while (i <= mahasiswa){
            System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
            nilai = input.nextInt();
            jumlah += nilai;
            i++;
        }
        rata = jumlah / mahasiswa;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+ rata);
        System.out.println("Developed by : Umar Said Adi Pranoto");
    }
    
}
