import java.util.Scanner;

/**
 * TestCase
 */
public class TestCase {

    public static void main(String[] args) {
        int umur;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Umur : ");
        umur=input.nextInt();
        if (umur<12) {
            System.out.println("anak");
        } else if(umur<21){
            System.out.println("remaja");
        }else if (umur<45){
            System.out.println("dewasa");
        }else if (umur>45){
            System.out.println("tua");
        }
    }
}