class Array{

    public static void main(String[] args) {
        
        // yak ini merupakan pelajaran yang agak saya gak suka :v
        // tapi tenang array ini bakal banyak berfungsi nanti
        // array itu bisa diibaratkan dengan sebuah ruang / kamar / loker
        // jadi dalam setiap ruang tersebut bisa diisi dengan suatu tipe data
        // ada beberapa cara untuk melakukan inisialisasi array
        // tapi cara ini yang lebih disarankan

        int[] suatuArray = new int[2];

        // kode diatas bisa dijelaskan jika kita membuat array dengan nama suatuArray
        // array tersebut diisi dengan tipe data integer sebanyak 2
        // untuk ngisi array tersebut

        suatuArray[0] = 1;
        suatuArray[1] = 2;

        // array dimulai dari index ke 0, selalu ingat itu
        // jika kita anggap dengan kamar, maka nomor kamarnya dimulai dengan angka 0

        // kalau kita print array tersebut
        System.out.println("Element at index 0: " + anArray[0]); // output 1
        System.out.println("Element at index 1: " + anArray[1]); // output 2

        // atau selain dengan cara tersebut juga bisa dengan (ini juga disarankan)
        int[] arrayLain = {1,2};

        // terdapat perbedaan dengan yang atas, yaitu kita tidak perlu mengalokasikan memory ke array tersebut

        // ya saya rasa cukup untuk materi array, lebih lengkapnya ada di
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

    }
}