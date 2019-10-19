/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sulit;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class GamesBatuGuntingKertasNewVersion {
    public static void main(String args[]){
        // BATU GUNTING KERTAS
        // BATU > GUNTING
        // BATU < KERTAS
        // BATU == BATU
        // GUNTING > KERTAS
        // GUNTING < BATU
        // GUNTING == GUNTING
        // KERTAS > BATU
        // KERTAS < GUNTING
        // KERTAS == KERTAS
        
        final int BATU = 1, GUNTING = 2, KERTAS = 3;
        String maneh;
        Scanner input = new Scanner(System.in);
        
        do {            
            
            System.out.println("PILIHAN");
            System.out.println("BATU = 1");
            System.out.println("GUNTING = 2");
            System.out.println("KERTAS = 3");
            System.out.print("Masukkan pilihan Anda : ");
            int pilihan = input.nextInt();

            switch(pilihan){
                case BATU:
                    System.out.println("Anda pilih BATU");
                    break;
                case GUNTING:
                    System.out.println("Anda pilih GUNTING");
                    break;
                case KERTAS:
                    System.out.println("Anda pilih KERTAS");
                    break;
                default:
                    System.out.println("PILIHAN GAK ADA");
                    break;
            }

            int computer = (int) (Math.random() * 3) + 1;

            switch(computer){
                case BATU:
                    System.out.println("Komputer pilih BATU");
                    break;
                case GUNTING:
                    System.out.println("Komputer pilih GUNTING");
                    break;
                case KERTAS:
                    System.out.println("Komputer pilih KERTAS");
                    break;
                default:
                    System.out.println("PILIHAN GAK ADA");
                    break;
            }

            if(computer == BATU){
                if(pilihan == KERTAS){
                    System.out.println("Anda Menang");
                }else if(pilihan == GUNTING){
                    System.out.println("Komputer Menang");
                }else{
                    System.out.println("Seri");
                }
            }

            if(computer == GUNTING){
                if(pilihan == KERTAS){
                    System.out.println("Komputer Menang");
                }else if(pilihan == GUNTING){
                    System.out.println("Seri");
                }else{
                    System.out.println("Anda Menang");
                }
            }

            if(computer == KERTAS){
                if(pilihan == KERTAS){
                    System.out.println("Seri");
                }else if(pilihan == GUNTING){
                    System.out.println("Anda Menang");
                }else{
                    System.out.println("Komputer Menang");
                }
            }
            
            System.out.println("Maneh GAK ? (y/n)");
            maneh = input.next();
        } while (maneh.equalsIgnoreCase("y"));
        System.out.println("Wes Mari Main mu");
    }
}
