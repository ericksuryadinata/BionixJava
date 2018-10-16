/**
 * BubbleSort
 */
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {
        int[] deret={6,3,4,5,2,1};
        int tmp;
        System.out.println("Sebelum di sorting");
        for (int i = 0; i < deret.length; i++) {
            System.out.print(deret[i]+" ");
        }

        // bubble sort
        for (int i = 0; i < deret.length; i++) {
            System.out.println("\nIterasi ke- "+i+"\n");
            for (int j = 0; j < deret.length - 1; j++) {
                if(deret[j] > deret[j + 1]){
                    tmp = deret[j];
                    deret[j] = deret[j+1];
                    deret[j+1] = tmp;    
                }
                for (int k = 0; k < deret.length - 1; k++) {
                    System.out.print(deret[k] + " ");
                }
            }
        }

        System.out.println("\nSetelah di sorting");
        for (int i = 0; i < deret.length; i++) {
            System.out.print(deret[i]+" ");
        }
        Arrays.sort(deret);
        System.out.println("\nGAK PAKE BUBBLE SORT");
        System.out.println(Arrays.toString(deret));
    }
}