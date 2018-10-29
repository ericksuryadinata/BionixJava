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
public class BatuGuntingKertas {
    public static void main(String[] args) {
        // scanner ini untuk inputan
        Scanner in = new Scanner(System.in);
        // opsi digunakan untuk menginisialisasikan 
        // pilihan
        final int OPSI = 3;
        // cuma permisalan nilai
        final int BATU = 1, GUNTING = 2, KERTAS = 3;
        final int COMPUTER = 1, PLAYER = 2, SERI = 3;
        int computer, player, hasil = 0;
        int menang = 0, kalah = 0, seri = 0;
        String lanjut;

        do {
            System.out.println();
            System.out.println("OPSI : ");
            System.out.println("1. BATU\n2. GUNTING\n3. KERTAS");
            System.out.print("Masukkan pilihan mu : ");
            player = in.nextInt();
            if(player > 3){
                System.out.println("Pilihan Diluar OPSI");
            }else{
                switch (player) {
                    case BATU:
                        System.out.println("Kamu Pilih : Batu");
                        break;
                    case GUNTING:
                        System.out.println("Kamu Pilih : Gunting");
                        break;
                    case KERTAS:
                        System.out.println("Kamu Pilih : Kertas");
                        break;
                }
                computer = (int) (Math.random() * OPSI) + 1;
                switch (computer) {
                    case BATU:
                        System.out.println("Komputer Pilih : Batu");
                        if(player == GUNTING){
                            hasil = COMPUTER;
                        }else{
                            if(player == KERTAS){
                                hasil = PLAYER;
                            }else{
                                hasil = SERI;
                            }
                        }
                        break;
    
                    case GUNTING:
                        System.out.println("Komputer Pilih : Gunting");
                        if(player == KERTAS){
                            hasil = COMPUTER;
                        }else{
                            if(player == BATU){
                                hasil = PLAYER;
                            }else{
                                hasil = SERI;
                            }
                        }
                        break;
    
                    case KERTAS:
                        System.out.println("Komputer Pilih : Kertas");
                        if(player == BATU){
                            hasil = COMPUTER;
                        }else{
                            if(player == GUNTING){
                                hasil = PLAYER;
                            }else{
                                hasil = SERI;
                            }
                        }
                        break;
                    default:
                        System.err.println("Something happen with the computer mind !!");
                        break;
                }

                if(hasil == COMPUTER){
                    System.out.println("Komputer Menang !!");
                    kalah++;
                }else{
                    if(hasil == PLAYER){
                        System.out.println("Kamu Menang !!");
                        menang++;
                    }else{
                        System.out.println("Seri !!");
                        seri++;
                    }
                }
            }
            
            System.out.print("Lanjut Main ?? (y/n) : ");
            lanjut = in.next();
        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println();
        System.out.println("Kamu Menang " + menang + " Kali");
        System.out.println("Komputer Menang " + kalah + " Kali");
        System.out.println("Seri " + seri + " Kali");
        in.close();
    }
}
