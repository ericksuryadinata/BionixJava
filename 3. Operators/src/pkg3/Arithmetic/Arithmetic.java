/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.Arithmetic;

/**
 *
 * @author erick
 */
public class Arithmetic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // + additive
        // - substraction
        // * Multiplication
        // / division

        // % Remainder (modulus), lek gak ngerti modulus, sisa bagi
        // contoh 1 % 2 = 1, artinya 1 dibagi 2 sisanya 1 kan ?
        // lagi, 7 % 5 = 2, artinya 7 dibagi 5 sisanya 2 kan ?
        // ya semacam gitulah
        
        // contoh
        int result = 1 + 2;
        // result sekarang 3
        System.out.println("1 + 2 = " + result);
        // output 1 + 2 = 3
        
        // 3 ditampung aja
        int original_result = result;

        result = result - 1;
        // result sekarang 2
        System.out.println(original_result + " - 1 = " + result);
        // output 3 - 1 = 2
        
        // 2 ditampung aja
        original_result = result;

        result = result * 2;
        // result sekarang 4
        System.out.println(original_result + " * 2 = " + result);
        //output 2 * 2 = 4
        
        // 4 ditampung aja
        original_result = result;

        result = result / 2;
        // result sekarang 2
        System.out.println(original_result + " / 2 = " + result);
        // output 4 / 2 = 2

        // 2 ditampung aja
        original_result = result;

        result = result + 8;
        // result sekarang 10
        System.out.println(original_result + " + 8 = " + result);
        // output 2 + 8 = 10

        // ditampung aja
        original_result = result;

        result = result % 7;
        // result sekarang 3
        System.out.println(original_result + " % 7 = " + result);
        // output 10 % 7 = 3

        // untuk operator + juga bisa digunakan untuk menggabung antar string
        // atau juga bisa digunakan untuk menyusun suatu kalimat

        // contoh
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
        // output This is a concatenated string.

        // lebih lengkap disini https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
    }
}
