/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.WhileDoWhile;

/**
 *
 * @author erick
 */
public class WhileDoWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // ada 3 cara untuk melakukan looping
        // 1. while
        // 2. do while
        // 3. for

        // while
        // merupakan perulangan yang melakukan cek kondisional baru melakukan eksekusi
        // contoh
        int count = 1; // inisialiasi count = 1
        // cek dulu apakah count masih memenuhi
        while (count < 11) {
            // jika iya maka print angkanya
            System.out.println("Count ke: " + count);
            // jangan lupa melakukan increment terhadap count tersebut
            // jika tidak maka akan terjadi never end looping
            // alias bakal muter terus sampai pusing :v, bisa - bisa laptopmu ngehang kalau
            // loopnya mengandung eksekusi yang kompleks, jadi hati hati ya ^_^
            count++;
        }

        // do while
        // merupakan perulangan yang melakukan eksekusi dahulu baru melakukan cek kondisional
        // contoh
        int Iterasi = 1; // seperti biasa :v
        // disini dimulai do dahulu
        do {
            // lakukan print iterasi dahulu
            System.out.println("Iterasi ke: " + Iterasi);
            // sama seperti while jangan lupa melakukan increment
            Iterasi++;
        } while (Iterasi < 11); // cek apakah iterasi masih memenuhi

        // semua teknik diatas memerlukan perhatian khusus pada bagian yang melakukan increment
        // karena bisa jadi bukan increment melainkan melakukan decrement, atau kondisional lainnya

        // as always, sumbernya disini https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html

    }
}