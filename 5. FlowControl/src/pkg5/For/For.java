/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.For;

/**
 *
 * @author erick
 */
public class For {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ini merupakan teknik lain dari looping
        // secara umum for terdiri dari 3 bagian
        // yaitu initialization, termination, dan increment
        // for (initialization; termination; increment)
        // contoh 
        for (int i = 0; i < 5; i++) {
            // code here
        }

        // code diatas bisa diartikan sebagai berikut
        // untuk i = 0, lakukan perulangan sampai 5 dengan penambahan i sebanyak 1

        // contoh lain
        for (int i = 100; 0 >= i; i-=2) {
            // code here
        }

        // code diatas bisa diartikan sebagai berikut
        // untuk i = 100, lakukan perulangan sampai dengan 0 dengan pengurangan i sebanyak 2

        // ya sekiranya segitu aja, yang lainnya bisa dibaca di https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html

    }    
}
