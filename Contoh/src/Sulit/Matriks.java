/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sulit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erick
 */
public class Matriks {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void Print() throws IOException{
        int A[][] = new int [3][3];
        int B[][] = new int [3][3];
        int hasilKali[][] = new int [3][3];
        int nilai, tamp=0;
        System.out.println("INPUT ARRAY A");
        for(int i=0;i<3;i++){
		for(int j=0;j<3;j++)
		{
			System.out.print("Nilai A["+i+"]["+j+"] : ");
			nilai = Integer.parseInt(br.readLine());
                        A[i][j]=nilai;
		}
        }
        
        System.out.println("INPUT ARRAY B");
        for(int i=0;i<3;i++){
		for(int j=0;j<3;j++)
		{
			System.out.print("Nilai B["+i+"]["+j+"] : ");
			nilai = Integer.parseInt(br.readLine());
                        B[i][j]=nilai;
		}
        }
        
        System.out.println("MATRIKS A");
        for(int i=0;i<A.length;i++){
		for(int j=0;j<A[0].length;j++)
		{
                    System.out.print(A[i][j]+" ");
		}
                System.out.println(" ");
        }
        
        System.out.println("MATRIKS B");
        for(int i=0;i<B.length;i++){
		for(int j=0;j<B[0].length;j++)
		{
                    System.out.print(B[i][j]+" ");
		}
                System.out.println(" ");
        }
        
        System.out.println("PERTAMBAHAN MATRIKS A DAN B");
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){

                    tamp=tamp+A[i][j]+B[i][j];

                System.out.print(tamp+" ");
                tamp=0;
            }
            System.out.println(" ");
        }
        System.out.println("PENGURANGAN MATRIKS A DAN B");
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){

                    tamp=tamp+A[i][j]-B[i][j];

                System.out.print(tamp+" ");
                tamp=0;
            }
            System.out.println(" ");
        }
        
        System.out.println("PERKALIAN MATRIKS A DAN B");
        //UNTUK MENGALIKAN KEDUA MATRIKS DI ATAS
        for (int i=0; i<3; i++){       
            for (int j=0; j<3; j++){
                hasilKali[i][j] = 0;   
                for (int k=0; k<3;  k++){
                    hasilKali[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        //UNTUK MENAMPILKAN HASIL
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(" "+ hasilKali[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Matriks oby = new Matriks();
        oby.Print();
    }
}
