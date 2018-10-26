/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mudah;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class LuasLingkaran {
    
    
    public static void main(String[] args){
        
        final double PHI = 3.14;
        
        // Karena kita butuh inputan
        Scanner input = new Scanner(System.in);
        // ini hasil inputan masuk ke variabel bernama jari
        // mengapa pake double ?? ya mungkin aja mau nginput koma
        System.out.print("Masukkan Jari - Jari = ");
        double jari = input.nextInt();
        
        double luasLingkaran = PHI * Math.pow(jari, 2);
        
        System.out.println("Luas Lingkaran = "  + luasLingkaran);
    }
}
