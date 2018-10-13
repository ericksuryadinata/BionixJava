/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        // switch case ini lebih spesifik ke kasus tertentu
        // karena didalam switch seinget saya gak bisa dikasih conditional
        // alasannya karena ini
        // Deciding whether to use if-then-else statements or a switch statement is based 
        // on readability and the expression that the statement is testing. 
        // An if-then-else statement can test expressions based on ranges of values or conditions, 
        // whereas a switch statement tests expressions based only on a single integer, 
        // enumerated value, or String object.

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
        // kira - kira outputnya apa yak :v ???
        // seperti biasa kirim aja ke group :v wwkkw

        // hmm itu kalau integer, kalo string gimana ??

        // sebenernya sama ae :v
        String kalimat = "d";
        switch (kalimat) {
            case "a":  response = 100;
                     break;
            case "b":  response = 200;
                     break;
            case "c":  response = 300;
                     break;
            default: response = "gblk sia :v";
                     break;
        }
        System.out.println(response);
        // kira kira responsenya apa ???
        // share group yak :v
    }
}