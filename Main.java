public class Main{
	public static void main(String args[])
	{
		System.out.println("running demo");
	
		testStrCompare();

        }

        private static void testStrCompare() 
        {
            String str1 = "banana";
            String str2 = "apples";

            System.out.println(str1 + " > " + str2 + ", should return 1: " + StrCompare.lexCompare(str1,str2));
            System.out.println(str2 + " < " + str1 + ", should return -1: " + StrCompare.lexCompare(str2,str1));
            System.out.println(str1 + " = " + str1 + ", should return 0: " + StrCompare.lexCompare(str1,str1));
        }
}
