/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sedang;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Kalkulator {
    
    // kita akan membuat kalkulator sederhana
    // harapannya kalian bisa tahu fungsi sederhana :D
    static double tambah(double x, double y){
        return x+y;
    }
    
    static double kurang(double x, double y){
        return x-y;
    }
    
    static double kali(double x, double y){
        return x*y;
    }
    
    static double bagi(double x, double y){
        return x/y;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("OPERASI");
        System.out.println("1. Kali");
        System.out.println("2. Bagi");
        System.out.println("3. Tambah");
        System.out.println("4. Kurang");
        System.out.print("Pilih operasi (1/2/3/4) ? ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Masukkan angka pertama : ");
                double angka1 = input.nextDouble();
                System.out.print("Masukkan angka pertama : ");
                double angka2 = input.nextDouble();
                System.out.println("Hasil : " + tambah(angka1, angka2));
                break;
            case 2:
                // ini gimana ?
                break;
            case 3:
                // ini gimana ?
                break;
            case 4:
                // ini gimana ?
                break;
            default:
                System.out.println("Operasi tidak ada");
                break;
        }
        
        
    }
    
    
    
    
}
