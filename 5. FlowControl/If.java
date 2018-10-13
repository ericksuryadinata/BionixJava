class If{
    
    public static void main(String[] args) {
        
        // disini kita akan membahas tentang conditional if
        // ada 2 bentuk if 

        if(condition){
            //code
        }

        // atau 

        if(condition) total  = a+b;

        // sebagai contoh

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        // kira - kira outputnya apa yak ??? 
        // POST DIGRUP UY KALO PAHAM :v
        // If jawabannya [JAWABANMU] :v, kayak SMS bae :v

        // diambil dari https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
    }
}