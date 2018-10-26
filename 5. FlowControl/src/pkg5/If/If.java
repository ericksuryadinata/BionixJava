/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.If;

/**
 *
 * @author erick
 */
public class If{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // WARNING
        // THIS FILE IS NOT RUNNABLE!!
        
        // disini kita akan membahas tentang conditional if
        // ada 2 bentuk if 

        if(condition){
            //code
        }

        // atau 

        if(condition) /* code */ ;
        
        // untuk multi if bisa menggunakan else ataupun else if
        
        if(condition){
            // jika memenuhi dieksekusi disini
        }else{
            // jika tidak akan dieksekusi disini
        }
        
        if(condition){
            // jika memenuhi akan dieksekusi disini
        }else if(anotherCondition){
            // jika tidak memenuhi kondisi pertama akan dieksekusi disini
        }else{
            // jika semua tidak memenuhi akan dieksekusi disini
        }

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
