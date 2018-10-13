class SatuDimensi{
    public static void main(String[] args) {
        int[] satuDimensi = {1,2,3,4,5};
        for (int i = 0; i < satuDimensi.length; i++) {
            System.out.println(satuDimensi[i]);
        }

        for (int element : satuDimensi) {
            System.out.println(element);
        }

        // apakah bisa menggunakan perulangan lainnya ? yasss bisa, tapi tidak disarankan
        // karena perulangan lainnya ada batasannya

        
    }
}