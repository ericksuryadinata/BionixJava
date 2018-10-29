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
public class Faktorial {
    
    // tahu faktorial kan ?? yang 1 * 2 * 3 * dst ituu
    // lah ini merupakan caranya, tapi masih pakai for
    // untuk step yang selanjutnya ada di paket sedang
    public static void main(String[] args){
        int angka = 5;
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }
        System.out.println("Faktorial " + angka + " adalah = " + hasil);
    }
}
