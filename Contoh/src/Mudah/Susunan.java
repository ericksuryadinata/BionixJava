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
public class Susunan {
    
    // Yak kita akan membuat bangun seperti
    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *
    public static void main(String[] args){
        int batas = 5;
        for (int i = 0; i < batas; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < batas - 1; i++) {
            for (int j = 0; j < batas - 1 - i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
