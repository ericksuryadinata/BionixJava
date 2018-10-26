/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.ERC;

/**
 *
 * @author erick
 */
public class ERC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // kwkwk namanya ERC, padahal aslinya 
        // Equality, Relational, dan Conditional Operators
        // ya semacam bagaimana cara cek sesuatu

        // ada 6 operator
        // == sama dengan
        // != tidak sama dengan
        // > lebih besar
        // >= lebih besar sama dengan
        // < kurang dari
        // <= kurang dari sama dengan

        int value1 = 1;
        int value2 = 2;
        if(value1 == value2) // 1
            System.out.println("value1 == value2");
        if(value1 != value2) // 2
            System.out.println("value1 != value2");
        if(value1 > value2) // 3
            System.out.println("value1 > value2");
        if(value1 < value2) // 4
            System.out.println("value1 < value2");
        if(value1 <= value2) // 5
            System.out.println("value1 <= value2");

        // dari semua kondisi diatas yang bakal di print hanya nomor 2, 4, 5
        // tau kenapa ?? ya dicek sendiri lah :v

        int anotherValue1 = 1;
        int anotherValue2 = 2;
        if((anotherValue1 == 1) && (anotherValue2 == 2)) // 1
            System.out.println("anotherValue1 is 1 AND anotherValue2 is 2");
        if((anotherValue1 == 1) || (anotherValue2 == 1)) // 2
            System.out.println("anotherValue1 is 1 OR anotherValue2 is 1");

        // nomor 1, akan print jika keduanya benar
        // nomor 2, akan print jika salah satunya benar

        // selain menggunakan if bisa juga dengan menggunakan ternary operator ( ? : )

        int ternary1 = 1;
        int ternary2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? ternary1 : ternary2;
        System.out.println(result);

        // bisa dipahami sendiri kan yak :v ???

        // untuk lebih lengkap disini https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

    }
}
