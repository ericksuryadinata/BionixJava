/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.Unary;

/**
 *
 * @author erick
 */
public class Unary{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // + menandakan bahwa angka itu positif
        // - menandakan bahwa angka itu negatif
        // ++ increment operator
        // -- decrement operator
        // ! logical complement operator

        int result = +1;
        // result sekarang 1
        System.out.println(result);

        result--;
        // result sekarang 0
        System.out.println(result);
        // karena dia akan dikurangi 1 per dieksekusi

        result++;
        // result sekarang 1
        System.out.println(result);
        // karena dia akan ditambah 1 per dieksekusi

        result = -result;
        // result sekarang -1
        System.out.println(result);
        // sama kayak force ke bilangan negatif

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

        int i = 3;
        // di state ini masih 3
        i++;
        // tapi saat disini udah 4
        System.out.println(i);
        // prints 4
        
        // sudah 5
        ++i;
        System.out.println(i);
        // prints 5, karena ditambahkan dulu baru print

        // saat disini udah 6
        System.out.println(++i);
        // print 6
        
        // tidak bertambah, karena state masih 6
        System.out.println(i++);
        // print 6
        
        // disini statenya udah jadi 7        
        System.out.println(i);
        // prints 7
    }
}