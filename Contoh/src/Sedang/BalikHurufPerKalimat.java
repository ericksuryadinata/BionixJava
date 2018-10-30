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
public class BalikHurufPerKalimat {
    
    public static String pembalik(String str){
        String hurufku = "";
        String katadibalik="";
        for ( int d = str.length() - 1 ; d >= 0 ; d-- ){
            if(str.charAt(d) == ' '){
                    katadibalik = str.charAt(d) + hurufku + katadibalik;
                    hurufku = "";
            }
            else{
                    hurufku = hurufku + str.charAt(d);
            }

        }
        hurufku = hurufku + katadibalik;
        return hurufku;
    }
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kalimat Yang Akan Di Balik = ");
        String in = input.nextLine();
        
        System.out.println("");
        System.out.println("Hasil Kalimat Sebelum Dibalik = " + in);
        System.out.println("Hasil Kalimat Setelah dibalik = " + pembalik(in));
    }
}
