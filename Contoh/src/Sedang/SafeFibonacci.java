/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sedang;

/**
 *
 * @author erick
 */
public class SafeFibonacci {
    
    static long safeFibonacci(int x){
        // menggunakan bottom up dynamic programming
        long[] f = new long[x + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= x; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[x];
    }
    
    static int fibonacci(int x){
        if(x < 2) return x;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    
    public static void main(String[] args){
        int angka = 5;
        System.out.println("Fibonacci 5 : " + fibonacci(5));
        System.out.println("Urutannya");
        for (int i = 1; i <= 5; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
