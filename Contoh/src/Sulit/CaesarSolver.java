/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sulit;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CaesarSolver {
    
    // untuk mengetahui cara kerja caesar cipher ini, lihat contoh
    // selain itu juga lihat tabel ascii untuk mengetahui nilai int dari sebuah char
    public static String encrypt(String str,int keyLength){
        String encrypted="";
        
        for(int i = 0; i < str.length(); i++){
            // simpan ascii nya dari kata indeks ke i
            int c = str.charAt(i);
            // jika char nya huruf kapital
            if(Character.isUpperCase(c)){
                c = c + ( keyLength % 26 );
                // karena range huruf cuma A sampai Z
                // ketika ada huruf lebih besar dari Z, maka akan dikembalikan
                // ke huruf awal
                if(c > 'Z'){
                    c = c - 26;
                }
            }
            // jika char nya huruf kecil
            else if(Character.isLowerCase(c)){
                c = c + ( keyLength % 26 );
                // karena range huruf cuma A sampai Z
                // ketika ada huruf lebih besar dari Z, maka akan dikembalikan
                // ke huruf awal
                if(c > 'z')
                    c = c - 26;
            }
            // gabung semua character
            encrypted = encrypted + (char) c;
        }
        return encrypted;
    }
    
    public static String decrypt(String str,int keyLength){
        String decrypted="";
        
        for(int i = 0; i < str.length(); i++){
            // simpan ascii nya dari kata indeks ke i
            int c = str.charAt(i);
            // jika char nya huruf kapital
            if(Character.isUpperCase(c)){
                c = c - ( keyLength % 26 );
                // karena range huruf cuma A sampai Z
                // ketika ada huruf lebih besar dari Z, maka akan dikembalikan
                // ke huruf awal
                if(c < 'A')
                    c = c + 26;
            }
            // jika char nya huruf kecil
            else if(Character.isLowerCase(c)){
                c = c - ( keyLength % 26 );
                //if c value deceed the ascii value of 'A' increase it by adding 26(no.of alphabets) to keep in boundaries of ascii values of 'A' and 'Z'
                if(c < 'a')
                    c = c + 26;
            }
            //concatinate the decrypted characters/strings
            decrypted = decrypted + (char) c;
        }
        return decrypted;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata untuk di encrypt : ");
        String plainText = input.nextLine();
        System.out.print("Masukkan kunci: ");
        int shift = input.nextInt();
        
        if(!(shift < 0 || shift > 25)){
            System.out.println("\n==== ENCRYPT ====");
            System.out.println("Plaintext = " + plainText.toUpperCase() );
            String chiperText = encrypt(plainText, shift);
            System.out.println("Chipertext = " + chiperText);
            System.out.println("\n==== DECRYPT ====");
            System.out.println("Chipertext = " + chiperText);
            String decipherText = decrypt(chiperText, shift);
            System.out.println("Plaintext = " + decipherText);
        }else{
            System.out.println("shift hanya bisa antara 0 - 25 (sesuai alphabet)");
        }
        
    }
    
    
}
