/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mudah;

/**
 *
 * @author erick
 */
public class Fungsi {
   
    // pertama buat fungsi untuk mencetak string
    // enak digunakan agar tidak panjang - panjang nulis 
    static void cetak(String string){
        System.out.println(string);
    }
    
    static int tambah(int x, int y){
        return x+y;
    }
    
    public static void main(String[] args){
        // ginikan enak :v, simple
        cetak("Aku belajar fungsi");
        int a = 5;
        int b = 6;
        System.out.println(tambah(a,b));
    }
}
