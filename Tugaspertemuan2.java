/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Tugaspertemuan2 {
    

    public static void main(String[] args) {
        
    //nomor 1    
       Scanner input = new Scanner(System.in);
        
        /*double a,b,c;
        
        System.out.println("Masukkan Pecahan Pertama");
        a = input.nextDouble();
        
        System.out.println("Masukkan Pecahan Kedua");
        b = input.nextDouble();
        
        System.out.println("Masukkan Pecahan Ketiga");
        c = input.nextDouble();
        
        double jumlah = a + b + c;
        double kurang = a - b - c;
        double kali = a * b * c;
        double bagi = a / b / c;
        
        System.out.println("Hasil Penjumlahan = " + jumlah);
        System.out.println("Hasil Pengurangan = " + kurang);
        System.out.println("Hasil Perkalian = " + kali);
        System.out.println("Hasil Pembagian = " + bagi);
        */
        
    //nomor 2
        /*int ranking;
        boolean naikKelas;
        
        System.out.println("Apakah Anda Naik Kelas? (true/false)");
        naikKelas = input.nextBoolean();
        
        System.out.println("Masukan Ranking Anda:");
        ranking = input.nextInt();
        
        boolean hadiah = (ranking == 1) && (naikKelas);
        System.out.println("Anda dapat hadiah:" + hadiah);
        */
        
    //nomor 3
    char a = 'A';
    char b = 'B';
    
        int asciiA = (int) a;
        int asciiB = (int) b;
        
        int hasil = asciiA + asciiB;
        
        System.out.println("ascii dari A = " + asciiA);
        System.out.println("ascii dari B = " + asciiB);
        System.out.println("jumlah dari keduanya = " + hasil);
        
        input.close();
        
    }
}
