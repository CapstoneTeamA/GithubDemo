import java.math.BigInteger;
import java.lang.IllegalArgumentException;
public class Stats{
	//some constats that may be used in the future
	private static final float pi = 3.14159f;
	private static final float e = 2.71828f;
	private static final float rt2 = 1.41421f;

	public static final float getPi()
	{
		return Stats.pi;
	}
	public static final float getE()
	{
		return Stats.e;
	}
	public static final float getRt2()
	{
		return Stats.rt2;
	}

	//multiply n by n-1 by n-2 by ... by 2
	public static BigInteger factorial(int n) throws IllegalArgumentException

	{
		BigInteger fact = BigInteger.ONE;
		if (n < 0)
		{
			throw new IllegalArgumentException("Negative Number error.");
		}
		//for(int i = 0; i < n; i++)
		for (int i = n; i > 1; i--)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	//In math n and k are the default arguments to the choose function
	//how many way with n things can I choose k items
	public static int choose(int n, int k)
	{
		BigInteger nCk = Stats.factorial(n);
		nCk = nCk.divide(Stats.factorial(k).multiply(factorial(n-k)));
		return nCk.intValue();
	}

	//Probability there are x successful events after n total events and probability of success in an event is p
	public static double binDistPmf(int x,int n, double p) throws IllegalArgumentException
	{
		if (!(p <= 1 && p >= 0))
		{
			throw new IllegalArgumentException("Prob not in range (0,1)");
		}
		if (n < x)
		{	
			throw new IllegalArgumentException("n cannot be less than x");
		}
		if (n <=0 || x < 0)
		{
			throw new IllegalArgumentException("n must be greater than 0 and x must not be negative.");
		}
		int a = Stats.choose(n,x);
		double b = Math.pow(p,x);
		double c = Math.pow(1-p,n-x);
		//System.out.println("nCx(30,6) = " + nCx + " .23^6 = " + pPowX + " pPrimePowX (1-p)^n-x = " + pPrimePowX);
		return a * b * c;

	}

	//Prob there are 1,2,...,x successful events after n events where prob of success is p
	public static double binDistCdf(int x,int n, double p) throws IllegalArgumentException{
		double binDistCumulative = 0;
		for (int i = 0; i <= x; i++){
			binDistCumulative += Stats.binDistPmf(i,n,p);
		}
		return binDistCumulative;
	}

	public static void statsBattery()
	{
		System.out.println("5! = " + Stats.factorial(5).intValue());
		System.out.println("8 Choose 3 = " + Stats.choose(8,3));
		System.out.println("Binomial Distribution pmf b(7,23,.23) = " + Stats.binDistPmf(7,23,.23));
		System.out.println("Binomial Distribution cdf B(7,20,.25) = " + Stats.binDistCdf(7,20,.25));
	}
}
