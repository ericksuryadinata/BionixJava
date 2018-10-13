/**
 * Fungsi
 */
public class Fungsi {

    static int fibo(int x){
        if(x == 0 || x == 1){
            return x;
        }else{
            return fibo(x - 1) + fibo(x - 2);
        }
    }
    public static void main(String[] args) {
        
    }
}