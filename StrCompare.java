
public class StrCompare {

    // Compares length of two given strings
    public static int lexCompare(String string1, String string2)
    {    
        int strlen1 = string1.length();
        int strlen2 = string2.length();

        if(strlen1 < strlen2){
            return -1;
        } else if(strlen1 > strlen2) {
            return 1;
        } else {
            return 0;
        }
    }

}

