/**
 * ESB
 */
public class ESB {

    public static void main(String[] args) {
        // apalagi ini ESB :v,
        // merupakan singkatan dari expression, statement, and Blocks
        
        // EXPRESSIONS
        // yap ini semua tentang ekspresi doang :v
        // ekspresi merupakan sekumpulan dari variabel, operator atau method invocations (gak ngerti artinya :v)
        // contoh
        int anu = 0; // -> ini ekspresi

        // STATEMENT
        // ada 4 statement 
        // assignment statement ->  nilai = 20
        // yang menggunakan ++ atau -- -> nilai ++
        // method invocations -> System.out.println("Hello World!");
        // object creation expressions -> Bicycle myBike = new Bicycle();

        // BLOCKS
        // ini akan membahas bagian - bagian dari setiap syntax, seperti

        // IF ELSE
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2

        switch (key) { // block switch
            case value:
                // code
                break;

            case value:
                // code
                break;
            default:
                break;
        } // end block switch

        // setiap block diawali dengan { dan diakhiri dengan }
        // tapi tidak semuanya pasti begitu, 
        // contoh
        if(a == b) total = a + b;
        // ini merupakan contoh dari satu one line if
        // sehingga satu block merupakan bagian dari if itu sendiri

        
    }
}