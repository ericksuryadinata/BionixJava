/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mudah;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Prima {
    
    public static void main(String[] args){
        int jumlah, bil, cek, i;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan batas : ");
        int batas = input.nextInt();
	jumlah=1;
	for(bil=2;jumlah<=batas;bil++){
            cek=0;
            for(i=2;i<bil;i++)
            {
                    if(bil%i==0)
                    {
                        cek=1;
                    }
            }
            if(cek==0)
            {
                    if(jumlah==batas)
                    System.out.print(bil);
                    else
                    System.out.print(bil+", ");
                    jumlah=jumlah+1;
            }
	}
    }
}
