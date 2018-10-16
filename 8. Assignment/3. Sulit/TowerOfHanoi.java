/**
 * TowerOfHanoi
 */
import java.util.Scanner;
public class TowerOfHanoi {

    // disini sebenarnya cukup sulit untuk kalian, tapi ya entah lagi kalau kalian cepet belajarnya

    public static void TOH(int stack, char begin, char aux, char end){

        if(stack == 0) return;

        TOH(stack - 1, begin, end, aux);
        System.out.println(begin + " " + end);
        TOH(stack - 1, aux, begin, end);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Stack Menara : ");
        int towerHeight = input.nextInt();
        TOH(towerHeight, 'a', 'b', 'c');
        input.close();
    }
}