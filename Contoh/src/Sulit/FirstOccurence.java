package Sulit;

import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class FirstOccurence {
    // diambil dari pertanyaan masuk ke google :v
    // disini kita disuruh untuk mencari kata pertama yang muncul dari list kata
    // yang diberikan
    
    public static void main(String[] args){
        String kalimat = "Ini merupakan kalimat";
        HashSet<Character> hashSet = new HashSet<>();
        
        char[] arrayKalimat = kalimat.toCharArray();
        
        for (int i = 0; i < arrayKalimat.length; i++) {
            char c = arrayKalimat[i];
            if(hashSet.contains(c)){
                System.out.println("First Repeated Char = " + c);
                break;
            }else{
                hashSet.add(c);
            }
        }
        
    }
}
