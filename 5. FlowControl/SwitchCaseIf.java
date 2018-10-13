class SwitchCaseIf{
    
    public static void main(String[] args) {
        int angka = 2;
        System.out.println("Flow Control Pertama");
        System.out.println("PERCABANGAN");
        // Jadi ada dua cara untuk percabangan
        // If dan switch
        // If digunakan untuk penggunaan yang sangat kompleks
        // Switch digunakan untuk sesuatu yang spesifik
        
        int cek = angka % 2;
        
        System.out.println("PERCABANGAN IF");
        if(cek == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }

        System.out.println("PERCABANGAN SWITCH");
        switch (cek) {
            case 0:
                System.out.println("Genap");
                break;
            case 1:
                System.out.println("Ganjil");
            default:
                break;
        }

    }
}