/**
 * Fibonacci
 */
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        int deret, hasil = 0, sebelum = 0, saat_ini = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Deret ke : ");
        deret = input.nextInt();
        if(deret == 0){
            System.err.println("Deret harus lebih dari sama dengan 1");
        }else{
            for (int i = 1; i <= deret; i++) {
                if(i == 1 || i == 2){
                    hasil = i - 1;
                } else {
                    hasil = sebelum + saat_ini;
                    sebelum = saat_ini;
                    saat_ini = hasil;
                }
                System.out.print(hasil+" ");
            }
            System.out.println("\n"+hasil+" ");
        }
    }
}