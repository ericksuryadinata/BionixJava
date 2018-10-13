class Looping{
    public static void main(String[] args) {
        // ada 4 looping
        // 1. for
        // 2. do.. while
        // 3. while
        // 4. foreach
        int doNumber = 0;
        int whileNumber = 0;
        System.out.println("FOR");
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            // output
            // 01234
        }

        System.out.println("DO");
        do {
            System.out.println(doNumber);
            // output
            // 01234 jika doNumber++ dibawah
            // 1234 jika doNumber++ diatas
            doNumber++;
        } while (doNumber < 5);

        System.out.println("WHILE");
        while (whileNumber < 5) {
            System.out.println(whileNumber);
            // output
            // 01234 jika whileNumber++ dibawah
            // 1234 jika whileNumber++ diatas
            whileNumber++;
        }

        // increment
        // 1. pre-increment / pre-decrement = dijumlahkan atau dikurangkan sebelum sesuatu
        // 2. post-increment / post-decrement = dijumlahkan atau dikurangkan setelah sesuatu
        // ini agak susah kalau cuma dibayangkan :V kalau kalian bisa ini hanya dengan
        // membayangkan, termasuk kalian GG :D

        // contoh
        // baris aritmatika dengan selisih 2
        int batas = 10;
        for (int i = 1; i < batas; i+=2) {
            System.out.println(i + ", ");
        }
    }
}