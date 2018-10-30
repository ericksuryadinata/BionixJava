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
public class KonversiSuhu {
    
    public static void main(String[] args){
        double suhu, fahrenheit, kelvin, celcius;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Pilih Suhu : ");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukkan Suhu : ");
                suhu = input.nextDouble();
                fahrenheit = 1.8 * suhu + 32;
                kelvin = suhu + 273.15;
                System.out.println("Celcius -> Fahrenheit : " + fahrenheit);
                System.out.println("Celcius -> Kelvin : "  + kelvin);
                break;
            case 2:
                System.out.print("Masukkan Suhu : ");
                suhu = input.nextDouble();
                kelvin = 5.0 / 9.0 * ( suhu - 32 ) + 273.15;
                celcius = 5.0 / 9.0 * ( suhu - 32 );
                System.out.println("Fahrenheit -> Celcius : " + celcius);
                System.out.println("Fahrenheit -> Kelvin : "  + kelvin);
                break;
            case 3:
                System.out.print("Masukkan Suhu : ");
                suhu = input.nextDouble();
                fahrenheit = 1.8 * ( suhu - 273 ) + 32;
                celcius = suhu - 273.15;
                System.out.println("Kelvin -> Celcius : " + celcius);
                System.out.println("Kelvin -> Fahrenheit : "  + fahrenheit);
                break;
            default:
                System.out.println("Tidak ada pilihan");
                break;
        }
    }
}
