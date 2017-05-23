public class Main{
    
    public static void main(String args[])
    {
        System.out.println("running demo");
        
        // Simple testing functions
        testMathClass();
        testStrCompare();
    }


    /* This method runs a few primitive test cases for the 
    *  Math.class library. 
    */
    private static void testMathClass () {
        System.out.println("2^0 = " + Math.pow(2, 0));
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.print("2^(-15) = " );
        try {
            System.out.println(Math.pow(2, -15));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }
    
    // Basic tests for StrCompare class
    private static void testStrCompare() 
    {
        String str1 = "banana";
        String str2 = "apples";

        System.out.println(str1 + " > " + str2 + ", should return 1: " 
                           + StrCompare.lexCompare(str1,str2));
        System.out.println(str2 + " < " + str1 + ", should return -1: " 
                           + StrCompare.lexCompare(str2,str1));
        System.out.println(str1 + " = " + str1 + ", should return 0: "
                           + StrCompare.lexCompare(str1,str1));
    }

}
