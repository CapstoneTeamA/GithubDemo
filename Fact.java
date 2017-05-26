public class Fact{
	public static int fact(int num)
	{
		if (num == 1 || num == 0)
			return 1;
		else if (num < 0)
		{
			return -1;
		}
		return num * fact(num - 1);
	}
}
