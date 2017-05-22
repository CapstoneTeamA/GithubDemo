public class Main{
    public static void main(String args[])
    {
        System.out.println("running demo");
        testMathClass();
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
}
