/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sulit;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class TowerOfHanoi {

    // disini sebenarnya cukup sulit untuk kalian, tapi ya entah lagi kalau kalian cepet belajarnya

    public static void TOH(int stack, char begin, char aux, char end){

        if(stack == 0) return;

        TOH(stack - 1, begin, end, aux);
        System.out.println(begin + " " + end);
        TOH(stack - 1, aux, begin, end);

    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Stack Menara : ");
            int towerHeight = input.nextInt();
            TOH(towerHeight, 'a', 'b', 'c');
        }
    }
}
