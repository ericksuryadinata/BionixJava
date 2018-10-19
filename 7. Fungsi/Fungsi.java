/**
 * Fungsi
 */
public class Fungsi {
    int a = 5;
    static void anu(int a){
        System.out.println("didalam fungsi "+ a);
    }
    public static void main(String[] args) {
        int a = 4;
        System.out.println("didalam main" + a);
        anu(a);
    }
}