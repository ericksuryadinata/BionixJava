/**
 * whiledowhile
 */
public class whiledowhile {

    public static void main(String[] args) {
        
        int a = 1;
        if(a == 2){
            System.out.println("metode1 : a tidak 2");
        }else if(a == 1){
            System.out.println("metode1 : a sama dengan 1");
        }else{
            System.out.println("metode1 : anu");
        }

        if(a == 2){
            System.out.println("metode2 : a tidak 2");
        }else{
            if(a == 1){
                System.out.println("metode2 : a sama dengan 1");
            }else{
                System.out.println("metode2 : anu");
            }
        }
        
    }
}