/*
*  Created by Meghan McBee
*  Last Update: May 21, 2017
*/

public class StrCompare {


    // Compares two strings lexographically
    public static int lexCompare(String str1, String str2)
    {
        return str1.compareTo(str2);
    }


    // Compares length of two given strings
    public static int strCompare(String str1, String str2)
    {    
        int strlen1 = str1.length();
        int strlen2 = str2.length();

        if(strlen1 < strlen2){
            return -1;
        } else if(strlen1 > strlen2) {
            return 1;
        } else {
            return 0;
        }
    }

}

