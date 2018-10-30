/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.Fungsi;

/**
 *
 * @author erick
 */
public class Fungsi {
    
    // dalam mendefinisikan sebuah fungsi harus paham
    // 1. Modifiers
    // 2. Return type
    // 3. Nama Method / Fungsi
    // 4. Parameter
    
    // sehingga kalau dituliskan akan menjadi
    // modifier returnType nameOfMethod (Parameter List) {
        // method body
    // }
    
    // contoh pertama, dibawah ini merupakan fungsi dengan
    // static modifier
    // return type void
    // Nama fungsinya
    static void print(String kalimat){
        System.out.println("Kalimatnya "+ kalimat);
    }
    
    // contoh pertama, dibawah ini merupakan fungsi dengan
    // static modifier
    // return type int
    // Nama fungsinya
    static int tambah(int a, int b){
        return a + b ;
    }
    
    // untuk fungsi diatas, mengapa harus ada returnnya ?
    // karena bukan tipe void
    // jadi bisa dikatakan selain tipe void harus mempunyai return type

    public static void main(String[] args) {
        int a = 4, b=5;
        String k = "Aku kamu";
        
        // ini tidak akan mengeluarkan apa apa
        tambah(a,b);
        
        // yang ini akan print Aku Kamu
        print(k);
        
        // ini baru print hasil pertambahan
        System.out.println("hasil tambah"  + tambah(a,b));
    }
    
    // full list untuk materi ini ada di https://www.tutorialspoint.com/java/java_methods.htm
    // atau https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
}
