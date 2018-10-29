package Sedang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class Faktorial {
    
    static int faktor(int x){
        if(x == 0) return 1;
        
        return x * faktor(x - 1);
    }
    
    public static void main(String[] args){
        int angka = 5;
        System.out.println("Faktorial " + angka + " adalah : " + faktor(5));
    }
}
