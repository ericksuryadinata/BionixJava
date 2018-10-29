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
public class GlassHour {
    public static void main(String[] args){
        // Yak kita akan membuat bangun seperti
        // *
        // **
        // ***
        // ****
        // ***
        // **
        // *
        int n = 5;
         
         
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            for (int k = i; k <= n; k++) 
            { 
                System.out.print(k+" "); 
            } 
             
            System.out.println(); 
        } 
         
        for (int i = n-1; i >= 1; i--) 
        {
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
             
            System.out.println();
        } 
    }
}
