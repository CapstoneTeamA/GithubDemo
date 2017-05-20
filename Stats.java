import java.math.BigInteger;
import java.lang.IllegalArgumentException;
public class Stats{
	public static int pow(int base, int exp) throws IllegalArgumentException
	{
		int power = 1;
		if (exp < 0)
		{
			throw new IllegalArgumentException("Cant take negative exponents.");
		}
		for (int i = 0; i < exp; i++)
		{
			power *= base;
		}
		return power;
	}

	public static BigInteger factorial(int n) throws IllegalArgumentException

	{
		BigInteger fact = BigInteger.ONE;
		if (n < 0)
		{
			throw new IllegalArgumentException("No factorial for negative numbers.");
		}
		for (int i = n; i > 1; i--)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	//In math n and k are the default arguments to the choose function
	public static int choose(int n, int k)
	{
		BigInteger nCk = Stats.factorial(n);
		nCk = nCk.divide(Stats.factorial(k).multiply(factorial(n-k)));
		return nCk.intValue();
	}

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
		int nCx = Stats.choose(n,x);
		double pPowX = Math.pow(p,x);
		double pPrimePowX = Math.pow(1-p,n-x);
		//System.out.println("nCx(30,6) = " + nCx + " .23^6 = " + pPowX + " pPrimePowX (1-p)^n-x = " + pPrimePowX);
		return nCx * pPowX * pPrimePowX;
	}

	public static double binDistCdf(int x,int n, double p) throws IllegalArgumentException
	{
		double binDistCumulative = 0;
		for (int i = 0; i <= x; i++)
		{
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
