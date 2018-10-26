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
public class Pascal {
    public static void main(String[] args) {
 
        //         1
        //       1   1
        //     1   2   1
        //   1   3   3   1
        // 1   4   6   4   1
        
        int n = 5;
 
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", ""); // ini print spasi
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
 
    }
}
