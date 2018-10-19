/**
 * Bintang
 */
public class Bintang {

    public static void main(String[] args) {
        int batas = 5;
        for (int i = 0; i < batas; i++) {
            for (int j = 0; j < batas - i; j++) {
                System.out.print(j);   
            }
            System.out.println();
        }

        for (int i = 0; i < batas; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}