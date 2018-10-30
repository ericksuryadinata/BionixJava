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
public class Pika {
    static int pika(int x, int y){
        if( x + y == 0){
            return 0;
        }else if(x > y){
            return y + pika(x - 1 , y);
        }else{
            return x + pika(x , y - 1);
        }
    }
    
    public static void main(String[] args){
        System.out.println(pika(5,6));
    }
    
}
