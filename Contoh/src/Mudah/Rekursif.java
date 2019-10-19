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
public class Rekursif {
    // fungsi rekursif
    static int tambah( int x){
        System.out.print(x);
        if(x == 0){
            return 0; 
        }
        return tambah(x-1);
    }
    
    static int factorial(int x){
        if(x == 1){
            return x;
        }
        return x * factorial(x - 1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cari Faktorial dari : ");
        int batas = input.nextInt();
        int faktor = factorial(batas);
        System.out.println("Nilai Faktorial dari " + batas + " adalah = " + faktor);
    }
}
