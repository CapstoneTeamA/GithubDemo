import java.math.BigInteger;
import java.lang.Math;
import java.lang.IllegalArgumentException;
public class Stats{
	//some constats that may be used in the future
	public static final float PI = 3.14159f;
	public static final float E = 2.71828f;
	public static final float ROOT2 = 1.41421f;

	//multiply n by n-1 by n-2 by ... by 2
	public static BigInteger factorial(int n) throws IllegalArgumentException
	{
		BigInteger fact = BigInteger.ONE;
		if (n < 0)
		{
			throw new IllegalArgumentException("Negative Number error.");
		}
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
		BigInteger nChooseK = Stats.factorial(n);
		nChooseK = nChooseK.divide(Stats.factorial(k).multiply(factorial(n-k)));
		return nChooseK.intValue();
	}

	//Probability there are x successful events after n total events and probability of success in an event is p
	public static double binDistPmf(int successes, int trials, double successProb) throws IllegalArgumentException
	{
		if (!(successProb <= 1 &&  successProb >= 0))
		{
			throw new IllegalArgumentException("successProb not in range (0,1)");
		}
		if (trials < successes)
		{	
			throw new IllegalArgumentException("trials cannot be less than successes");
		}
		if (trials <=0 || successes < 0)
		{
			throw new IllegalArgumentException("trials must be greater than 0 and successes must not be negative.");
		}

		int trialsChooseSuccesses = Stats.choose(trials,successes);
		double probPowSuccesses = java.lang.Math.pow(successProb,successes);
		double probPrimePowFailures = java.lang.Math.pow(1-successProb,trials-successes);
		return trialsChooseSuccesses * probPowSuccesses * probPrimePowFailures;
	}

	//Prob there are 1,2,...,x successful events after n events where prob of success is p
    	public static double binDistCdf(int successes, int trials, double successProb) throws IllegalArgumentException
    	{
		double binDistCumulative = 0;
		for (int i = 0; i <= successes; i++)
		{
			binDistCumulative += Stats.binDistPmf(i,trials,successProb);
		}
		return binDistCumulative;
	} 
	
	//A battery of tests to show the methods are working correctly.
	public static void statsBattery()
	{
		System.out.println("5! = " + Stats.factorial(5).intValue());
		System.out.println("8 Choose 3 = " + Stats.choose(8,3));
		System.out.println("Binomial Distribution pmf b(7,23,.23) = " + Stats.binDistPmf(7,23,.23));
		System.out.println("Binomial Distribution cdf B(7,20,.25) = " + Stats.binDistCdf(7,20,.25));
	}
}
