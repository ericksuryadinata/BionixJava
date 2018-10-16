import java.util.Scanner;
class FibonacciRekursif{

    public static int fibonacci(int batas){
        if(batas == 1 || batas == 2){
            return batas - 1;
        }
        return fibonacci(batas - 1) +  fibonacci(batas - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = input.nextInt();
        if(batas == 0){
            System.out.println("Batas harus lebih dari 0");
        }else{
            for (int i = 1; i <= batas; i++) {
                if(i == batas){
                    System.out.print(fibonacci(i));
                }else{
                    System.out.print(fibonacci(i) + ", ");
                }
            }
        }
        input.close();
    }
}