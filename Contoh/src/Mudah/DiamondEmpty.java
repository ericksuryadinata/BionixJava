/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mudah;

/**
 *
 * @author root
 */
public class DiamondEmpty {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }

            for(int k=5-i;k>=1;k--){
                System.out.print(" ");
            }

            for(int j=5;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){           
                System.out.print("*");
            }

            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=5;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
