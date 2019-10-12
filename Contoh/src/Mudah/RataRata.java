/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mudah;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RataRata {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        // inputkan banyak murid
        System.out.print("Masukkan banyak murid : ");
        int banyakAngka = input.nextInt();
        // inisialisasi array sebanyak muridnya
        int angka[] = new int[banyakAngka];
        
        
        double total = 0;
        double rata = 0;
        
        // inputkan nilai muridnya
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print("Nilai Murid ke - " + (i+1) + " = ");
            angka[i] = input.nextInt();
        }
        
        // hitung total nilai muridnya
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
        }
        
        // rata - rata nilai muridnya
        rata = total / angka.length;
        
        // tampilkan total nilai dan rata - rata
        System.out.println("Total Nilai " + total);
        System.out.println("Rata " + rata);
    }
}
