/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohFungsiDanFor;

/**
 *
 * @author root
 */
public class Contoh1 {


    // method overriding, jadi semua method dengan parameter
    // apapun akan dibaca
    static void cetak(String string){
        System.out.println(string);
    }
    
    static void cetak(int string){
        System.out.println(string);
    }
    
    static void cetak(double string){
        System.out.println(string);
    }
    
    static void cetak(float string){
        System.out.println(string);
    }
    
    public static void main(String[] args){
        cetak("Dicetak lewat fungsi");
        cetak(1);
        cetak(0.1);
    }
}
