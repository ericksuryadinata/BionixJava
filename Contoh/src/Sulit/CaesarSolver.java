/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sulit;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class CaesarSolver {
    
    public static String encrypt(String str,int keyLength){
        String encrypted="";
        
        for(int i = 0; i < str.length(); i++){
            // simpan ascii nya dari kata indeks ke i
            int c = str.charAt(i);
            
            // jika char nya huruf kapital
            if(Character.isUpperCase(c)){
                c = c + ( keyLength % 26 );
                // if c value exceeds the ascii value of 'Z' 
                // reduce it by subtracting 26(no.of alphabets)
                // to keep in boundaries of ascii values of 'A' and 'Z'
                if(c > 'Z')
                    c = c-26;
            }
            // jika char nya huruf kecil
            else if(Character.isLowerCase(c)){
                c=c+(keyLength%26);
                //if c value exceeds the ascii value of 'z' reduce it by subtracting 26(no.of alphabets) to keep in boundaries of ascii values of 'a' and 'z'
                if(c>'z')
                    c=c-26;
            }
            //concatinate the encrypted characters/strings
            encrypted=encrypted+(char) c;
        }
        return encrypted;
    }
    
    public static String decrypt(String str,int keyLength)
    {
        String decrypted="";
        for(int i=0;i<str.length();i++)
        {
            //stores ascii value of character in the string at index 'i'
            int c=str.charAt(i);
            //decryption logic for uppercase letters
            if(Character.isUpperCase(c))
            {
                c=c-(keyLength%26);
                //if c value deceed the ascii value of 'A' increase it by adding 26(no.of alphabets) to keep in boundaries of ascii values of 'A' and 'Z'
                if(c<'A')
                    c=c+26;
            }
            //decryption logic for uppercase letters
            else if(Character.isLowerCase(c))
            {
                c=c-(keyLength%26);
                //if c value deceed the ascii value of 'A' increase it by adding 26(no.of alphabets) to keep in boundaries of ascii values of 'A' and 'Z'
                if(c<'a')
                    c=c+26;
            }
            //concatinate the decrypted characters/strings
            decrypted=decrypted+(char) c;
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
            System.out.println("Plaintext = " + plainText.toUpperCase() );
            System.out.println("chipertext = " + encrypt(plainText, shift));
        }else{
            System.out.println("shift hanya bisa antara 0 - 25 (sesuai alphabet)");
        }
        
    }
    
    
}
