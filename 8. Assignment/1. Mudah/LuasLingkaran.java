/**
 * Luas Lingkaran
 */
import java.util.Scanner;
public class LuasLingkaran {

    // 2. Buat deret bilangan aritmatika bertingkat 2n^2 - n
    //    Print masing - masing deret

    public static void main(String[] args) {
        int jarijari;
        double luas;
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan jari jari= ");
        jarijari = input.nextInt();
        luas= 3.14*jarijari*jarijari;
        System.out.println("luas = "+luas);
        input.close();
    }
}